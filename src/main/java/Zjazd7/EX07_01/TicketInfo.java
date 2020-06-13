package Zjazd7.EX07_01;

import Zjazd7.EX07_01.ba.BATicket;
import Zjazd7.EX07_01.ua.UATicketInfo;

import java.sql.Date;

/**
 * summary: Implement exercise 07_01: Ticket Info
 * author: Michal Wadas
 **/
public class TicketInfo {

    private String from;
    private String to;
    private Date dateTime;
    private double price;

    public static TicketInfo fromUATicketInfo(UATicketInfo uaTicketInfo){

        TicketInfo ticketInfo = new TicketInfo();

        return ticketInfo;
    }

    public static TicketInfo fromBATicketInfo(BATicket baTicket){

        TicketInfo ticketInfo = new TicketInfo();

        return ticketInfo;
    }

    public TicketInfo() {
    }

    public TicketInfo(String from, String to, Date dateTime) {
        this.from = from;
        this.to = to;
        this.dateTime = dateTime;
    }

    public TicketInfo(String from, String to, Date dateTime, double price) {
        this.from = from;
        this.to = to;
        this.dateTime = dateTime;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TicketInfo{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", dateTime=" + dateTime +
                ", price=" + price +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
