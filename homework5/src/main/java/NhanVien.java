public class NhanVien extends CanBo {
    String task;

    public NhanVien(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }
}
