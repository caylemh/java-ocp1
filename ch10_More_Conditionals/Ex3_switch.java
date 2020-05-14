public class Ex3_switch {
    public static void main(String[] args) {
        Ex3_Order_Switch order = new Ex3_Order_Switch("Rick Wilson", 910.00, "VA", Ex2_Order.NONPROFIT);
        Ex3_Order_Switch order1 = new Ex3_Order_Switch("John Reed", 2000.00, "NJ", Ex2_Order.PRIVATE);
        Ex3_Order_Switch order2 = new Ex3_Order_Switch("Jamie Wilson", 1000.00, "NY", Ex2_Order.CORP);
        Ex3_Order_Switch order3 = new Ex3_Order_Switch("Stefan Lawson", 300.00, "NY");

        // Creating an array of orders
        Ex3_Order_Switch[] orders = {order, order1, order2, order3};

        // System.out.println("Discount is: "+ order.getDiscount());
        // System.out.println("Discount is: "+ order1.getDiscount());
        // System.out.println("Discount is: "+ order2.getDiscount());
        // System.out.println("Discount is: "+ order3.getDiscount());

        // Looping through my Orders Array and printing the discounts
        for (Ex3_Order_Switch newOrder : orders) {
            System.out.println("Discount is: "+ newOrder.getDiscount());
        }
    }
}