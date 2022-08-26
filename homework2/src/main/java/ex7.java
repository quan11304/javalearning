public class ex7 {
    public static void main(String[] args) {
        int n = 6; //This is the number of lines
        for (int i = n; i>=1; i--){ //i is number of asterisk to be input in that line
            for (int space = i; space <6 ; space++){
                System.out.print("  ");
            }
            for (int asterisk = i; asterisk >= 1; asterisk--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
