package arraylogics;

public class FindSecondLargest {
    public void getSecondLargest(int array[]){
        int max = array[0];
        int secondMax = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>=max){
                secondMax = max;
                max=array[i];
            } else if (array[i]>= secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void main(String[] args) {
        int array[] = {3,2,5,10,2,6,8,12};
        FindSecondLargest findSecondLargest = new FindSecondLargest();
        findSecondLargest.getSecondLargest(array);
    }
}
