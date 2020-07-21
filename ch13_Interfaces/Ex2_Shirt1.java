public class Ex2_Shirt1 extends Ex2_Item_1 {
    private char size;
    
    public Ex2_Shirt1(double price, char size, char colorCode){
        super ("Shirt", price, colorCode);
        this.setSize(size);
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
    } 

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}