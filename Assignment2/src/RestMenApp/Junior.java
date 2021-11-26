package RestMenApp;

import java.util.Date;

public class Junior extends Staff {
    private int monthlySalary;
    private Date expectedEndDate;

    /**
     * empty constructor
     */
    public Junior(){}

    /**
     * Constructor with person+staff+juniors variables
     * @param ID
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param startDate
     * @param monthlySalary
     * @param expectedEndDate
     */
    public Junior(int ID, String name, char gender, Date dateOfBirth, Date startDate, int monthlySalary, Date expectedEndDate){
        this.startDate = startDate;
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.monthlySalary = monthlySalary;
    }


    /**
     * getters and setters
     */
    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getExpectedEndDate() {
        return expectedEndDate;
    }

    public void setExpectedEndDate(Date expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    /**
     * Interface method of Employee
     * @return
     */
    @Override
    public int getSalary(){
        return getMonthlySalary();
    }
}
