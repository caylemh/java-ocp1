import java.util.ArrayList;

public class Ex2_ShoppingCart_1 {
    ArrayList<Ex2_Item_1> items = new ArrayList<>();
    
    public static void main(String[] args){
        Ex2_ShoppingCart_1 cart = new Ex2_ShoppingCart_1();
        cart.fillCart();
        cart.removeItemFromCart("Trousers");
    }
    
    public void fillCart(){
        items.add(new Ex2_Shirt1(40.95,'M','R'));
        items.add(new Ex2_Shirt1(32.99,'M','Y'));
        items.add(new Ex2_Trousers1(59.99,34,'B',"Relaxed",'M'));
        items.add(new Ex2_Trousers1(75.50,8,'G',"Skinny",'F'));
    }
    
    public void removeItemFromCart(String desc){
        // remove all Trousers from the items list, then print out the list
        items.removeIf(i -> i.getDesc().equals(desc));
        System.out.println("Cart after removing Trousers: \n"+items);
    }
}