import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner (System.in);
        x = scan.nextInt();
        y = scan.nextInt();
        if (x==10 || y==10 || x+y==10 || x-y==10 || y-x==10) {
            System.out.println("TRUE");
        } else System.out.println("FALSE");
    }
}
