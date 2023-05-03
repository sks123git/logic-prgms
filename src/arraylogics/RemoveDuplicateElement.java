package arraylogics;

import java.util.Arrays;

public class RemoveDuplicateElement {
public void removeDuplicate(int array[]){
    int newArray[] = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        int flag = 0;
        for (int j = i+1; j < array.length-1; j++) {
            if(array[j]==array[i]){
                flag=1;
            }
        }
        if(flag==0){
            newArray[i] = array[i];
            System.out.print(newArray[i] + ", ");
        }
    }
}
    public static void main(String[] args) {
    int array[] = {2,1,4,5,2,1,6,5,5};
        Arrays.sort(array);
        System.out.println("original array");
        for (int val:array) {
            System.out.print(val + ", ");
        }
    RemoveDuplicateElement removeDuplicateElement = new RemoveDuplicateElement();
    removeDuplicateElement.removeDuplicate(array);
    }
}

