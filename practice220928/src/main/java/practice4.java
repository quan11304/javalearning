import java.util.ArrayList;
import java.util.Arrays;

public class practice4 {
    public static void main(String[] args) {
        String[] languages = {"Java","C#","C++","PHP","Javascript"};
        for (String temp: languages) System.out.print(temp+" ");
        Arrays.asList(languages).stream().forEach(System.out::print);
    }
}
