public class ex9a {
    public static void main(String[] args) {
        int n = 7; //This is the number of the line in the middle.
        for (int i = 1; i<=(n*2-1); i+=2){ //i is the number of asterisks
            for (int space = 0; space <= n*2-i ; space+=2){
                System.out.print("  ");
            }
            for (int asterisk = 1; asterisk <= i; asterisk++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = (n-1)*2-1; i>0; i-=2){
            for (int space = 0; space <= n*2-i ; space+=2){
                System.out.print("  ");
            }
            for (int asterisk = 1; asterisk <= i; asterisk++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
