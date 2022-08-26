public class ex1 {
    public static void main(String[] args) {
        int i = 10;
        int n = i++%5;
        System.out.println("i = " + i);
        System.out.println("n = " + n);

        i = 10;
        n = ++i%5;
        System.out.println("i = " + i);
        System.out.println("n = " + n);
    }
}
