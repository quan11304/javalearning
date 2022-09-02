public class ex3 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        for (int i=0;i<array.length;i++) {
            System.out.printf("%-2d ",array[i]);
        } //Printing out the original array

        for (int i=array.length-1;i>2;i--) {
            array[i] = array[i-1];
        }
        array[3-1] = 5;

        System.out.println();
        for (int i=0;i<array.length;i++) {
            System.out.printf("%-2d ",array[i]);
        } //Printing out the modified array
    }
}
