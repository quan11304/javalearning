public class ex2 {
    public static void main(String[] args) {
        int numbers[] = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        float avg = (float) sum/numbers.length;
        System.out.println("Average value of array elements is " + avg);
    }
}
