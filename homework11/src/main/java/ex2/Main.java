package ex2;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String json = "";
        try {
            File jsonFile = new File ("employee.txt");
            Scanner read = new Scanner(jsonFile);
            while (read.hasNextLine())
                json += read.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            return;
        }
        System.out.println("Json string: " + json);

        Gson gson = new Gson();
        Employee employee = new Employee();
        employee = gson.fromJson(json,Employee.class);
        System.out.println("Employee: " + employee.toString());
    }
}
