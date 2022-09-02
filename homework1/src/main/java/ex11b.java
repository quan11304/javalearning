import java.util.Scanner;

public class ex11b {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Minutes to days and years converter");
        System.out.print("Minutes: "); int input = scan.nextInt();

        int year = input / (60*24*365);
        int day = (input % (60*24*365)) / (60*24);
        int minute = input % (60*24*365) % (60*24);
        System.out.printf("%d minutes is %d year(s), %d day(s) and %d minute(s)",input,year,day,minute);
    }
}
