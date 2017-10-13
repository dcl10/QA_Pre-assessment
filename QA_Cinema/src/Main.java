import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declare a list to store the tickets
        ArrayList<Ticket> ticketList = new ArrayList<>();
        // Read the user input
        Scanner scanner = new Scanner(System.in);
        // Flag to signal whether to ask for more tickets or add up the cost
        boolean addTickets = true;
        // Get today's date
        Date today = Calendar.getInstance().getTime();

        /*
        * Main loop:
        * First present the user with their choices;
        * second determine their choice and add the appropriate ticket to the list;
        * third ask if they are done ordering tickets.
        * If they are done, iterate through the list and add up the prices.
        * If it is Wednesday, take 2 for every ticket in the list off the price.
        * Show the total price.
        */
        while (addTickets) {
            System.out.println("Select which ticket you wish to purchase." + System.lineSeparator()
                + "Standard: s; OAP: o; Child: c; Student: u");
            String choice = scanner.nextLine().toLowerCase();
            switch (choice) {
                case "s" : ticketList.add(new StandardTicket()); break;
                case "o" : ticketList.add(new OAPTicket()); break;
                case "c" : ticketList.add(new ChildTicket()); break;
                case "u" : ticketList.add(new StudentTicket()); break;
                default: System.out.println("Invalid option selected."); break;
            }
            System.out.println("Have you finished ordering? (Y/N)");
            choice = scanner.nextLine().toUpperCase();
            if (choice.equals("Y")) addTickets = false;
        }

        int sum = 0;
        for (Ticket t : ticketList) sum += t.getPrice();
        if (today.toString().matches("Wed")) sum -= 2*ticketList.size();
        System.out.println("Your total is: £" + sum);
    }
}
