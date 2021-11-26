package RestMenApp;
import java.util.Date;

public class Staff extends Person implements Employee {
    protected Date startDate;


    /**
     * Empty Constructor
     */
    public Staff(){
        startDate = new Date(0,0,0);
    }

    /**
     * Constructor with person+staff variables
     * @param ID
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param startDate
     */
    public Staff(int ID, String name, char gender, Date dateOfBirth, Date startDate){
        this.startDate = startDate;
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * getters and setters
     * @return
     */
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Interface method for Employee Interface
     * @return gave 0 because it is not specified
     */
    @Override
    public int getSalary() {
        return 0;
    }
}
