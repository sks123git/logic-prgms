package arraylogics;

//Program to find the largest sum of sub array
public class LargestSumInSubArray {
    public void maxSum(int array[]){
        int maxSum = array[0];
        //If array has only one element then return
        if(array.length==1){
            System.out.println("There is only one item in array");
            return;
        }
        //Calculating sum and comparing with maximum sum
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum +=array[j];
                if(sum>=maxSum)
                    maxSum = sum;
            }
        }

        System.out.println("Largest sum of an subarray is: " + maxSum);

    }
    public static void main(String[] args) {
        int array[] = {5,4,-1,7,8};
        LargestSumInSubArray largestSumInSubArray = new LargestSumInSubArray();
        largestSumInSubArray.maxSum(array);
    }
}
