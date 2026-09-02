
/* Scenario: An online ticket booking system allows multiple customers to book seats simultaneously. Each booking request should execute in a separate thread. 
(a) Create a class TicketBooking containing a method bookTicket(String customerName). [2] 
(b) Create multiple threads representing different customers. [2] 
(c) Use synchronization to ensure that two customers cannot book the same seat simultaneously. [4] 
(d) Display the customer name and booking status. [2]  */
class TicketBooking extends Thread {
    String customerName;
    boolean isBooked = false;

    synchronized void bookTicket(String customerName) {
        if (!isBooked) {
            System.out.println("Ticket booked successfully for " + customerName);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            isBooked = true; // After Ram books the ticket, you must change it: Otherwise, both Ram and Shyam
                             // could get Ticket booked successfully
        }

        else {
            System.out.println("Sorry " + customerName + ", ticket is already booked.");
        }
    }

    public void run() {
        bookTicket(this.customerName);
    }
}

public class onlineBooking {
    public static void main(String[] args) {

        // Code for online booking system
        TicketBooking obj = new TicketBooking();

        // in this way...each one can book ticekt without calling thread.
        /*
         * TicketBooking t1=new TicketBooking();
         * t1.customerName="Ram";
         * TicketBooking t2=new TicketBooking();
         * t2.customerName="Shyam";
         * TicketBooking t3=new TicketBooking();
         * t3.customerName="Shyam2";
         */
        Thread th1 = new Thread(() -> obj.bookTicket("Ram"));
        Thread th2 = new Thread(() -> obj.bookTicket("Shayam"));
        Thread th3 = new Thread(() -> obj.bookTicket("Vivek"));
        th1.start();
        th2.start();
        th3.start();
    }
}