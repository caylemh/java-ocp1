public class Ex1_ShoppingCart1 {
        public static void main(String[] args){
    
        // instantiate a Shirt object and call display() on the object reference
        Shirt shirt1 = new Shirt(25.20, 'S', "Short Sleeve");
        Shirt shirt2 = new Shirt(30.20, 'L', "Sleeveless");
        shirt1.display(); 
        shirt2.display();
        }
}