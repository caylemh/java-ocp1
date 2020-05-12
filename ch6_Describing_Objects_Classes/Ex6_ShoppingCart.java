
public class Ex6_ShoppingCart {
    public static void main(String[] args) {
        // Declare and initialize 2 Item objects
        Ex6_Item item1, item2;
        item1 = new Ex6_Item();
        item2 = new Ex6_Item();
        
	// Print both item descriptions and run code
	item1.desc = "Hat";
    item2.desc = "Shirt";

	// Assign one item to another and run it again.
    item1 = item2;
    System.out.println("Item1: " + item1.desc);
    System.out.println("Item2: " + item2.desc);

    }  
}