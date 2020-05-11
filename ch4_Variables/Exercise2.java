public class Exercise2 {
    public static void main(String[] args) {
        // Declare and initialize String variables. Do not initialize message yet.
        String custName = "Caylem Harris", itemDesc = "Shirt";
        String message;
        double price = 10.4, tax = 0.14;
        int quantity = 1;
        double total;

        // Assign the message variable
        message = custName + " " + "wants to purchase" + " " + quantity + " " + itemDesc;

        // Initialize the 'total' variable
        total = (price * quantity * tax);

        // Print and run the code
        System.out.println(message);
        System.out.println("Total cost with tax is:" + " " + total);
        
    }
}