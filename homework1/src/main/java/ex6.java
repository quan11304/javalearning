import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Weight (in kilograms): ");
        float m = scan.nextFloat();
        System.out.print("\nHeight (in metres): ");
        float h = scan.nextFloat();
        System.out.printf("BMI: %f (kg/m^2)",m/(h*h));
    }
}
