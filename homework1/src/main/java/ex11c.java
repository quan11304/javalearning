import java.util.Scanner;

public class ex11c {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Seconds to days and years converter");
        System.out.print("Seconds: "); int input = scan.nextInt();

        int year = input / (60*60*24*365);
        int day = (input % (60*60*24*365)) / (60*60*24);
        int second = input % (60*60*24*365) % (60*60*24);
        System.out.printf("%d seconds is %d year(s), %d day(s) and %d second(s)",input,year,day,second);
    }
}
