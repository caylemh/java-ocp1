public class Ex2_Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemFields(String desc, int qty, double price) {
        this.desc = desc;
        this.quantity = qty;
        this.price = price;
    }

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemFields(String desc, int qty, double price, char theCode) {
        if (theCode != ' ') {
            colorCode = theCode;
            this.setItemFields(desc, qty, price);
            return 1;
        } else return -1;
    }
}