package Zjazd7.EX07_01.Service;

import Zjazd7.EX07_01.RouteInfo;
import Zjazd7.EX07_01.TicketInfo;
import Zjazd7.EX07_01.ba.BATicket;
import Zjazd7.EX07_01.ba.BATicketService;
import Zjazd7.EX07_01.ua.UATicketInfo;
import Zjazd7.EX07_01.ua.UATicketService;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * summary: Implement exercise 07_01: Service
 * author: Michal Wadas
 **/
public class Service {

    private UATicketService uaTicketService;
    private BATicketService baTicketService;
    private Airport airport;

    public List<RouteInfo> getTicketInfo(String from, String to, Date when) {

        List<RouteInfo> result = new ArrayList<>();

        List<UATicketInfo> uaTicketInfoList = uaTicketService.getTicketInfo(from, to, when);

        List<TicketInfo> oneRouteInfo = uaTicketInfoList.stream().map(TicketInfo::fromUATicketInfo).collect(Collectors.toList());

        RouteInfo uaRouteInfo = new RouteInfo(oneRouteInfo);
        result.add(uaRouteInfo);

        Airport fromAirport = new Airport();
        Airport toAirport = new Airport();

        fromAirport.airportCode = from;
        toAirport.airportCode = to;

        List<BATicket> baTicketList = baTicketService.getTicketInfo(fromAirport, toAirport, when);
        List<TicketInfo> oneTicketInfo = baTicketList.stream().map(TicketInfo::fromBATicketInfo).collect(Collectors.toList());

        RouteInfo baRouteInfo = new RouteInfo(oneTicketInfo);
        result.add(baRouteInfo);

        // list of all routs from all services
        return result;
    }

    public List<RouteInfo> sortByPrice(List<RouteInfo> sortedByPriceList) {

        sortedByPriceList.sort(Comparator.comparing(RouteInfo::getPrice));
        return sortedByPriceList;
    }

    public List<RouteInfo> sortByNumberOfConnectingFlights(List<RouteInfo> sortedByLengthList) {

        sortedByLengthList.sort(Comparator.comparing(RouteInfo::getNumberOfConnectingFlights));
        return sortedByLengthList;
    }

    public void sortByLengthOfFlight() {
    }

    public List<RouteInfo> filterByPrice(List<RouteInfo> sortedByPriceList, double filterPrice) {
        return sortedByPriceList.stream()
                .filter(routeInfo -> routeInfo.getPrice() < filterPrice).collect(Collectors.toList());
    }

    public List<RouteInfo> filterByNumberOfConnectingFlights(List<RouteInfo> sortedByLengthList, int filterNumber) {
        return sortedByLengthList.stream()
                .filter(routeInfo -> routeInfo.getNumberOfConnectingFlights() < filterNumber).collect(Collectors.toList());
    }

    public void setUaTicketService(UATicketService uaTicketService) {
        this.uaTicketService = uaTicketService;
    }

    public void setBaTicketService(BATicketService baTicketService) {
        this.baTicketService = baTicketService;
    }

    //todo sort and filter by date
    //Not enough information about fly time in exercise
}
