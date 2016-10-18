package lab3;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws NullArgumentException if fullName is null
     * @throws EmptyArgumentException if fullName is empty
     * @throws IllegalArgumentException if fullName has less than two parts
     */
    public String extractLastName(String fullName) throws NullArgumentException, EmptyArgumentException, IncompleteArgumentException {
        String lastName = null;

        if(fullName == null) throw new NullArgumentException();
        else if (fullName.length() == 0) throw new EmptyArgumentException();
        else {
            String[] parts = fullName.split(" ");
            if (parts.length < 2) {
                throw new IncompleteArgumentException();
            }
            return parts[parts.length - 1];
        }
    }
    
}
