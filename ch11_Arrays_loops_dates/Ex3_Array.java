public class Ex3_Array {
    Ex3_Item[] items = {new Ex3_Item("Shirt",25.60), 
                    new Ex3_Item("WristBand",12.00), 
                    new Ex3_Item("Pants",35.99),
                    new Ex3_Item("Gloves",30.99),
                    new Ex3_Item("Vest",15.00),
                };
    
    public static void main(String[] args){   
        Ex3_Array cart = new Ex3_Array();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        System.out.println(" ");
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
            System.out.println("Items purchased: " + items[idx].getDesc() + " = " + items[idx].getPrice());
        }
        System.out.println("Shopping Cart total: "+total);
    }
}