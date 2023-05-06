package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        checkPalindrome(str);
    }

    static void checkPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        int flag = 0;
        str = str.toLowerCase();
        while (low <= high){
            char getlow = str.charAt(low);
            char gethigh = str.charAt(high);

            if (!(getlow >= 'a' && getlow <= 'z')){
                low++;
            }else if (!(gethigh>='a' && gethigh <= 'z')){
                high--;
            }else if (getlow == gethigh){
                low++;
                high--;
            } else {
                System.out.println("Not a palindrome");
                flag = 1;
            }
        }
        if (flag!=1)
        System.out.println("Its a palindrome");
    }
}
