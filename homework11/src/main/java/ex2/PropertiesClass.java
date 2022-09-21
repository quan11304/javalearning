package ex2;

public class PropertiesClass {
    protected String age, salary;

    public PropertiesClass(String age, String salary) {
        this.age = age;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "age: " + age +
//                ", salary: " + salary;
//    }

    @Override
    public String toString() {
        return "PropertiesClass{" +
                "age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
