public class ex4 {
    public static void main(String[] args) {
        int number = 1;
        for (int i=1;i<=5;i++){
            for (int j = 1;j<=i;j++){
                System.out.printf("%-2d ",number++);
            }
            System.out.println();
        }
    }
}
