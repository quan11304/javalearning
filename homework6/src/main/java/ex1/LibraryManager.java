package ex1;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManager {
    static ArrayList<BorrowInfo> infoArrayList = new ArrayList<>();
    static int idcount = 0;
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        int sel = 1;
        do {
            if (sel == 1 || sel == 2 || sel == 3) {
                System.out.println("~~~Library Manager~~~");
                System.out.println("| 1. Borrow | 2. Return | 3. Display borrow info | 4. Exit |");
            }
            sel = scan.nextInt();
            switch (sel) {
                case 1 -> borrowbook();
                case 2 -> returnbook();
                case 3 -> displayinfo();
                case 4 -> System.out.println("Exiting programme...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (sel != 4);
        scan.close();
    }
    public static void borrowbook() {
        System.out.println("~~~Create new borrow entry (Borrow)~~~");
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        String tempName = scan.nextLine();
        System.out.print("Age: ");
        int tempAge = scan.nextInt();
        System.out.print("Class: "); scan.nextLine();
        String tempInclass = scan.nextLine();
        System.out.printf("Borrow ID: %d\n",++idcount); //tempBorrowid = idcount.
        // Borrow ID will be automatically created.
        System.out.print("Book ID: ");
        int tempBookid = scan.nextInt();
        System.out.print("Borrow date: "); scan.nextLine();
        String tempBorrowdate = scan.nextLine();
        System.out.print("Return date: ");
        String tempReturndate = scan.nextLine();
        BorrowInfo temp = new BorrowInfo(tempName, tempAge, tempInclass,
                idcount, tempBookid, tempBorrowdate, tempReturndate);
        infoArrayList.add(temp);
        System.out.println("Borrow entry created. Returning to main menu...");
    }
    public static void returnbook() {
        System.out.println("~~~Delete existing borrow entry (Return)~~~");
        Scanner scan = new Scanner(System.in);
        System.out.println("Borrow ID: "); int query = scan.nextInt();
        for (BorrowInfo temp: infoArrayList) {
            if (query == temp.getBorrowid()) {
                infoArrayList.remove(temp);
                System.out.println("Borrow entry deleted. Returning to main menu...");
                return;
            }
        }
        System.out.println("ID not found. No entry was deleted. Returning to main menu...");
    }
    public static void displayinfo() {
        System.out.println("~~~Borrow entries information~~~");
        System.out.println(infoArrayList.toString());
        System.out.println("All entries are displayed. Returning to main menu...");
    }
}
