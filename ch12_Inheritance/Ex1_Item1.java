public class Ex1_Item1 {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    public Ex1_Item1(){
    // set default values
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Ex1_Item1(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }

    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Ex1_Item1.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
}