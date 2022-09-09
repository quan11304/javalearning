import java.util.regex.*;
import java.util.Scanner;
public class ex2345 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int ans; String input = null;
        do {
            System.out.print("Exercise No. ");
            ans = scan.nextInt();
            if (ans >=2 && ans <=5) {
                System.out.print("\nInput: ");
                input = scan.nextLine();
            }
            switch (ans) {
                case 2 -> ex2(input);
                case 3 -> ex3(input);
                case 4 -> ex4(input);
                case 5 -> ex5(input);
                case 0 -> System.out.println("Exiting the programme...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (ans!=0);
    }
    public static void ex2(String input) {
        Pattern p = Pattern.compile("pq*");
        Matcher m = p.matcher(input);
        boolean b = m.matches();
        System.out.println(b);
    }
    public static void ex3(String input) {
        boolean b = Pattern.matches("([a-zA-Z]_)",input);
        System.out.println(b);
    }
    public static void ex4(String input) {
        boolean b = Pattern.matches("\\w",input);
        System.out.println(b);
    }
    public static void ex5(String input) {
        boolean b = Pattern.matches("5.*",input);
        System.out.println(b);
    }
}
