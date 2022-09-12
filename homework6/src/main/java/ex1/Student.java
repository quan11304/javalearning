package ex1;

public class Student {
    String name; int age; String inclass;

    public Student(String name, int age, String inclass) {
        this.name = name;
        this.age = age;
        this.inclass = inclass;
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

    public String getInclass() {
        return inclass;
    }

    public void setInclass(String inclass) {
        this.inclass = inclass;
    }
}
