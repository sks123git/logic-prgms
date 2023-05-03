package arraylogics;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        ProductOfArrayExceptSelf ps = new ProductOfArrayExceptSelf();
        ps.getArray(array);
    }
    void getArray(int array[]){
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if(array[i]!=array[j]){
                    product *= array[j];
                }
            }
            result[i] = product;
            System.out.print(result[i]+" ");
        }
    }
}
