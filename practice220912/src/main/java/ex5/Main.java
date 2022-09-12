package ex5;

import java.util.Scanner;

import static ex5.Methods.length;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            System.out.println("~~~Student Manager~~~");
            System.out.println("| 1. Add new student | 2. Display 20-year-old students |" +
                    " 3. Count 23-year-old students from Danang");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> add();
                case 2 -> display();
                case 3 -> count();
                default -> System.out.println("Exiting the programme...");
            }
        } while (ans >= 1 && ans <= 3);
    }
    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("~~~Adding new students~~~");
        System.out.println("Name: ");
        String tempName = scan.nextLine();
        System.out.println("Age: "); int tempAge = scan.nextInt();
        System.out.println("Hometown: ");
        scan.nextLine(); // Avoid nextLine() skips
        String tempHometown = scan.nextLine();
        System.out.println("Class: ");
        String tempInclass = scan.nextLine();
        Student temp = new Student(tempInclass,tempName,tempAge,tempHometown);
        Methods.AddStudents(temp);
        System.out.println("Student added successfully. Returning to main menu...");
    }
    public static void display() {
        System.out.println("~~~Printing 20-year-old students' information~~~");
        for (int i=0;i<length;i++){
            if (Methods.studentArrayList.get(i).getAge() == 20)
                System.out.println(Methods.DisplayInfo(i));
        }
        System.out.println("Searching finished. Returning to main menu...");
    }
    public static void count() {
        System.out.println("~~~Counting 23-year-old students from Da Nang~~~");
        int count = 0;
        for (int i=0;i<length;i++) {
            if ((Methods.studentArrayList.get(i).getHometown().equalsIgnoreCase("danang") || // Hometown in Danang
                Methods.studentArrayList.get(i).getHometown().equalsIgnoreCase("da nang")) // Hometown in Da Nang
                    && Methods.studentArrayList.get(i).getAge() == 23) // 23 years old
            count++; // Increase this variable by 1 if condition is true
        }
        System.out.println("Counting finished. Found a total of "+count+" 23-year-old student(s) from Da Nang.");
        System.out.println("Returning to main menu...");
    }
}
