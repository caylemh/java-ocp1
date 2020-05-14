public class Ex2_chaining_if {
    public static void main(String[] args) {
        Ex2_Order order = new Ex2_Order("Rick Wilson", 910.00, "VA", Ex2_Order.NONPROFIT);
        Ex2_Order order1 = new Ex2_Order("John Reed", 2000.00, "NJ", Ex2_Order.PRIVATE);
        Ex2_Order order2 = new Ex2_Order("Jamie Wilson", 1000.00, "NY", Ex2_Order.CORP);
        Ex2_Order order3 = new Ex2_Order("Stefan Lawson", 300.00, "NY");

        // Creating an array of orders
        Ex2_Order[] orders = {order, order1, order2, order3};

        // System.out.println("Discount is: "+ order.getDiscount());
        // System.out.println("Discount is: "+ order1.getDiscount());
        // System.out.println("Discount is: "+ order2.getDiscount());
        // System.out.println("Discount is: "+ order3.getDiscount());

        // Looping through my Orders Array and printing the discounts
        for (Ex2_Order newOrder : orders) {
            System.out.println("Discount is: "+ newOrder.getDiscount());
        }

    }
}