import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class homework14 {
    static String[] languages = {"Java", "C#", "C++", "PHP", "Javascript" };
    static List numbers = Arrays.asList(7, 2, 5, 4, 2, 1);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            // Enter number of corresponding exercise.
            // Enter an invalid number (default 0) will terminate the programme.
            System.out.print("Exercise No. ");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 5 -> ex5();
                default -> {}
            }
            System.out.println();
        } while (ans >= 1 && ans <= 5);
    }
    public static void ex1() {}
    public static void ex2() {}
    public static void ex3() {}
    public static void ex4() {}
    public static void ex5() {}
}
