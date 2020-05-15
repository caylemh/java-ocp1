public class Shirt extends Ex1_Item1 {
    private char pattern = 'C';
    private String cut = "-prove cut description-";

    public Shirt(double price, char pattern, String cut) {
        super ("Shirt", price);
        this.pattern = pattern;
        this.cut = cut;
    }

    public void display() {
        // System.out.println("Item description: "+getDesc());
        // System.out.println("\tID: "+getId());
        // System.out.println("\tPrice: "+getPrice());
        super.display();
        System.out.println("\tPattern: "+pattern);
        System.out.println("\tCut: "+cut);
    }
}