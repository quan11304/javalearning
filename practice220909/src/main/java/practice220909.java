import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class practice220909 {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("red");
        alist.add("orange");
        alist.add("yellow");
        alist.add("green");
        alist.add("blue");
        alist.add("indigo");
        alist.add("violet");
        for (String temp: alist) {
            System.out.printf("%s ",temp);
        }

        System.out.print("\nLook up value: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (String temp: alist) {
            if (input.equals(temp)) {
                System.out.println(temp);
                break;
            }
        }

        Collections.sort(alist);
        for (String temp: alist) {
            System.out.printf("%s ",temp);
        }
    }
}
