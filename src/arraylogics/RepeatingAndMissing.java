package arraylogics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        int array[] = {2,4,1,2,5};
        RepeatingAndMissing repeatingAndMissing = new RepeatingAndMissing();
        repeatingAndMissing.findRepeatingAndMissing(array);
    }
    public void findRepeatingAndMissing(int[] array) {
        int missing=0;
        int repeating=0;
        Arrays.sort(array);
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(arr.add(array[i])==false)
            {  repeating = array[i];
            missing = repeating+1;
            }
        }
        System.out.println(repeating+", "+missing);
    }
}
