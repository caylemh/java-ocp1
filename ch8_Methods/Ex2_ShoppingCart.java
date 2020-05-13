public class Ex2_ShoppingCart {
    public static void main(String[] args) {
        Ex2_Item item1 = new Ex2_Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Bag", 3, 23.99);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int retCode = item1.setItemFields("Shirt", 5, 130.99, 'B');

        // Test your code for valid values
        if (retCode < 0) {
            System.out.println("Invalid Color code. Item not added!");
        } else item1.displayItem();

        // Extra call for the 4-arg setItemFields method, checking the return value.  
        retCode = item1.setItemFields("Shirt", 5, 130.99, ' ');

        // Test your code for invalid values
        if (retCode < 0) {
            System.out.println("Invalid Color code. Item not added!");
        } else item1.displayItem();
    }
}