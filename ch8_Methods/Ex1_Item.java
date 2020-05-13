public class Ex1_Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode) {
        if(colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }
}