package Zjazd7.EX07_02.Service;

import Zjazd7.EX07_02.Model.Auction.Auction;
import Zjazd7.EX07_02.Model.User.User;
import Zjazd7.EX07_02.Repository.AuctionRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * summary: Implement exercise 07_02: Auction Service
 * author: Michal Wadas
 **/
public class AuctionService {
    private AuctionRepository activeAuctions;
    private AuctionRepository finishedAuctions;

    public List<Auction> getActiveAuctions() {
        return activeAuctions.getAuctions();
    }

    public List<Auction> getFinishedAuctions() {
        return finishedAuctions.getAuctions();
    }

    public List<Auction> getAuctionsForUserByLogin(String login) {
        List<Auction> result = new ArrayList<>();
        result.addAll(activeAuctions.getAuctionsForUser(login));
        result.addAll(finishedAuctions.getAuctionsForUser(login));
        return result;
    }

    public void nextRound() {
        activeAuctions.addRound();
        Map<Auction, User> finishedAuctionsMap = activeAuctions.checkForFinishedAuctions();
        finishedAuctionsMap.forEach((finishedAuction, user) -> finishedAuctions.addAuction(finishedAuction));
    }

    public Auction createAuction(User creator, String name, double initialPrice, int auctionLength, int minimalTrustPoints) {
        Auction newAuction = new Auction(creator, name, initialPrice, auctionLength, minimalTrustPoints);
        activeAuctions.addAuction(newAuction);
        return newAuction;
    }

    public void addTrustPoint(User from, User to, Auction auction) {
        if(auction.getCreator().equals(from) && auction.getBuyers().contains(to)) {
            to.addTrustPoint();
        }

    }

    public void removeTrustPoint(User from, User to, Auction auction) {
        if(auction.getCreator().equals(from) && auction.getBuyers().contains(to)) {
            to.removeTrustPoint();
        }
    }

    public void bidForAuction(String auctionName, User who, double bidPrice) {
        Optional<Auction> optionalAuction = activeAuctions.findAuctionByName(auctionName);
        if(optionalAuction.isPresent()) {
            Auction auction = optionalAuction.get();
            switch(auction.getAuctionType()) {
                case Expandable:
                    if(auction.addBid(who, bidPrice)) { //if successful then increase max life span
                        auction.increaseMaxLifeSpan();
                    }
                case Reversed:
                    if(auction.addBid(who, bidPrice)) {
                        //TODO: Don't know what the author had in mind
                    }
                case Simple:
                default:
                    auction.addBid(who, bidPrice);
            }
        }
    }
}
