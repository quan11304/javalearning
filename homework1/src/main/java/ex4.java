import java.lang.Math;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Enter a 6-digit number: ");
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();

        int temp;
        for (int i=5;i>=0;i--){
            temp = (int) (num / Math.pow(10,i));
            num -= temp*Math.pow(10,i);
            System.out.print(temp+ " ");
        }
    }
}
