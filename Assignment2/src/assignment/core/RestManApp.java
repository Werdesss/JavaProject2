package assignment.core;

import assignment.support.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**

 * @since 12.11.2020
 */
public class RestManApp{
    /**
     * It prints the menu items
     */
    public static void menu(){
        System.out.println("\nMENU\n1:addStaff:\n2:deleteStaff:\n3:listStaffDetails:\n4:addCustomer:\n5:deleteCustomer\n6:addBooking\n7:listCustomerDetails\n8:displayCustomerLastBooking\n9:listCustomerOrders\n10:listStaff\n11:listCustomer\n12:addOrder\n13:listAllStaffSalary\n14:listAllOrder\n15:addOrderOfBooking\n-1:exit!");
    }

    /**
     * add new staffs to Staffs array list by creating a new staff and getting its values. Finally it adds to the Staffs
     * @param Staffs Staffs array list that I created in main
     * @exception try-catch  to be able parse the string ro date
     */

    public static void addStaff(ArrayList<Staff> Staffs) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the staff position: 1:Senior / 2:Junior");
        int pos = myObj.nextInt();
        if (pos == 1){
            System.out.println("Enter name, ID, gender, dateOfBirth(dd/MM/yyyy), startDate(dd/MM/yyyy), grossSalaryYearly:");
            String name = myObj.next();
            int ID = myObj.nextInt();
            char gender = myObj.next().charAt(0);
            String dateOfBirth = myObj.next();
            String startDate = myObj.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            Date date2 = null;
            try{
                date = dateFormat.parse(dateOfBirth);
                date2 = dateFormat.parse(startDate);
            } catch (ParseException e){
                e.printStackTrace();
            }
            int salary = myObj.nextInt();

            Senior staff = new Senior();
            staff.setGender(gender);
            staff.setName(name);
            staff.setID(ID);
            staff.setDateOfBirth(date);
            staff.setStartDate(date2);
            staff.setGrossSalaryYear(salary);
            Staffs.add(staff);
        }
        else{
            System.out.println("Enter name, ID, gender, dateOfBirth(dd/MM/yyyy), startDate(dd/MM/yyyy), monthlySalary, expectedEndDate(dd/MM/yyyy):");
            String name = myObj.next();
            int ID = myObj.nextInt();
            char gender = myObj.next().charAt(0);
            String dateOfBirth = myObj.next();
            String startDate = myObj.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = null;
            Date date3 = null;
            try{
                date = dateFormat.parse(dateOfBirth);
                date3 = dateFormat.parse(startDate);
            } catch (ParseException e){
                e.printStackTrace();
            }
            int salary = myObj.nextInt();
            String enddate = myObj.next();
            Date date2 = null;
            try {
                date2 = dateFormat.parse(enddate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Junior staff = new Junior();
            staff.setGender(gender);
            staff.setName(name);
            staff.setID(ID);
            staff.setDateOfBirth(date);
            staff.setStartDate(date3);
            staff.setMonthlySalary(salary);
            staff.setExpectedEndDate(date2);
            Staffs.add(staff);
        }
    }

    /**
     * Deletes staff from Staffs arraylist by taking ID
     * @param ID to be able to find the staff in Staffs
     * @param Staffs Staffs array list that I created in main
     */
    public static void deleteStaff(int ID, ArrayList<Staff> Staffs){
        int i, index = -1;
        for (i = 0; i< Staffs.size(); i++) {
            if (Staffs.get(i).getID() == ID){
                index = i;
            }
        }
        if (index == -1)
            System.out.println("There is no staff with given ID number");
        else{
            Staffs.remove(index);
            System.out.println("Staff successfully deleted");
        }
    }

    /**
     * shows the details of staff by taking ssn to detect which user it belongs
     * @param Staffs Staffs array list that I created in main
     * @param ID to be able to find the staff in Staffs
     */
    public static void listStaffDetails(ArrayList<Staff> Staffs, int ID){
        int i, index = -1;
        for (i = 0; i< Staffs.size(); i++) {
            if (Staffs.get(i).getID() == ID){
                index = i;
            }
        }
        if (index == -1)
            System.out.println("There is no staff with given ID number");
        else{
            if (Staffs.get(index).getClass().getSimpleName() == "Junior"){
                System.out.println("Junior");
                System.out.println("Name:" + Staffs.get(index).getName());
                System.out.println("ID:" + Staffs.get(index).getID());
                System.out.println("Gender:" + Staffs.get(index).getGender());
                System.out.println("DateOfBirth:" + Staffs.get(index).getDateOfBirth());
                System.out.println("StartDate:" + Staffs.get(index).getStartDate());
                System.out.println("Monthly Salary: " + ((Junior)Staffs.get(index)).getMonthlySalary());
            }
            else{
                System.out.println("Senior");
                System.out.println("Name:" + Staffs.get(index).getName());
                System.out.println("ID:" + Staffs.get(index).getID());
                System.out.println("Gender:" + Staffs.get(index).getGender());
                System.out.println("DateOfBirth:" + Staffs.get(index).getDateOfBirth());
                System.out.println("StartDate:" + Staffs.get(index).getStartDate());
                System.out.println("Gross Salary Year: " + ((Senior)Staffs.get(index)).getGrossSalaryYear());
            }
        }
    }

    /**
     * add customers to Customers array list i the main by creating a new customer and getting its values. Finally it adds to the Customers
     * @param Customers Customers array list that I created in
     */
    public static void addCustomer(ArrayList<Customer> Customers){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, ID, gender, dateOfBirth(dd/MM/yyyy) , registration Date(dd/MM/yyyy), creditCardDetails: ");
        String name = myObj.nextLine();
        int ID = myObj.nextInt();
        char gender = myObj.next().charAt(0);
        String dateOfBirth = myObj.next();
        String registrationDate = myObj.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        Date date2 = null;
        try{
            date = dateFormat.parse(dateOfBirth);
            date2 = dateFormat.parse(registrationDate);

        } catch (ParseException e){
            e.printStackTrace();
        }
        String card = myObj.next();

        Customer customer = new Customer();
        customer.setGender(gender);
        customer.setName(name);
        customer.setID(ID);
        customer.setDateOfBirth(date);
        customer.setRegistrationDate(date2);
        customer.setCreditCardDetails(card);
        Customers.add(customer);
    }


    /**
     * Deletes customer from Customers arraylist by taking ID
     * @param ID to be able to find the customer in Customers
     * @param Customers Customers array list that I created in main
     */

    public static void deleteCustomer(int ID, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getID() == ID){
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("There is no customer with given ID number");
        else{
            Customers.remove(index);
            System.out.println("Customer successfully deleted");
        }
    }

    /**
     * by taking ID it finds which customer it belongs and adds booking to that customer
     * @param ID to be able to find the customer in Customers
     * @param Customers Customers array list that I created in main
     */
    public static void addBooking(int ID, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getID() == ID){
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("There is no customer with given ID number");
        else{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter details for booking Booking date(dd/MM/yyyy)");
            String bookingDate = myObj.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date3 = null;
            try{
                date3 = dateFormat.parse(bookingDate);
            } catch (ParseException e){
                e.printStackTrace();
            }

            Booking c_booking = new Booking();
            c_booking.setBookingDate(date3);
            Customers.get(index).makeBooking(c_booking);
        }
    }

    /**
     * shows the details of customer by taking ssn to detect which Customers it belongs
     * @param Customers Customers array list that I created in main
     * @param ID to be able to find the customer in Customers
     */
    public static void listCustomerDetails(int ID, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getID() == ID){
                index = i;
                break;
            }
        }

