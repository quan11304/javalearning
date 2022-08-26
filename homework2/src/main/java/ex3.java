public class ex3 {
    public static void main(String[] args) {
        int n = 4; //Number appearing at the bottom line
        for (int i = 1; i <= n; i++){
            for (int space = 0; space <= n-i ; space++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
