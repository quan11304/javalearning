package ex6;

public class Nguoi {
    protected String name; protected int age;
    protected String hometown; protected int ID;

    public Nguoi(String name, int age, String hometown, int ID) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
