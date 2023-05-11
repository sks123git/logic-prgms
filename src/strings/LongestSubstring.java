package strings;

import java.util.HashSet;
import java.util.Set;
public class LongestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        checkLongestSubstring(str);
    }
    static void checkLongestSubstring(String string){
        Set<Character> st = new HashSet<>();
        int max = 0;
        st.add(string.charAt(0));
        int count = 1;
        int i = 1;
        while ( i < string.length()) {
            // Checking if character is present in the set, if not present add that character in set and increase
            // the count by 1
                if (!st.contains(string.charAt(i)) && string.charAt(i)!= string.charAt(i-1) ){
                    st.add(string.charAt(i));
                    count++;
                    i++;
                    if (count>max) {
                        max = count;
                    }
                    // if character present in set then clear the set move the i index to the index of dupicate one
                }else {
                    st.clear();
                    i = i + count-1;
                    count = 0;
                }
        }
        System.out.println(max);
    }
}
