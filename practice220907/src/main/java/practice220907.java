import java.util.regex.*;
import java.util.Scanner;

public class practice220907 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w[^_]+");
        Scanner scan = new Scanner (System.in);
        String query = scan.nextLine();
        Matcher matcher = pattern.matcher(query);
        boolean test = matcher.matches();
        System.out.println(test);
    }
}
