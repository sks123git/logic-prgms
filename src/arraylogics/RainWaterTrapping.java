package arraylogics;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        RainWaterTrapping rainWaterTrapping = new RainWaterTrapping();
        rainWaterTrapping.getUnit(array);
    }

    void getUnit(int array[]){
        int len = array.length;
        int left[] = new int[len];
        int right[] = new int[len];
        int units = 0;
        left[0] = array[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(left[i-1],array[i]);
        }
        right[len-1] = array[len-1];
        for (int i = len-2; i >= 0 ; i--) {
            right[i] = Math.max(right[i+1],array[i]);
        }
        for (int i = 0; i < len; i++) {
            units += (Math.min(left[i],right[i]) - array[i]);
        }
        System.out.println(units);
    }// left  3,3,4,---
    //  right 4,3,4,---
}
