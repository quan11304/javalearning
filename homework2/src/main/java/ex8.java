public class ex8 {
    public static void main(String[] args) {
        int n = 6; //This is the number of lines
        for (int i = 1; i<=n; i++){ //i is number of asterisk to be input in that line
            for (int space = 1; space <= n-i ; space++){
                System.out.print("  ");
            }
            for (int at = 1; at <= i; at++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
