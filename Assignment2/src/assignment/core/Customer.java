package assignment.core;
import assignment.support.Order;
import assignment.support.Person;

import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person {
    private Date registrationDate;
    private ArrayList<Order> orders;
    private ArrayList<Booking> bookings;
    private String creditCardDetails;

    /**
     * Empty Constructor
     */
    public Customer(){
        this.registrationDate = new Date();
        this.bookings = new ArrayList<Booking>();
        this.orders = new ArrayList<Order>();
    }

    /**
     * Constructor with variables of Customer
     * @param ID
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param registrationDate
     * @param creditCardDetails
     */
    public Customer(int ID, String name, char gender, Date dateOfBirth, Date registrationDate, String creditCardDetails){
        this.bookings = new ArrayList<Booking>();
        this.orders = new ArrayList<Order>();
        this.registrationDate = registrationDate;
        this.creditCardDetails = creditCardDetails;
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter and setters for variables
     * @return
     */
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCreditCardDetails() {
        return creditCardDetails;
    }

    public void setCreditCardDetails(String creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    /**
     * To make a booking
     * @param booking booking class to add it to arraylist
     */
    public void makeBooking(Booking booking){
        this.bookings.add(booking);
    }

    /**
     * To make a booking
     * @param order order class to add it to arraylist
     */
    public void makeOrder(Order order) { this.orders.add(order);}
}
