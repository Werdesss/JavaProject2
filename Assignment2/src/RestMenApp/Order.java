package RestMenApp;

import java.util.Date;


public abstract class Order implements Payment {
    protected static int orderID = 0;
    protected Date orderDate;
    protected String  orderDetails;
    protected String extraNotes;

    /**
     * Empty Constructor
     */
    public Order(){ orderID++; }

    /**
     * Constructor
     * @param orderDate
     * @param orderDetails
     * @param extraNotes
     */
    public Order(Date orderDate, String orderDetails, String extraNotes){
        orderID++;
        this.orderDate = orderDate;
        this.orderDetails = orderDetails;
        this.extraNotes = extraNotes;
    }

    /**
     * getters and setters for variables
     * @return
     */
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(String extraNotes) {
        this.extraNotes = extraNotes;
    }

    /**
     * Interface method of Payment
     */
    @Override
    public void processPayment(){
        System.out.println("Order");
    }
}
