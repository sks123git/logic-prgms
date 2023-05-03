package arraylogics;

public class PrintPermutations {
    public static void printPermutation(int array[], int currentIndex){
        if(currentIndex == array.length-1){
            display(array);
            return;
        }

        for (int i = currentIndex; i < array.length; i++) {
            swap(array, i, currentIndex);
            printPermutation(array, currentIndex+1);
            swap(array, i, currentIndex);
        }
    }

    public static void display(int array[]){
        System.out.println();
        for (int i:array) {
            System.out.print(i);
        }
    }
    public static void swap(int array[], int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        int currentIndex = 0;
        printPermutation(arr,currentIndex);
    }
}
