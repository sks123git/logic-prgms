package strings;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "car";
        int flag = 0;
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                flag = 1;
            }
        }
        if (flag !=1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
