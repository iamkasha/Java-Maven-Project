package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TicketBooking {

    int tickets = 100;

     synchronized public void giveTickets(int ticketCount){
        if(ticketCount < tickets) {
            System.out.println(Thread.currentThread().getName() + " is here");
            tickets = tickets - ticketCount;
            System.out.println("Given tickets to:" + Thread.currentThread().getName() + " " + ticketCount);
            System.out.println("Tickets remaining: " + tickets);
        }
        else {
            System.out.println("Out of tickets");
        }
    }

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(5);
        TicketBooking tobj1 = new TicketBooking();
        for (int i=0; i<5; i++){
            ex.submit(new Runnable() {
                public void run() {
                    tobj1.giveTickets(20);
                }
            });
        }
    }


}