        if (index == -1)
            System.out.println("There is no customer with given ID number");
        else{
            System.out.println("ID: " + Customers.get(index).getID());
            System.out.println("Name: " + Customers.get(index).getName());
            System.out.println("Gender: " + Customers.get(index).getGender());
            System.out.println("Date of birth: " + Customers.get(index).getDateOfBirth());
            System.out.println("Registration date: " + Customers.get(index).getRegistrationDate());
            System.out.println("Credit card details: " + Customers.get(index).getCreditCardDetails());
        }
    }

    /**
     * shows the details of the last booking details
     * @param ID
     * @param Customers
     */
    public static void displayCustomerLastBooking(int ID, ArrayList<Customer> Customers) {
        int i, index = -1, count = 0;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getID() == ID){
                index = i;
                break;
            }
        }

        if (index == -1)
            System.out.println("There is no customer with given ssn number");
        else{
            for (i = 0; i < Customers.get(index).getBookings().size(); i++){
                count++;
            }
            System.out.println("Last booking date: " + Customers.get(index).getBookings().get(count-1).getBookingDate());
            System.out.println("Last booking ID: " + Customers.get(index).getBookings().get(count-1).getBookingID());
        }
    }

    /**
     * shows the details of customer's orders by taking ID to detect which user it belongs
     * @param Customers Customers array list that I created in main
     * @param ID to be able to find the staff in Staffs
     */
    public static void listCustomerOrders(int ID, ArrayList<Customer> Customers) {
        int i, index = -1, date = -1;
        for (i = 0; i < Customers.size(); i++) {
            if (Customers.get(i).getID() == ID) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("There is no order with given ID number");
            return;
        }
        else {
            for (i = 0; i < Customers.get(index).getOrders().size(); i++) {
                if (Customers.get(index).getOrders().get(i).getClass().getSimpleName().equals("OnlineOrder")){
                    System.out.println("Online Order:");
                    System.out.println((i + 1) + ". ID " + ((OnlineOrder)Customers.get(index).getOrders().get(i)).getOrderID());
                    System.out.println((i + 1) + ". Date " + Customers.get(index).getOrders().get(i).getOrderDate());
                    System.out.println((i + 1) + ". Order Details " + Customers.get(index).getOrders().get(i).getOrderDetails());
                    System.out.println((i + 1) + ". Extra Notes " + Customers.get(index).getOrders().get(i).getExtraNotes());
                    System.out.println((i + 1) + ". PaymentType " +((OnlineOrder)Customers.get(index).getOrders().get(i)).getPaymentType());
                }
                else if (Customers.get(index).getOrders().get(i).getClass().getSimpleName().equals("InRestrOrder")){
                    System.out.println("InRestr Order:");
                    System.out.println((i + 1) + ". ID " + Customers.get(index).getOrders().get(i).getOrderID());
                    System.out.println((i + 1) + ". Date " + Customers.get(index).getOrders().get(i).getOrderDate());
                    System.out.println((i + 1) + ". Order Details " + Customers.get(index).getOrders().get(i).getOrderDetails());
                    System.out.println((i + 1) + ". Extra Notes " + Customers.get(index).getOrders().get(i).getExtraNotes());
                    System.out.println((i + 1) + ". Table Number " +((InRestrOrder)Customers.get(index).getOrders().get(i)).getTableNumber());
                }
            }
        }
    }


    /**
     * List all the staff details
     * @param Staffs Staffs array list that I created in main
     */
    public static void listStaff(ArrayList<Staff> Staffs){
        int i;
        if (Staffs.size() == 0)
            System.out.println("There is no registered staff ");
        else{
            for (i = 0; i < Staffs.size(); i++){
                if (Staffs.get(i).getClass().getSimpleName().equals("Junior")) {
                    System.out.println("Junior");
                    System.out.println((i + 1) + ". Staff's Name:" + Staffs.get(i).getName());
                    System.out.println((i + 1) + ". Staff's ID:" + Staffs.get(i).getID());
                    System.out.println((i + 1) + ". Staff's Gender:" + Staffs.get(i).getGender());
                    System.out.println((i + 1) + ". Staff's DateOfBirth:" + Staffs.get(i).getDateOfBirth());
                    System.out.println((i + 1) + ". Staff's StartDate:" + Staffs.get(i).getStartDate());
                    System.out.println((i + 1) + ". Monthly Salary: " + ((Junior)Staffs.get(i)).getMonthlySalary());
                }
                else if (Staffs.get(i).getClass().getSimpleName().equals("Senior")) {
                    System.out.println("Senior");
                    System.out.println((i + 1) + ". Staff's Name:" + Staffs.get(i).getName());
                    System.out.println((i + 1) + ". Staff's ID:" + Staffs.get(i).getID());
                    System.out.println((i + 1) + ". Staff's Gender:" + Staffs.get(i).getGender());
                    System.out.println((i + 1) + ". Staff's DateOfBirth:" + Staffs.get(i).getDateOfBirth());
                    System.out.println((i + 1) + ". Staff's StartDate:" + Staffs.get(i).getStartDate());
                    System.out.println((i + 1) + ". Gross Salary Year: " + ((Senior)Staffs.get(i)).getGrossSalaryYear());
                }
                else {
                    System.out.println((i + 1) + ". Staff's Name:" + Staffs.get(i).getName());
                    System.out.println((i + 1) + ". Staff's ID:" + Staffs.get(i).getID());
                    System.out.println((i + 1) + ". Staff's Gender:" + Staffs.get(i).getGender());
                    System.out.println((i + 1) + ". Staff's DateOfBirth:" + Staffs.get(i).getDateOfBirth());
                    System.out.println((i + 1) + ". Staff's StartDate:" + Staffs.get(i).getStartDate());
                }
            }
        }
    }

    /**
     * List all the customers details
     * @param Customers Customers array list that I created in main
     */
    public static void listCustomer(ArrayList<Customer> Customers){
        int i;
        if (Customers.size() == 0)
            System.out.println("There is no registered Customer ");
        else{
            for (i = 0; i < Customers.size(); i++) {
                System.out.println((i+1) + ". Customer's ID: " + Customers.get(i).getID());
                System.out.println((i+1) + ". Customer's Name: " + Customers.get(i).getName());
                System.out.println((i+1) + ". Customer's Gender: " + Customers.get(i).getGender());
                System.out.println((i+1) + ". Customer's Date of birth: " + Customers.get(i).getDateOfBirth());
                System.out.println((i+1) + ". Customer's Registration date: " + Customers.get(i).getRegistrationDate());
                System.out.println((i+1) + ". Customer's Credit Card Details: " + Customers.get(i).getCreditCardDetails());
            }
        }
    }

    /**
     * To add an Order according to if it is an Online or InRestr
     * @param ID ID of the Customer
     * @param Customers Customers array list that I created in main
     */
    public static void addOrder(int ID, ArrayList<Customer> Customers){
        int i, index = -1;
        for (i = 0; i< Customers.size(); i++) {
            if (Customers.get(i).getID() == ID){
                index = i;
                break;
            }
        }
        if (index == -1)
            System.out.println("There is no customer with given ID number");
        else {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Online Order(1) / InRestrOrder(2)");
            int order = myObj.nextInt();
            if (order == 1) {
                System.out.println("Please enter details for Online Order\norderDate(dd/MM/yyyy), orderDetails, extraNotes, paymentType");
                String odate = myObj.next();
                String odetails = myObj.next();
                String extra = myObj.next();
                String payment = myObj.next();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = null;
                try {
                    date = dateFormat.parse(odate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                OnlineOrder oorder = new OnlineOrder();
                oorder.setPaymentType(payment);
                oorder.setExtraNotes(extra);
                oorder.setOrderDate(date);
                oorder.setOrderDetails(odetails);
                Customers.get(index).getOrders().add(oorder);
            }
            else if (order == 2){
                System.out.println("Please enter details for InRest Order\norderDate(dd/MM/yyyy), orderDetails, extraNotes, tableNumber");
                String rdate = myObj.next();
                String rdetails = myObj.next();
                String extra = myObj.next();
                int table = myObj.nextInt();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = null;
                try {
                    date = dateFormat.parse(rdate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                InRestrOrder oorder = new InRestrOrder();
                oorder.setTableNumber(table);
                oorder.setExtraNotes(extra);
                oorder.setOrderDate(date);
                oorder.setOrderDetails(rdetails);
                Customers.get(index).getOrders().add(oorder);
            }
            else {System.out.println("Wrong number");}
        }
    }

    /**
     * To show the staffs salary
     * @param Staffs Staffs array list that I created in main
     */
    public static void listAllStaffSalary(ArrayList<Staff> Staffs){
        int i=0;
        for (i=0; i < Staffs.size(); i++){
            System.out.println((i+1) + ". Staffs salary " + Staffs.get(i).getSalary());
        }
    }

    /**
     * lists all orders
     * @param orders gets orders from Customer arraylist
     */
    public static void listAllOrder(ArrayList<Order> orders){
        int i = 0;
        for (i = 0 ; i < orders.size(); i++){
            if (orders.get(i).getClass().getSimpleName().equals("OnlineOrder")){
                System.out.println(". orderID " + orders.get(i).getOrderID());
                System.out.println(". orderDate " + orders.get(i).getOrderDate());
                System.out.println(". orderDetails " + orders.get(i).getOrderDetails());
                System.out.println(". extraNotes " + orders.get(i).getExtraNotes());
                System.out.println(". paymentType " + ((OnlineOrder)orders.get(i)).getPaymentType());
                System.out.println(". getDeliveredBy " + ((OnlineOrder)orders.get(i)).getDeliveredBy().getName() + "\n");
            }
            else if (orders.get(i).getClass().getSimpleName().equals("InRestrOrder")){
                System.out.println(". orderID " + orders.get(i).getOrderID());
                System.out.println(". orderDate " + orders.get(i).getOrderDate());
                System.out.println(". orderDetails " + orders.get(i).getOrderDetails());
                System.out.println(". extraNotes " + orders.get(i).getExtraNotes());
                System.out.println(". tableNumber " + ((InRestrOrder)orders.get(i)).getTableNumber());
                System.out.println(". bookingOrder (ID) " + ((InRestrOrder)orders.get(i)).getBookingOrder().getBookingID()+ "\n");
            }
        }
    }

    /**
     * to add order ro booking and customer
     * @param Customers Customers array list that I created in main
     * @param cID customer ID
     * @param bID booking ID
     */
    public static void addOrderOfBooking(ArrayList<Customer> Customers, int cID, int bID){
        int i, index = -1, bindex = -1;   // for holding the index of the booking (bindex)
        for (i = 0; i < Customers.size(); i++){
            if (Customers.get(i).getID() == cID){
                index = i;
            }
        }

        if (index == -1){
            System.out.println("There is no customer with given ID number");
            return;
        }

        System.out.println(Customers.get(index).getBookings().get(0).getBookingID());
        for (i = 0; i < Customers.get(index).getBookings().size(); i++){
            if (Customers.get(index).getBookings().get(i).getBookingID() == bID){
                bindex = i;
            }
        }

        if (bindex == -1){
            System.out.println("There is no booking with given ID number");
            return;
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter details for InRest Order\n orderDate(dd/MM/yyyy), orderDetails, extraNotes, tableNumber");
        String rdate = myObj.next();
        String rdetails = myObj.next();
        String extra = myObj.next();
        int table = myObj.nextInt();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(rdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        InRestrOrder oorder = new InRestrOrder();
        oorder.setTableNumber(table);
        oorder.setExtraNotes(extra);
        oorder.setOrderDate(date);
        oorder.setOrderDetails(rdetails);
        oorder.setBookingOrder(Customers.get(index).getBookings().get(bindex));
        Customers.get(index).getOrders().add(oorder);
    }


    public static void main(String[] args) throws ParseException{
        ArrayList<Staff> Staffs = new ArrayList<Staff>();
        ArrayList<Customer> Customers = new ArrayList<Customer>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Populatedata populate = new Populatedata();
        populate.populate(Customers, Staffs);
        int n = 0;
        do {
            menu();
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the number:");
            n = myObj.nextInt();
            switch (n) {
                case 1:
                    addStaff(Staffs);
                    break;
                case 2: {
                    System.out.println("Enter the ID:");
                    int ssn = myObj.nextInt();
                    deleteStaff(ssn, Staffs);
                    break;
                }
                case 3:{
                    System.out.println("Enter the ID:");
                    int ssn = myObj.nextInt();
                    listStaffDetails(Staffs, ssn);
                    break;
                }
                case 4:{
                    addCustomer(Customers);
                    break;
                }
                case 5:{
                    System.out.println("Enter the ID:");
                    int ssn = myObj.nextInt();
                    deleteCustomer(ssn, Customers);
                    break;
                }
                case 6:{
                    System.out.println("Enter the ID:");
                    int ssn = myObj.nextInt();
                    addBooking(ssn, Customers);
                    break;
                }
                case 7:{
                    System.out.println("Enter the ID:");
                    int ssn = myObj.nextInt();
                    listCustomerDetails(ssn, Customers);
                    break;

                }
                case 8:{
                    System.out.println("Enter the ID:");
                    int ID = myObj.nextInt();
                    displayCustomerLastBooking(ID, Customers);
                    break;
                }
                case 9:{
                    System.out.println("Enter the ID:");
                    int ID = myObj.nextInt();
                    listCustomerOrders(ID, Customers);
                    break;
                }
                case 10:{
                    listStaff(Staffs);
                    break;
                }
                case 11:{
                    listCustomer(Customers);
                    break;
                }
                case 12:{
                    System.out.println("Enter the ID:");
                    int ID = myObj.nextInt();
                    addOrder(ID, Customers);
                    break;
                }
                case 13:{
                    listAllStaffSalary(Staffs);
                    break;
                }
                case 14:{
                    for (int i = 0; i < Customers.size(); i++) {
                        listAllOrder(Customers.get(i).getOrders());
                    }
                    break;
                }
                case 15:{
                    System.out.println("Enter the Customer ID and Booking ID:");
                    int ID = myObj.nextInt();
                    int ID2 = myObj.nextInt();
                    addOrderOfBooking(Customers,ID,ID2);
                    break;
                }
                case -1: {
                    n = -1;
                    break;
                }
                default:
                    System.out.println("Please enter a correct number!!");
            }
        }while (n!=-1);
    }
}
