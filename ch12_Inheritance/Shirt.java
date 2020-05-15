public class Shirt extends Ex1_Item1 {
    private char pattern = 'C';
    private String cut = "-prove cut description-";
    private char colorCode;

    public Shirt(double price, char pattern, String cut, char colorCode) {
        super ("Shirt", price);
        this.pattern = pattern;
        this.cut = cut;
        this.colorCode = colorCode;
    }

    public void display() {
        // System.out.println("Item description: "+getDesc());
        // System.out.println("\tID: "+getId());
        // System.out.println("\tPrice: "+getPrice());
        super.display();
        System.out.println("\tPattern: "+pattern);
        System.out.println("\tCut: "+cut);
        System.out.println("\tColor Code: "+colorCode);
    }

    public String getColor() {
        String color = "";
        switch (colorCode){
            case 'R':
                color = "Red";
                break;
            case 'G':
                color = "Green";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'Y':
                color = "Yellow";
                break;
            default:
                color = "Invalid code";
        }
        return color;
    }
}