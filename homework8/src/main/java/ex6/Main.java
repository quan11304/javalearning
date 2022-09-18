package ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Nguoi> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int ans = 1;
        do {
            if (ans >= 1 && ans <= 3) {
                System.out.println("~~~Teachers Manager~~~");
                System.out.println("| 1. Add | 2. Delete | 3. Display | 4. Exit |");
            }
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> add();
                case 2 -> delete();
                case 3 -> display();
                case 4 -> System.out.println("Exiting the programme...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (ans != 4);
    }
    public static void add(){
        Scanner scan = new Scanner (System.in);
        System.out.println("~~~Creating new teacher's profile~~~");
        System.out.print("Name: "); String tempName = scan.nextLine();
        System.out.print("Age: "); int tempAge = scan.nextInt();
        System.out.print("Hometown: "); scan.nextLine(); String tempHometown = scan.nextLine();
        System.out.print("Teacher ID: "); int tempID = scan.nextInt();
        System.out.print("Salary: "); int tempSalary = scan.nextInt();
        System.out.print("Bonus: "); int tempBonus = scan.nextInt();
        System.out.print("Deductions: "); int tempDeduction = scan.nextInt();
        Nguoi tempTeacher = new CBGV(tempName,tempAge,tempHometown,tempID,
                tempSalary,tempBonus,tempDeduction,tempSalary+tempBonus-tempDeduction);
        arrayList.add(tempTeacher);
        System.out.println("Profile added successfully. Returning to main menu...");
    }
    public static void delete(){
        System.out.println("~~~Deleting teacher's profile~~~");
        System.out.println("Enter profile ID for deletion: ");
        Scanner scan = new Scanner (System.in);
        int query = scan.nextInt();
        for (Nguoi temp: arrayList) {
            if (temp.getID() == query) {
                arrayList.remove(temp);
                System.out.println("Profile deleted successfully. Returning to main menu...");
                return;
            }
        }
        System.out.println("Profile not found. No profiles were deleted. Returning to main menu...");
    }
    public static void display(){
        for (Nguoi temp: arrayList) {
            System.out.println(temp.toString());
        }
    }
}
