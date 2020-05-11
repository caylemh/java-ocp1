public class Exercise5_2 {
    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] shopItems = {"Shirt", "Tie", "Jacket", "Hat"};

        // Change message to show the number of items purchased.
        message = custName + " wants to purchase" + " " + shopItems.length + " " + "items.";

        System.out.println(message);
        // Print an element from the items array.  

        System.out.println(shopItems[2]);
        //System.out.println(shopItems[4]);  Index is out of bounds
    }
}