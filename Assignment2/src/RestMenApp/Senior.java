package RestMenApp;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Senior extends Staff {
    private int grossSalaryYear;
    private ArrayList<Junior> responsibleFrom;

    /**
     * Empty Constructor
     */
    public Senior(){
        this.responsibleFrom = new ArrayList<Junior>();
    }

    /**
     * Constructor with person+staff+seniors variables
     * @param grossSalaryYear
     * @param responsibleFrom
     * @param ID
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param startDate
     */
    public Senior(int grossSalaryYear, ArrayList<Junior> responsibleFrom, int ID, String name, char gender, Date dateOfBirth, Date startDate){
        this.grossSalaryYear = grossSalaryYear;
        this.startDate = startDate;
        this.responsibleFrom = new ArrayList<Junior>();
        this.responsibleFrom = responsibleFrom;
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Constructor with person+staff+seniors variables - resposinble from
     * @param grossSalaryYear
     * @param ID
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param startDate
     */
    public Senior(int ID, String name, char gender, Date dateOfBirth, Date startDate, int grossSalaryYear){
        this.grossSalaryYear = grossSalaryYear;
        this.startDate = startDate;
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     *getters and setters
     */
    public int getGrossSalaryYear() {
        return grossSalaryYear;
    }

    public void setGrossSalaryYear(int grossSalaryYear) {
        this.grossSalaryYear = grossSalaryYear;
    }

    public ArrayList<Junior> getResponsibleFrom() {
        return responsibleFrom;
    }

    public void setResponsibleFrom(ArrayList<Junior> responsibleFrom) {
        this.responsibleFrom = responsibleFrom;
    }

    /**
     * Interface method for Employee
     * @return monthly salary of Senior
     */
    @Override
    public int getSalary(){
        int year = Year.now().getValue(); // Current year
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        cal.setTime(getStartDate());
        int yearOfDate = cal.get(Calendar.YEAR);
        int total_year = year - yearOfDate;
        int monthly_salary = getGrossSalaryYear(),i;
        for (i=0; i < total_year; i++){
            monthly_salary = (int) (monthly_salary * (1.1));
        }
        monthly_salary/= 12;
        return monthly_salary;
    }
}
