package pack;
import java.util.Scanner;

public class classsss {
    public static void main(String[] args) {
        System.out.print("Index: ");

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        String string = "ASCII";
        System.out.printf("\nCharacter in string %s at index #%i",string,i,string.charAt(i-1));
    }
}
