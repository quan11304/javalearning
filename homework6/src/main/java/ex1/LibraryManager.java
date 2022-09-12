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
        System.out.print("\nName: "); String tempName = scan.next();
        System.out.print("Age: "); int tempAge = scan.nextInt();
        System.out.print("Class: "); String tempInclass = scan.next();
        System.out.printf("Borrow ID: %i",++idcount); //tempBorrowid = idcount
        System.out.print("Book ID: "); int tempBookid = scan.nextInt();
        System.out.print("Borrow date: "); String tempBorrowdate = scan.next();
        System.out.print("Return date: "); String tempReturndate = scan.next();
        BorrowInfo temp = new BorrowInfo(tempName, tempAge, tempInclass,
                idcount, tempBookid, tempBorrowdate, tempReturndate);
        infoArrayList.add(temp);
        System.out.println("Borrow entry created. Returning to main menu...");
    }
    public static void returnbook() {
        System.out.println("~~~Delete existing borrow entry (Return)~~~");
        Scanner scan = new Scanner(System.in);
        System.out.println("Borrow ID: "); int query = scan.nextInt();
        infoArrayList.remove(query+1);
        System.out.println("Borrow entry deleted. Returning to main menu...");
    }
    public static void displayinfo() {
        System.out.println("~~~Borrow entries information~~~");
        
    }
}
