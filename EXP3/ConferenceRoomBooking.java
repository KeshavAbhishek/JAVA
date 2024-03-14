import java.util.Scanner;

public class ConferenceRoomBooking {
    public String date;
    public String startTime;
    public String endTime;

    public ConferenceRoomBooking(String date, String startTime, String endTime, String bookedBy) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static void main(String[] args) {
        // Create an array to store the bookings
        ConferenceRoomBooking[] bookings = new ConferenceRoomBooking[10];
        Scanner input = new Scanner(System.in);

        // Example: Book the conference room
        System.out.println("Enter date, start time, end time, and your name to book the conference room:");
        String bookDate = input.next();
        String bookStartTime = input.next();
        String bookEndTime = input.next();
        String bookName = input.next();
        bookings[0] = new ConferenceRoomBooking(bookDate, bookStartTime, bookEndTime, bookName);

        // Example: Check availability
        System.out.println("Enter date, start time, and end time to check the availability of the conference room:");
        String checkDate = input.next();
        String checkStartTime = input.next();
        String checkEndTime = input.next();
        boolean available = true;
        input.close();
        for (ConferenceRoomBooking booking : bookings) {
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
    }
}