package arraylogics;

//Program to reverse the array
public class ArrayReverse {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        System.out.println("Array before reverse: ");
        for (int value:array) {
            System.out.print(value + ", ");
        }
        ArrayReverse arrayReverse = new ArrayReverse();
        arrayReverse.reverseArray(array,0, array.length-1);
        arrayReverse.printArray(array, array.length);
    }
//to reverse the array using recursion
    public void reverseArray(int[] array,int start,int end) {
        int temp;
        if (start>=end)
            return;
           temp = array[start];
           array[start] = array[end];
           array[end] = temp;
        reverseArray(array,start+1,end-1);
    }
//Printing the reversed array
    public void printArray(int array[], int size){
        System.out.println();
        System.out.println("Array after reverse: ");
        for (int value:array) {
            System.out.print(value + ", ");
        }
    }
}
