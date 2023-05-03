package arraylogics;

import java.util.HashSet;
import java.util.Set;

//Program to find duplicate in an array and return true if duplicate exists
//optimize a solution to achieve O(n) time comp
//modify the solution to return the duplicate elmts
public class FindingDuplicateInArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 2, 3, 4, 3, 1};
        FindingDuplicateInArray findingDuplicateInArray = new FindingDuplicateInArray();
        findingDuplicateInArray.checkDuplicate(array);
    }
public void checkDuplicate(int[] array){
        Set<Integer> setList = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
        if (setList.add(array[i])==false){
            System.out.println(array[i]);
        }
    }
}
    //    public void checkDuplicate(int[] array) {
//        Arrays.sort(array);
//        Set<Integer> setList = new HashSet<>();
//        for (int i = 0; i < array.length-1; i++) {
//            if(array[i] == array[i+1])
//
//                    setList.add(array[i]);
//        }
//        setList.forEach(System.out::println);
//    }
//    public void checkDuplicate(int[] array) {
//        Set<Integer> setList = new HashSet<>();
//        int toBeCheckedvalue = array[0];
//        int i = 0;
//        int j = 0;
//        int count = 0;
//        while (i < array.length) {
//            if (toBeCheckedvalue == array[i]) {
//                ++count;
//                if (count == 2 && j != array.length - 1) {
//                    setList.add(toBeCheckedvalue);
//                }
//                toBeCheckedvalue = array[++j];
//                j++;
//                i++;
//                count = 0;
//            } else {
//                i++;
//            }
//        }
//        setList.forEach(System.out::println);
//    }
}