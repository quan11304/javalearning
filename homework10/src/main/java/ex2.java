import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex2 {
    static Scanner scan = new Scanner(System.in);
    static HashMap<String,String> accountMap = new HashMap<>();
    public static void main(String[] args) {
        int ans = 1;
        do {
            if (ans == 1 || ans == 2) {
                System.out.println("~~~TechMaster~~~");
                System.out.println("| 1. Login | 2. Register | 3. Exit |");
            }
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> login();
                case 2 -> register();
                case 3 -> System.out.println("Exiting the programme...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (ans != 3);
    }
    public static void login() {
        System.out.println("~~~Login~~~");
        System.out.print("Username: ");
        String tempUser = scan.nextLine();
        int wrongPw = 0;
        if (accountMap.containsKey(tempUser)) {
            System.out.print("Welcome "+tempUser+"! Please enter your password: ");
            String tempPw = scan.nextLine();
            while (!accountMap.get(tempUser).equals(tempPw)) {
                if (wrongPw == 3) {
                    System.out.println("You have entered the incorrect password too many times." +
                            "Returning to main menu...");
                    return;
                }
                else if (wrongPw == 2) {
                    System.out.println("Incorrect password. Please try again. 1 try left.");
                }
                else {
                    System.out.println("Incorrect password. Please try again. "
                            +(3-wrongPw)+" tries left.");
                }
                wrongPw++;
            }
            System.out.println("Login successful. Returning to main menu...");
        }
        else {
            System.out.println("User not found. Returning to main menu...");
        }
    }
    public static void register() {
        System.out.println("~~~Registration~~~");
        System.out.print("Username: ");
        String tempUser = scan.nextLine();
        while (accountMap.containsKey(tempUser)) {
            System.out.println("Username already exists. Please try again");
            System.out.print("Username: ");
            tempUser = scan.nextLine();
        }
        System.out.print("Password: ");
        String tempPw = scan.nextLine();
        while (!Pattern.matches("(([a-z]|[A-Z]|[0-9]|\\p{Punct}){8,})",tempPw)) {
            System.out.println("Password does not meet requirements. Please try again.");
            System.out.println("Password Requirements:");
            System.out.println("- Have at least 8 characters");
            System.out.println("- Include at least one of each of the following characters:");
            System.out.println("\t+ Lowercase letter");
            System.out.println("\t+ Uppercase letter");
            System.out.println("\t+ Number");
            System.out.println("\t+ Symbol");
            System.out.print("Password: ");
            tempPw = scan.nextLine();
        }
        accountMap.put(tempUser,tempPw);
        System.out.println("Account registration successful. Returning to main menu...");
    }
}
