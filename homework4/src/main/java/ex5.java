public class ex5 {
    public static void main(String[] args) {
        int array_nums[] = {5, 7, 2, 4, 9};
        int min, max;
        min = max = array_nums[0];
        for (int i=1;i<array_nums.length;i++) {
            if (array_nums[i]<min) min = array_nums[i];
            else if (array_nums[i]>max) max = array_nums[i];
        }

        int sum = 0,exception = 0;
        for (int i=0;i<array_nums.length;i++) {
            if (array_nums[i]!=min && array_nums[i]!=max) sum += array_nums[i];
            else exception++;
        }
        float avg = (float) sum/(array_nums.length-exception);
        System.out.println("Average value of array elements, excluding maximum and minimum value: " + avg);
    }
}
