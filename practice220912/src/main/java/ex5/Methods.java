package ex5;

import java.util.ArrayList;

public class Methods {
    static ArrayList<Student> studentArrayList = new ArrayList<>();
    static int length = 0;

    public static void AddStudents(Student temp) {
        studentArrayList.add(temp);
        length++;
    }

    public static Student DisplayInfo(int i) {
        return studentArrayList.get(i);
    }
}
