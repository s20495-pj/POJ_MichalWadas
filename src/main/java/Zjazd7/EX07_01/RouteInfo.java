package Zjazd7.EX07_01;

import java.sql.Time;
import java.util.List;

/**
 * summary: Implement exercise 07_01: Route Info
 * author: Michal Wadas
 **/
public class RouteInfo {

    private List<TicketInfo> ticketsFromOneRoute;
    private double price;
    private Time length;
    private int numberOfConnectingFlights;

    public RouteInfo(List<TicketInfo> ticketsFromOneRoute) {
        this.ticketsFromOneRoute = ticketsFromOneRoute;
        this.price = 0;
        ticketsFromOneRoute.forEach(ticketInfo -> this.price += ticketInfo.getPrice());
        this.length = length;
        this.numberOfConnectingFlights = ticketsFromOneRoute.size();
    }

    public double getPrice(){
        return price;
    }

    public Time getLength() {
        return length;
    }

    public int getNumberOfConnectingFlights() {
        return numberOfConnectingFlights;
    }
    
}
