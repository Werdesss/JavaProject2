package assignment.core;

import assignment.support.Order;
import java.util.Date;

public class OnlineOrder extends Order {
    public String paymentType;
    public Junior deliveredBy;

    /**
     * Empty Constructor
     */
    public OnlineOrder(){
        orderID++;
        this.deliveredBy = new Junior();
    }

    /**
     * Constructor with order+onlineOrders variables
     * @param paymentType
     * @param deliveredBy
     * @param orderDate
     * @param orderDetails
     * @param extraNotes
     */
    public OnlineOrder(String paymentType, Junior deliveredBy, Date orderDate, String orderDetails, String extraNotes){
        orderID++;
        this.deliveredBy = new Junior();
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.extraNotes = extraNotes;
        this.paymentType = paymentType;
        this.deliveredBy = deliveredBy;
    }

    /**
     * Constructor with order+onlineOrders variables - deliveredby
     * @param paymentType
     * @param orderDate
     * @param orderDetails
     * @param extraNotes
     */
    public OnlineOrder(String paymentType, Date orderDate, String orderDetails, String extraNotes){
        orderID++;
        this.deliveredBy = new Junior();
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.extraNotes = extraNotes;
        this.paymentType = paymentType;
    }


    /**
     * getters and setters
     * @return
     */
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Junior getDeliveredBy() {
        return deliveredBy;
    }

    public void setDeliveredBy(Junior deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    /**
     * Interface method for Payment
     */
    @Override
    public void processPayment(){ System.out.println("OnlineOrder");}
}
