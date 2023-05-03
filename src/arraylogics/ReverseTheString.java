package arraylogics;

public class ReverseTheString {
    public void getReverseString(String string){
        char str[] = new char[string.length()];
        int j=0;
        for (int i = string.length()-1; i >= 0; i--) {
            str[j] = string.charAt(i);
            j++;
        }
        for (char val:str) {
            System.out.print(val);
        }
    }

    public static void main(String[] args) {
        String string = "Welcome to Bridgelabz";
        ReverseTheString reverseTheString = new ReverseTheString();
        reverseTheString.getReverseString(string);
    }
}
