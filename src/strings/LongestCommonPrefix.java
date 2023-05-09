package strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] string = {"flower","flow","flight"};
        checkLongestCommonPrefix(string);
    }
    static void checkLongestCommonPrefix(String[] str){
        Arrays.sort(str);
        for (int i = 0; i < str[0].length(); i++) {
            if (str[0].charAt(i) == str[str.length-1].charAt(i)){
                System.out.print(str[0].charAt(i));
            } else {
                return;
            }
        }

    }
}
