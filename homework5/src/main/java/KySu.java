public class KySu extends CanBo {
    String specialisation;

    public KySu(String name, int age, String gender, String address, String specialisation) {
        super(name, age, gender, address);
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "specialisation='" + specialisation + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
