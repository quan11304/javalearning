import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Number of elements in array: "); int n = scan.nextInt();

        // Inputting values
        int array[] = new int[n];
        for (int i=0;i<n;i++) {
            System.out.printf("Element #%d: ",i+1);
            array[i] = scan.nextInt();
        }

        // Outputting values
        System.out.println("\nPrinting value of array elements...");
        for (int i: array) {
            System.out.print(i+" ");
        }

        // Altering even values
        System.out.println("\nAdding 1 to even values of the array...");
        for (int i=0;i<n;i++) {
            if (array[i] % 2 == 0) array[i]++;
            System.out.print(array[i] + " ");
        }
    }
}
