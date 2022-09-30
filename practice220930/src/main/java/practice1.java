import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

import static java.util.stream.Collectors.toList;

public class practice1 {
    record ScoreInfo(String firstName,
                     String lastName,
                     int score) {}
    static ScoreInfo[] scoreData = new ScoreInfo[]{
            new ScoreInfo("Nguyen", "Thuan", 70),
            new ScoreInfo("Le", "La", 85),
            new ScoreInfo("Phung", "Do", 82),
            new ScoreInfo("Tran", "Cung", 97),
            new ScoreInfo("Nguyen", "Tien", 66),
            new ScoreInfo("Dinh", "Hung", 80),
            new ScoreInfo("Tran", "Nam", 48),
            new ScoreInfo("Van", "Cao", 90),
            new ScoreInfo("Nhu", "Ca", 55),
            new ScoreInfo("Pham", "Thach", 73),
            new ScoreInfo("Le", "Duan", 54),
            new ScoreInfo("Tran", "Phu", 78),
            new ScoreInfo("Pham", "Dong", 51),
            new ScoreInfo("Ha", "Lan", 93),
            new ScoreInfo("Dang", "Ha", 95)
    };
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            // Enter number of corresponding exercise.
            // Enter an invalid number (default 0) will terminate the programme.
            System.out.print("Task No. ");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                default -> {}
            }
            System.out.println();
        } while (ans >= 1 && ans <= 5);
    }
    public static void task1() {
        long result = Arrays.stream(scoreData).count();
        System.out.println(result);
    }
    public static void task2() {
        double result = Arrays.stream(scoreData)
                .mapToInt(temp -> temp.score).average().getAsDouble();
        System.out.println(result);
    }
    public static void task3() {
        long result = Arrays.stream(scoreData)
                .mapToInt(temp -> temp.score).filter(temp -> temp >= 90).count();
        System.out.println(result);
    }
    public static void task4() {
        List<ScoreInfo> list = Arrays.stream(scoreData).
                filter(temp -> temp.score < 70).collect(toList());
        System.out.println(list);
    }
    public static void task5() {
        Arrays.stream(scoreData).sorted(Comparator.comparing(o -> o.lastName))
                .forEach(System.out::println);
    }
    public static void task6() {
        Arrays.stream(scoreData).sorted(Comparator.comparingInt(o -> o.score))
                .forEach(System.out::println);
    }
}
