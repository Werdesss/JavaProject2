package RestMenApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Populatedata {

    /**
     * To create 3 Staff objects, 3 Customer objects, with each Customer having one Booking and for each Booking one Order object
     * @param Customers
     * @param Staffs
     * @throws ParseException
     */
    public void populate (ArrayList<Customer> Customers, ArrayList<Staff> Staffs) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Staff staff1 = new Staff(11, "mert", 'm', dateFormat.parse("12/12/1212"),dateFormat.parse("12/12/1213"));
        Senior staff2= new Senior(12, "merte", 'm', dateFormat.parse("12/12/2018"),dateFormat.parse("12/12/2018"), 12000);
        Junior staff3 = new Junior(13, "merto", 'm', dateFormat.parse("12/12/1214"), dateFormat.parse("12/12/1845"), 1200, dateFormat.parse("12/12/1800") );
        Customer customer1 = new Customer(11, "mert", 'm', dateFormat.parse("12/12/1212"),  dateFormat.parse("12/12/2010"), "visa" );
        Customer customer2 = new Customer(12, "merte", 'm', dateFormat.parse("12/12/1213"), dateFormat.parse("12/12/2012"),"visa" );
        Customer customer3 = new Customer(13, "merto", 'm', dateFormat.parse("12/12/1214"), dateFormat.parse("12/12/2020"),"mastercard");
        Booking booking1 = new Booking(dateFormat.parse("12/12/2020"));
        Booking booking2 = new Booking(dateFormat.parse("12/12/2012"));
        Booking booking3 = new Booking(dateFormat.parse("12/12/2015"));
        OnlineOrder order1 = new OnlineOrder("s",dateFormat.parse("12/11/2020"), "s","sa");
        InRestrOrder order2 = new InRestrOrder(1,dateFormat.parse("12/12/2019"), "a","s");
        OnlineOrder order3 = new OnlineOrder("s",dateFormat.parse("11/11/2012"), "v", "as");
        customer1.makeBooking(booking1);
        customer2.makeBooking(booking2);
        customer3.makeBooking(booking3);
        customer1.makeOrder(order1);
        customer2.makeOrder(order2);
        customer3.makeOrder(order3);
        Staffs.add(staff1);
        Staffs.add(staff2);
        Staffs.add(staff3);
        Customers.add(customer1);
        Customers.add(customer2);
        Customers.add(customer3);
    }
}
