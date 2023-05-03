package arraylogics;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int array[] = {1,3,2};
        int i,j;
        int breakPoint = 0;
        for (i = array.length - 2; i >= 0; i--) {
            if (array[i] < array[i+1]){
                breakPoint = i;
                break;
            }
        }

        if (breakPoint < 0){
            reverse(array,0);
        } else {
            int min = Integer.MAX_VALUE;
            int noToSwap = array[breakPoint-1];
            for (j = array.length-1; i >= i; j--) {
                if (array[j] > array[i]) {
                    break;
                }
            }
            swap(array,i,j);
            reverse(array,breakPoint);
        }
        for (int a:array) {
            System.out.print(a+" ");
        }
    }

    public static void reverse(int[] array,int start){
        int s = start;
        int end = array.length-1;
        while (s<end){
            swap(array,s,end);
            s++;
            end--;
        }
    }
    public static void swap(int[] array,int start, int end){
        int temp = array[start];
        array[start]  = array[end];
        array[end] = temp;
    }
}
