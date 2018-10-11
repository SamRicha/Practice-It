/*
 *  (You should complete Self-Check 8.26 before answering this question. Go back to that exercise and 
 *  copy/paste your solution here as a starting point.)
 *  
 *  Add mutator methods called setFirstName, setMiddleInitial, and setLastName to your encapsulated 
 *  version of the Name class from the last exercise. Give the parameters the same names as your fields, 
 *  and use the keyword this in your solution.
 */

// A Name object represents a person's name such as "John Q. Public".
public class Name {
    private String firstName;
    private char middleInitial;
    private String lastName;
    
    public Name(String first, char middle, String last) {
        firstName = first;
        middleInitial = middle;
        lastName = last;
    }
    public String getFirstName(){
        return firstName;
    }
    public char getMiddleInitial(){
        return middleInitial;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String first){
        this.firstName = first;
    }
    public void setMiddleInitial(char middle){
        this.middleInitial = middle;
    }
    public void setLastName(String last){
        this.lastName = last;
    }
}
