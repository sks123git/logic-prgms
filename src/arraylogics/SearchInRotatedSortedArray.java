package arraylogics;

//Program to find the target in rotated array
public class SearchInRotatedSortedArray {
    public static int searchTarget(int array[], int low, int high, int target){
        if(high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[low] <= array[mid]) {
                if(target<=array[mid] && target>=array[low]){
                return searchTarget(array, low, mid-1, target);}
                else{
                    return searchTarget(array, mid+1, high,target);
                }
            } else {
                if(target>=array[mid] && target<=array[high]){
                    return searchTarget(array, mid+1, high, target);}
                else{
                    return searchTarget(array, low, mid-1,target);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {4,5,6,7,0,1,2};
        int min = 0;
        int max = array.length-1;
        int target = 1;
        int result = searchTarget(array,min,max,target);

            System.out.println("found at " + result);

    }
}
