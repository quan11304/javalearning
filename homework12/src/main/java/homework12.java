import java.util.InputMismatchException;
import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            System.out.print("Exercise No. ");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> ex1();
                case 2 -> ex2();
                default -> System.out.println("Exiting the programme.");
            }
        } while (ans == 1 || ans == 2);
    }
    public static void ex1() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter a real number: ");
            double num1 = scan.nextDouble();
            System.out.print("Enter a real number: ");
            double num2 = scan.nextDouble();
            System.out.println("Dividing the first number by the second number...");
            System.out.println("Result: " + (num1/num2));
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a number. Returning to main menu...");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero. Returning to main menu...");
        }
    }
    public static void ex2() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        try {
            for (int i = 0; i< size; i++) {
                array[i] = scan.nextInt();
                if (array[i] == 100) throw new Ex2Exception();
            }
            for (int i: array) System.out.print(i + " ");
        } catch (Ex2Exception e) {
            int i = 0;
            while (array[i] != 100) System.out.print(array[i++] + " ");
        }
        System.out.println();
    }
}
