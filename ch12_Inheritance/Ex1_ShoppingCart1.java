public class Ex1_ShoppingCart1 {
        public static void main(String[] args){
    
                // instantiate a Shirt object and call display() on the object reference
                Ex1_Item1 item1 = new Shirt(25.20, 'S', "Short Sleeve", 'G');
                Ex1_Item1 item2 = new Shirt(30.20, 'L', "Sleeveless", 'B');
                
                item1.display();
                if (item1 instanceof Shirt) {
                        String color = ((Shirt)item1).getColor();
                        System.out.println("Color: "+color);     
                } else System.out.println("Item is not a Shirt!");
                
                item2.display();
                if (item2 instanceof Shirt) {
                        String color = ((Shirt)item2).getColor();
                        System.out.println("Color: "+color);     
                } else System.out.println("Item is not a Shirt!");
        }
}