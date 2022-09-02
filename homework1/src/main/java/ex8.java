public class ex8 {
    public static void main(String[] args) {
            int rnd = (int) Math.ceil(Math.random()*1000);
            System.out.println("Randomly generated number is: "+rnd);

            int sum = 0, temp;
            for (int i=3;i>=0;i--){
                temp = (int) (rnd / Math.pow(10,i));
                rnd -= temp*Math.pow(10,i);
                sum += temp;
            }
            System.out.println(sum);
    }
}
