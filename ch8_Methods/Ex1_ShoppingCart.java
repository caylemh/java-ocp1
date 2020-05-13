public class Ex1_ShoppingCart {
    public static void main(String[] args){
        Ex1_Item item1 = new Ex1_Item();
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
    //   message.
        item1.setColor('P');

        if (item1.color == 'P') {
            System.out.println("Item1 Color:" + " " + item1.color);
        } else {
            System.out.println("Invalid Color!");
        }

    }
}