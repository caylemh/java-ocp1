import java.util.ArrayList;

public class Ex4_ArrayList {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> myList = new ArrayList<String>();
        
        // add (insert) another element at a specific index
        myList.add("Juan");
        myList.add("James");
        myList.add("Rio");
        myList.add(1, "Caylem");

        System.out.println(myList);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        for (String item : myList) {
            if (item.contains("James")) {
                myList.remove("James");
                System.out.println(item + " has been removed!");
            }
        }
        System.out.println(myList);      
    }
}