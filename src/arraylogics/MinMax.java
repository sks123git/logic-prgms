package arraylogics;

//Program to find min and max
public class MinMax {
    public void minMax(int array[]){
        int min,max;
        min = array[0];
        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: "+ min);
        System.out.println("Max: "+ max);
    }
    public static void main(String[] args) {
        int array[] = {4,2,5,23,11,3,6};
        MinMax findMinMax = new MinMax();
        findMinMax.minMax(array);
    }
}