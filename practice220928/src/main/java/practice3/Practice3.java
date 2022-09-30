package practice3;

public class Practice3 {
    public void dosth1() {
        int num = 1;
        Converter<Integer, String> conv = from -> String.valueOf(from + num);
    }
}
