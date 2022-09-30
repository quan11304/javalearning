import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class practice1 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java","C#","C++","PHP","JavaScript");
        System.out.println(languages);
        Collections.sort(languages, String::compareTo);
        System.out.println(languages);
    }
}
