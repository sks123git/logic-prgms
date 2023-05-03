package arraylogics;

public class PrimeNoInRange {

    public static void main(String[] args) {
        int array[] = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        int j=1;
        while (j<array.length){
            int flag = 0;
            for (int i = 2; i < j; i++) {
                if(array[j] % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag!=1){
                System.out.print(array[j] + ", ");
            }
            j++;
        }
    }
}
