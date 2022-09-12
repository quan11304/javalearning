import java.util.Scanner;
import java.util.regex.Pattern;

public class ex1234 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Exercise No. "); int ans = scan.nextInt();
        int test;
        do {
            test = 0;
            switch (ans) {
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 0 -> {return;}
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                    test++;
                }
            }
        } while(test==0);
    }
    public static void ex1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String query = scan.next();
        boolean b = Pattern.matches("[02468]",query);
        System.out.println(b);
    }
    public static void ex2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string of characters: ");
        String query = scan.next();
        boolean b = Pattern.matches("[ueoai]",query);
        System.out.println(b);
    }
    public static void ex3() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a string of numbers: ");
        String query = scan.next();
        boolean b = '0' == query.charAt(0) && query.length() == 10;
        System.out.println(b);
    }
    public static void ex4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n = scan.nextInt();

        int[] array = new int[n];
        System.out.println("Enter "+ n +" values for the elements: ");
        for (int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }

        System.out.println("Checking condition...");
        int test = 0;
        boolean positive = array[0] > 0;
        for (int i = 1; i < array.length; i++) {
            positive = !positive;
            if (positive) {
                if (!(array[i]>0)) test++;
            }
            else {
                if (!(array[i]<0)) test++;
            }
        }
        System.out.println(test == 0);
    }
}
