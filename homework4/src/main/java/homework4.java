import java.util.Scanner;
public class homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            // Enter number of corresponding exercise.
            // Enter an invalid number (default 0) will terminate the programme.
            System.out.print("Exercise No. ");
            ans = scan.nextInt();
            switch (ans) {
                case 1 -> ex1();
                case 2 -> ex2();
                case 3 -> ex3();
                case 4 -> ex4();
                case 5 -> ex5();
                default -> {}
            }
            System.out.println();
        } while (ans >= 1 && ans <= 5);
    }

    public static void ex1() {
        Scanner scan = new Scanner (System.in);
        System.out.print("Number of elements in array: "); int n = scan.nextInt();

        // Inputting values
        int[] array = new int[n];
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

    public static void ex2() {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        float avg = (float) sum/numbers.length;
        System.out.println("Average value of array elements is " + avg);
    }

    public static void ex3() {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        for (int i : array) {
            System.out.printf("%-2d ", i);
        } //Printing out the original array

        for (int i=array.length-1;i>2;i--) {
            array[i] = array[i-1];
        }
        array[3-1] = 5;

        System.out.println();
        for (int i : array) {
            System.out.printf("%-2d ", i);
        } //Printing out the modified array
    }

    public static void ex4() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        for (String i : array1) {
            for (String j : array2) {
                if (i.equals(j)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static void ex5() {
        int[] array_nums = {5, 7, 2, 4, 9};
        int min, max;
        min = max = array_nums[0];
        for (int i=1;i<array_nums.length;i++) {
            if (array_nums[i]<min) min = array_nums[i];
            else if (array_nums[i]>max) max = array_nums[i];
        }

        int sum = 0,exception = 0;
        for (int array_num : array_nums) {
            if (array_num != min && array_num != max) sum += array_num;
            else exception++;
        }
        float avg = (float) sum/(array_nums.length-exception);
        System.out.println("Average value of array elements, " +
                "excluding maximum and minimum value: " + avg);
    }
}
