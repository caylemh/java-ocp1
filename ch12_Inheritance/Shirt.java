public class Shirt extends Ex1_Item1 {
    private char pattern = 'C';
    private String cut = "-prove cut description-";

    public Shirt(double price, char pattern, String cut) {
        super ("Shirt", price);
        this.pattern = pattern;
        this.cut = cut;
    }
}