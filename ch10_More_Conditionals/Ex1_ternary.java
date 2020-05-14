public class Ex1_ternary {
    public static void main(String[] args) {
        int x=4, y=9;

        x = ((y/x) < 3) ? (x += y) : (x *= y);

        System.out.println("Result:" + " " + x);
    }
}