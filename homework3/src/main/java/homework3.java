import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            // Enter number of corresponding exercise.
            // Enter an invalid number (default 0) will terminate the programme.
            System.out.print("Exercise No. ");
            ans = scan.nextInt();
            switch (ans) {
                case 1:
                    ex1();
                    System.out.println("\n");
                    break;
                case 2:
                    ex2();
                    System.out.println("\n");
                    break;
                case 3:
                    ex3();
                    System.out.println("\n");
                    break;
                case 4:
                    ex4();
                    System.out.println("\n");
                    break;
                case 5:
                    ex5();
                    System.out.println("\n");
                    break;
                default:
                    break;
            }
        } while (ans >= 1 && ans <= 5);
    }

    public static void ex1() {
        System.out.println("~~~Exercise No. 1~~~");
        System.out.print("Enter a text string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.print("Duplicating every character: ");
        for (int i = 0;i<string.length();i++){
            System.out.print(string.charAt(i));
            System.out.print(string.charAt(i));
        }
    }

    public static void ex2() {
        System.out.println("~~~Exercise No. 2~~~");
        System.out.print("Enter a text string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.print("Removing duplicate characters: ");
        for (int i = 0;i<=string.length();i++){
            int count = 0;
            for (int j = 0;j<i;j++)
                if (string.charAt(i) == string.charAt(j)) count++;
            if (count == 0) System.out.print(string.charAt(i));
        }
    }

    public static void ex3() {
        System.out.println("~~~Exercise No. 3~~~");
        System.out.print("Enter a text string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.print("Character(s) appearing only once in string: ");
        for (int i = 0;i<string.length();i++){
            int count = 0;
            for (int j = 0;j<string.length();j++)
                if (j!=i && string.charAt(i) == string.charAt(j)) count++;
            if (count == 0) System.out.print(string.charAt(i));
        }
    }

    public static void ex4() {
        System.out.println("~~~Exercise No. 4~~~");
        System.out.print("Enter a text string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        int max=0, result[], no=0;
        for (int i = 0;i<string.length();i++){
            int count = 1;
            for (int j = i+1;j<string.length();j++)
                if (string.charAt(i) == string.charAt(j)) count++;
            if (max < count) {
                max = count;
                result[no] = i;
                no++;
            }
        }

        System.out.printf("Character(s) appearing the most in string \"%s\": ",string);
        for (int i = 0; i < no; i++) System.out.print(result[i]+" ");
        System.out.printf("- Appeared %d time(s)",max);
    }

    public static void ex5() {
        System.out.println("~~~Exercise No. 5~~~");
        System.out.print("Enter a text string: ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        int j;
        for (int i = string.length()-1;i>=0;i--) {
            if ((int) string.charAt(i) == 32 || i == 0) {
                if (i==0) j=i; else j=i+1;
                while (j < string.length() && (int) string.charAt(j) != 32) {
                    System.out.print(string.charAt(j));
                    j++;
                }
                System.out.print(" ");
            }
        }
    }
}
