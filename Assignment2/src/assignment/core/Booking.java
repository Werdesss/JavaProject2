package assignment.core;

import java.util.Date;

public class Booking {
    private Date bookingDate;
    private static int bookingID = 0;

    /**
     * Empty constructor
     */
    public Booking(){
        bookingID++;
        bookingDate = new Date();
    }

    /**
     * Constructor
     * @param bookingDate
     */
    public Booking(Date bookingDate){
        this.bookingDate = bookingDate;
        bookingID++;
    }

    /**
     * Getter and setters for variables
     * @return
     */
    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        Booking.bookingID = bookingID;
    }
}
