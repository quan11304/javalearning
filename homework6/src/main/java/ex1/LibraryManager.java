package ex1;
import java.util.ArrayList;
import java.util.Scanner;
public class LibraryManager {
    static ArrayList<BorrowInfo> info = new ArrayList<>();
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
        info.add();
    }
    public static void returnbook() {}
    public static void displayinfo() {}
}
