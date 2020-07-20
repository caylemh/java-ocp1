import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_ArrayList {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};
        
        // Convert the days array into an ArrayList
        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  

        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList(days));

        for (String item: myArrayList) {
            if (item == "sunday") {
                System.out.println(item.toUpperCase());
            } else System.out.println(item);
        }

        System.out.println(myArrayList);




    }    
}