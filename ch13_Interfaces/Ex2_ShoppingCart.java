import java.util.ArrayList;

public class Ex2_ShoppingCart {
    ArrayList<Ex2_Item> items = new ArrayList<>();
    
    public static void main(String[] args){
        Ex2_ShoppingCart cart = new Ex2_ShoppingCart();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }
    
    public void fillCart(){
        items.add(new Ex2_Shirt(40.95,'M','R'));
        items.add(new Ex2_Shirt(32.99,'M','Y'));
        items.add(new Ex2_Trousers(59.99,34,'B',"Relaxed",'M'));
        items.add(new Ex2_Trousers(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing Trousers: \n"+items);
    }
}