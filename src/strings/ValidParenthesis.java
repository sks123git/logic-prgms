package strings;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "()[]{}";
        checkValidity(str);
    }
    static void checkValidity(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
            st.push(str.charAt(i));
        } else if (str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
            if (st.isEmpty() == false) {
                if (st.peek() == '(' && str.charAt(i) == ')') st.pop();
                else if (st.peek() == '{' && str.charAt(i) == '}') st.pop();
                else if (st.peek() == '[' && str.charAt(i) == ']') st.pop();
            }
        }
        }
        if (st.isEmpty() == true)
            System.out.println("valid parenthesis");
        else
            System.out.println("not a valid parenthesis");
}
}
