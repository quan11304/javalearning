import java.lang.Math;
public class ex10 {
    public static void main(String[] args) {
        System.out.println("test");
        double rnd;
        do {
            rnd = Math.random()*25;
        } while (rnd<5);
        System.out.println((int) rnd);
    }
}
