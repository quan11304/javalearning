import java.util.Scanner;
public class ex11a {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Hours to days and years converter");
        System.out.print("Hours: "); int input = scan.nextInt();

        int year = input / (24*365);
        int day = (input % (24*365)) / 24;
        int hour = input % (24*365) % 24;
        System.out.printf("%d hours is %d year(s), %d day(s) and %d hour(s)",input,year,day,hour);
    }
}
