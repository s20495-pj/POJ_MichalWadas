package Zjazd7.EX07_02.Model.Auction;

import Zjazd7.EX07_02.Model.Bid;
import Zjazd7.EX07_02.Model.User.User;

import java.util.ArrayList;
import java.util.List;

/**
 * summary: Implement exercise 07_02: Auction
 * author: Michal Wadas
 **/
public class Auction {

    public Auction(User creator, String name, double initialPrice, int auctionLength, int minimalTrustPoints) {
        this.creator = creator;
        this.auctionName = name;
        this.initialPrice = initialPrice;
        this.maxLifeSpan = auctionLength;
        this.minimalTrustPoints = minimalTrustPoints;
        this.auctionType = AuctionType.Simple;
    }

    public User getCreator() {
        return creator;
    }

    private User creator;

    public List<User> getBuyers() {
        return buyers;
    }

    private List<User> buyers;
    private int currentLifeSpan = 0;
    private int maxLifeSpan;
    private int minimalTrustPoints;
    private List<Bid> bids = new ArrayList<>();

    public String getAuctionName() {
        return auctionName;
    }

    private String auctionName;
    private double initialPrice;
    private AuctionType auctionType;

    public void addLifeSpan() {
        this.currentLifeSpan++;
    }

    public void increaseMaxLifeSpan() {
        if(this.auctionType.equals(AuctionType.Expandable)) {
            this.maxLifeSpan++;
        }
    }

    public void setAuctionType(AuctionType auctionType) {
        this.auctionType = auctionType;
    }

    public AuctionType getAuctionType() {
        return auctionType;
    }

    public boolean addBid(User who, double price) {
        if(price < this.initialPrice){
            return false;
        }
        if(!buyers.contains(who)) {
            buyers.add(who);
        }

        if(!bids.isEmpty()) {
            if(bids.get(bids.size() - 1).getPrice() < price) {
                bids.add(new Bid(who, price));
                return true;
            }
            return false;
        } else {
            bids.add(new Bid(who, price));
            return true;
        }
    }

    public boolean isFinished() {
        return currentLifeSpan >= maxLifeSpan;
    }

    public User getLastBider() {
        if(!bids.isEmpty()) {
            return bids.get(bids.size() - 1).getUser();
        }
        return new User();
    }
}
