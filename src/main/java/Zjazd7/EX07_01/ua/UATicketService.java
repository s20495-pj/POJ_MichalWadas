package Zjazd7.EX07_01.ua;

import java.sql.Date;
import java.util.List;

/**
 * summary: Implement exercise 07_01: United Airlines Ticket Service
 * author: Michal Wadas
 **/
public interface UATicketService {
    List<UATicketInfo> getTicketInfo(String from, String to,
                                     Date when);
}