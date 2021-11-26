package assignment.core;

import assignment.support.Order;

import java.util.Date;

public class InRestrOrder extends Order {
    public int tableNumber;
    public Booking bookingOrder;

    /**
     * Empty Constructor
     */
    public InRestrOrder(){
        orderID++;
        this.bookingOrder = new Booking();
    }

    /**
     * Constructor with order variables + InTestOrder variables
     * @param tableNumber
     * @param bookingOrder
     * @param orderDate
     * @param orderDetails
     * @param extraNotes
     */
    public InRestrOrder(int tableNumber, Booking bookingOrder, Date orderDate, String orderDetails, String extraNotes){
        this.tableNumber = tableNumber;
        this.bookingOrder = bookingOrder;
        this.bookingOrder = new Booking();
        orderID++;
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.extraNotes = extraNotes;
    }

    /**
     * Constructor with order variables + InTestOrder variables - bookingOrder
     * @param tableNumber
     * @param orderDate
     * @param orderDetails
     * @param extraNotes
     */
    public InRestrOrder(int tableNumber, Date orderDate, String orderDetails, String extraNotes){
        this.tableNumber = tableNumber;
        this.bookingOrder = new Booking();
        orderID++;
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.extraNotes = extraNotes;
    }

    /**
     * getters and setters
     * @return
     */
    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Booking getBookingOrder() {
        return bookingOrder;
    }

    public void setBookingOrder(Booking bookingOrder) {
        this.bookingOrder = bookingOrder;
    }

    /**
     * Interface method of payment
     */
    @Override
    public void processPayment(){
        System.out.println("InRestOrder");
    }
}
