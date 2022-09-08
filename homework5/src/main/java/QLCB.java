import java.util.Scanner;
public class QLCB {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String test = scan.next();
        System.out.println(test);
        int ans = 1;
        do {
            if (ans >= 1 && ans <= 3) {
                System.out.println("~~~Trình quản lý cán bộ~~~");
                System.out.println("| 1. Thêm mới | 2. Tìm kiếm | 3. Danh sách | 4. Thoát |");
            } //This menu will only show up at the beginning, or after a task is finished.
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> create();
                case 2 -> find();
                case 3 -> list();
                case 4 -> System.out.println("Đang thoát chương trình...");
                default -> System.out.println("Lỗi. Vui lòng chọn lại");
            }
        } while (ans!=4);
    }

    public static void create() {
        System.out.println("~~~Thêm nhân viên mới~~~");
        System.out.println("| 1. Công nhân | 2. Kỹ sư | 3. Nhân viên |");
        Scanner scan = new Scanner (System.in);
        int ans = scan.nextInt();
        do {
            switch (ans) {
                case 1:
                    System.out.println("~~~Thêm công nhân mới~~~");
                    break;
                case 2:
                    System.out.println("~~~Thêm kỹ sư mới~~~");
                    break;
                case 3:
                    System.out.println("~~~Thêm nhân viên mới~~~");
                    break;
                default:
                    System.out.println("Lỗi. Vui lòng chọn lại.");
                    ans = scan.nextInt();
            }
        } while (ans >= 1 && ans <= 3); // Filter invalid input.
    }
    public static void find() {
    }
    public static void list() {
    }
}