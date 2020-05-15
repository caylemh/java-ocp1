public class Ex2_Args {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        System.out.println("args[0] is:" + arg1);
        System.out.println("args[1] is:" + arg2);
        System.out.println("Total is:" + (arg1+arg2));
    }
}