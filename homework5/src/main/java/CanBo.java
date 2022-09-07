public class CanBo {
    String name;
    int age;
    String gender;
    String address;

    public static class CongNhan extends CanBo {
        int level;
    }

    public static class KySu extends CanBo {
        String specialisation;
    }

    public static class NhanVien extends CanBo {
        String task;
    }
}
