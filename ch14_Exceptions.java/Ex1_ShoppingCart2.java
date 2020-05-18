public class Ex1_ShoppingCart2 {
    public static void main(String[] args){
        Ex1_Calculator calc = new Ex1_Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: "+addResult);
        
        // Handle possible ArithmeticException
        try {           
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: "+divResult);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }        
    }
}