public class Exercise5_1 {
    public static void main(String[] args) {
        // Declare and initialize String variables. Do not initialize message yet.
        String custName = "Caylem Harris", itemDesc = "Shirt";
        String message;
        double price = 10.5, tax = 0.14;
        int quantity = 6;
        double total;
        boolean outOfStock = false;

        // Assign variable & initialize & make the message singular
        message = custName + " " + "wants to purchase" + " " + quantity + " " + itemDesc;

        // Conditional statement
        if (quantity > 1) {
            // Make the message plural
            message = message + "s";
        } 
            
        // Initialize the 'total' variable
        total = ((price + (tax * price)) * quantity);

        // Print and run the code and Conditional statement
        if (outOfStock) {
            System.out.println("This item is out of stock!");
        } else {
            System.out.println(message);
            System.out.println("Total cost with tax is:" + " " + total);
        }
    }
}