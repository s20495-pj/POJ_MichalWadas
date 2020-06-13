package Zjazd7.EX07_02.Repository;

import Zjazd7.EX07_02.Model.Auction.Auction;
import Zjazd7.EX07_02.Model.User.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * summary: Implement exercise 07_02: Auction Repository
 * author: Michal Wadas
 **/
public class AuctionRepository {
    List<Auction> auctions = new ArrayList<>();

    public List<Auction> getAuctions() {
        return auctions;
    }


    public void addRound() {
        auctions.forEach(Auction::addLifeSpan);

    }

    public List<Auction> getAuctionsForUser(String login) {
        return auctions.stream()
                .filter(auction ->
                        login.equals(auction.getCreator().getLogin()))
                .collect(Collectors.toList());
    }

    public void addAuction(Auction newAuction) {
        auctions.add(newAuction);
    }

    public Optional<Auction> findAuctionByName(String auctionName) {
        return auctions.stream().filter(auction -> auctionName.equals(auction.getAuctionName())).findFirst();
    }

    public Map<Auction, User> checkForFinishedAuctions() {
        Map<Auction, User> result = new HashMap<>();

        ListIterator<Auction> iterator = auctions.listIterator();
        while(iterator.hasNext()) {
            Auction auction = iterator.next();
            if(auction.isFinished()) {
                result.put(auction, auction.getLastBider());
                iterator.remove();
            }
        }

        return result;
    }
}
