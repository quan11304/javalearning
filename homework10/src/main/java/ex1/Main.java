package ex1;

import java.util.Scanner;
import java.util.regex.Pattern;

import static ex1.Account.alaccount;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String pwregex = "^\\w+(\\+\\w+)?@\\w+\\.com$";
    public static void main(String[] args) {
        int ans;
        do {
            System.out.println("~~~Account Manager~~~");
            System.out.println("| 1. Add an account | 2. Change balance |" +
                    "3. Change account email | 4. Display all account information | 5. Exit |");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> add();
                case 2 -> change_balance();
                case 3 -> change_email();
                case 4 -> display();
                case 5 -> System.out.println("Exiting the programme....");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (ans != 5);
    }
    public static void add() {
        System.out.println("~~~Account registration~~~");
        System.out.print("Name: "); scan.nextLine();
        String tempName = scan.nextLine();
        System.out.print("Email: ");
        String tempEmail = scan.nextLine();
        while (!Pattern.matches(pwregex,tempEmail)){
            System.out.println("Invalid email address. Please try again.");
            System.out.print("Email: ");
            tempEmail = scan.nextLine();
        }
        System.out.print("Account no.: ");
        int tempNumber = scan.nextInt();
        System.out.print("Initial balance: ");
        double tempBalance = scan.nextDouble();
        Account temp = new Account(tempName,tempEmail,tempNumber,tempBalance);
        alaccount.add(temp);
        System.out.println("Registration successful. Returning to main menu...");
    }
    public static void change_balance() {
        System.out.println("~~~Withdraw/Deposit~~~");
        System.out.print("Account No.: ");
        int tempNumber = scan.nextInt();
        for (Account temp: alaccount) {
            if (tempNumber == temp.accountNumber) {
                System.out.print("Enter amount to be withdrawn/deposited: ");
                double tempBalance = scan.nextDouble();
                temp.recharge(tempBalance);
                return;
            }
        }
        System.out.println("No account found. Returning to main menu...");
    }
    public static void change_email() {
        System.out.println("~~~Change account email~~~");
        System.out.print("Account No.: ");
        int tempNumber = scan.nextInt();
        for (Account temp: alaccount) {
            if (temp.getAccountNumber() == tempNumber) {
                System.out.print("Enter new email: ");
                String tempEmail = scan.nextLine();
                while (!Pattern.matches(pwregex,tempEmail) ||
                        temp.getEmail().equalsIgnoreCase(tempEmail)){
                    if (!Pattern.matches(pwregex,tempEmail))
                        System.out.println("Invalid email address. Please try again.");
                    else
                        System.out.println("Error. Email currently in use.");
                    System.out.print("Enter new email: ");
                    tempEmail = scan.nextLine();
                }
                temp.changeEmail(tempEmail);
                return;
            }
        }
        System.out.println("No account found. Returning to main menu...");
    }
    public static void display() {
        Account temp = new Account("","",0,0);
        temp.displayInfo();
    }
}
