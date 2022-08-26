public class ex6 {
    public static int combination(int n, int r) {
        int primo_n=1, primo_r=1, primo_nr=1, result;
        for (int i = 1; i <= n; i++) primo_n*=i;
        for (int i = 1; i <= r; i++) primo_r*=i;
        for (int i = 1; i <= (n-r); i++) primo_nr*=i;
        result = primo_n/(primo_r*primo_nr);
        return result;
    }

    public static void main(String[] args) {
        int n = 4; //Number of lines minus 1
        for (int i = 0; i <= n; i++){
            for (int space = 0; space <= n-i ; space++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(combination(i,j) + " ");
            }
            System.out.println();
        }
    }
}
