import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        System.out.println("~~~Fahrenheit to Celsius converter~~~");
        System.out.print("Fahrenheit: ");
        Scanner scan = new Scanner (System.in);
        float fah = scan.nextFloat();
        float cel = (fah - 32)*5/9;
        System.out.println("Celsius: " + cel);
    }
}
