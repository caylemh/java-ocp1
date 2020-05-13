public class Ex1_Customer {
    private String name;
    private String ssn = "123se34gt-5";

    // Overloaded Constructor
    public Ex1_Customer(String name) {
        setName(name);
    }
   
    // Encapsulate this class.  Make ssn read only.
    public String getName() {
        return name;
    }

    public void setName(String n) {
        if (n != " ") {  // Checking for invalid blank strings
            name = n;
        } else {
            System.out.println("Please enter a name!");
        } 
    }

    public String getSSN() {
        return ssn;
    }
}