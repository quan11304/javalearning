package ex5;

public class Student extends Class {
    String name; int age; String hometown;

    public Student(String inclass, String name, int age, String hometown) {
        super(inclass);
        this.name = name;
        this.age = age;
        this.hometown = hometown;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", inclass='" + inclass + '\'' +
                '}';
    }
}
