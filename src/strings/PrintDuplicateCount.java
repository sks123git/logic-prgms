package strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

//Print all the duplicates in the input string
public class PrintDuplicateCount {
    public static void main(String[] args) {
      String str = "test string";
      printDuplicateCount(str);
    }
    static void printDuplicateCount(String str){
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }

        Iterator<Character> iterator = st.iterator();
        while (iterator.hasNext()){
            long count=0;
            char c = iterator.next();
            for (int i = 0; i < str.length(); i++) {
                    if (c == str.charAt(i)) {
                        count++;
                    }
            }
            System.out.println(c + " count = " + count);
        }
    }
}
