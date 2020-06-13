package Zjazd7.EX07_01.ba;

import Zjazd7.EX07_01.Service.Airport;

import java.sql.Date;
import java.util.List;

/**
 * summary: Implement exercise 07_01: British Airways Ticket Service
 * author: Michal Wadas
 **/
public interface BATicketService {
    List<BATicket> getTicketInfo(Airport from, Airport to, Date
            when);
}
