package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {

        Employee emp = new Employee("Jim","Smith","333333333",29);

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Full Name: " + emp.getFullNameInCaps());
        System.out.println("SSN: " + emp.getSsn());
        System.out.println("Days Vacation: " + emp.getDaysVacation());

    }
}
