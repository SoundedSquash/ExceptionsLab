package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }

    public String getFullNameInCaps(){
        return getFirstName().toUpperCase() + ' ' + getLastName().toUpperCase();
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) {
        if (daysVacation <= MAX_VACATION_DAYS) {
            this.daysVacation = daysVacation;
        } else {
            System.out.println("The given days of vacation is too high. Setting to " + MAX_VACATION_DAYS + ".");
            this.daysVacation = MAX_VACATION_DAYS;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       if (firstName == null || firstName.length() == 0){
           System.out.println("Invalid first name. Defaulting to 'John'.");
           this.firstName = "John";
       }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        if (lastName == null || lastName.length() == 0){
            System.out.println("Invalid last name. Defaulting to 'Smith'.");
            this.lastName = "Smith";
        } else {
            this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        ssn = ssn.replaceAll("[^\\d]", "");
        if (ssn.length() != 9){
            System.out.println("Please enter a 9 digit value for the ssn.");
        } else {
            this.ssn = ssn;
        }
    }
    
    
    
}
