import java.util.Scanner;
public class QLCB {
    static CanBo[] array = new CanBo[100]; static int arraycount = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
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
                case 1 -> System.out.println("~~~Thêm công nhân mới~~~");
                case 2 -> System.out.println("~~~Thêm kỹ sư mới~~~");
                case 3 -> System.out.println("~~~Thêm nhân viên mới~~~");
                default -> {
                    System.out.println("Lỗi. Vui lòng chọn lại.");
                    ans = scan.nextInt();
                }
            }
        } while (ans < 1 || ans > 3); // Filter invalid input.

        System.out.print("Họ và tên: "); String tempName = scan.next();
        System.out.print("Tuổi: "); int tempAge = scan.nextInt();
        System.out.print("Giới tính (Nam = 1; Nữ = -1; Khác = 0): ");
        int tempGenderInt = scan.nextInt();
        String tempGender = null;
        do {
            switch (tempGenderInt) {
                case -1 -> tempGender = "Nam";
                case 0 -> tempGender = "Khác";
                case 1 -> tempGender = "Nữ";
                default -> {
                    System.out.print("Lỗi. Vui lòng chọn lại.");
                    tempGenderInt = scan.nextInt();
                }
            }
        } while (tempGenderInt < -1 || tempGenderInt > 1);
        System.out.print("Địa chỉ: "); String tempAddress = scan.next();

        CanBo tempCanBo = null;
        switch (ans) {
            case 1 -> {
                System.out.print("Bậc (1-10): ");
                int tempLevel = scan.nextInt();
                tempCanBo = new CongNhan(tempName, tempAge, tempGender, tempAddress, tempLevel);
            }
            case 2 -> {
                System.out.print("Ngành đào tạo: ");
                String tempSpecialisation = scan.next();
                tempCanBo = new KySu(tempName, tempAge, tempGender, tempAddress, tempSpecialisation);
            }
            case 3 -> {
                System.out.print("Công việc: ");
                String tempTask = scan.next();
                tempCanBo = new NhanVien(tempName, tempAge, tempGender, tempAddress, tempTask);
            }
        }
        array[arraycount++] = tempCanBo;
        System.out.println("Thêm cán bộ thành công! Đang quay trở về màn hình chính...");
    }
    public static void find() {
        System.out.println("~~~Tìm kiếm cán bộ theo tên~~~");
        System.out.print("Tên: ");
        Scanner scan = new Scanner(System.in);
        String query = scan.nextLine();
        int count = 0;
        for (int i = 0; i<arraycount; i++) {
            if (query.contains(array[i].getName())) {
                System.out.println(array[i].toString());
                count++;
            }
        }
        System.out.println("Tìm kiếm hoàn tất. Tìm được "+count+" kết quả.");
        System.out.println("Đang quay trở về màn hình chính...");
    }
    public static void list() {
        for (int i = 0; i < arraycount; i++) {
            System.out.println(array[i].toString());
        }
    }
}