package arraylogics;//Chocolate distribution problem. To find minimum difference in subarray in sorted array
import java.util.Arrays;
public class MinimumDifferenceInSubArray {
    public static void main(String[] args) {
        int array[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int noOfStudents = 5;
        Arrays.sort(array);
        int minDifference = array[array.length-1];
        minDifference(array, noOfStudents, minDifference);
    }

    public static void minDifference(int[] array, int num, int minDifference) {
        int min;
        for (int i = 0; i < array.length-num-1; i++) {
            int start = i;
            int end = i+(num-1);
            min = array[end] - array[start];
            if(min<minDifference)
                minDifference = min;
        }
        System.out.println("Minimum difference is: " + minDifference);
    }
}
