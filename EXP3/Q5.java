import java.util.Scanner;

public class Q5 {
    private String date;
    private String startTime;
    private String endTime;

    public Q5(String date, String startTime, String endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static void main(String[] args) {
        // Create an array to store the bookings
        Q5[] bookings = new Q5[10];
        Scanner input = new Scanner(System.in);

        // Menu system
        while (true) {
            input.nextLine();
            System.out.println("1. Book the conference room");
            System.out.println("2. Check availability of the conference room");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter date, start time, end time to book the conference room:");
                    String bookDate = input.next();
                    String bookStartTime = input.next();
                    String bookEndTime = input.next();
                    // Find an empty slot in the array to store the booking
                    for (int i = 0; i < bookings.length; i++) {
                        if (bookings[i] == null) {
                            bookings[i] = new Q5(bookDate, bookStartTime, bookEndTime);
                            System.out.println("The conference room has been booked.");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter date, start time, and end time to check the availability of the conference room:");
                    String checkDate = input.next();
                    String checkStartTime = input.next();
                    String checkEndTime = input.next();
                    boolean available = true;
                    for (Q5 booking : bookings) {
                        if (booking != null && booking.date.equals(checkDate)) {
                            if ((checkStartTime.compareTo(booking.endTime) < 0) && (checkEndTime.compareTo(booking.startTime) > 0)) {
                                available = false;
                                break;
                            }
                        }
                    }
                    if (available) {
                        System.out.println("The room is available for booking at that time.");
                    } else {
                        System.out.println("The room is not available for booking at that time.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}