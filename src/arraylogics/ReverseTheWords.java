package arraylogics;

public class ReverseTheWords {
    public void reverseWord(String array[],String str)
    {
        for (int i = array.length-1; i >= 0; i--) {
            str += array[i] + " ";
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String string = "Welcome to Bridgelabz";
        String stringArray[] = string.split(" ");
        String str = "";
        ReverseTheWords reverseTheWords = new ReverseTheWords();
        reverseTheWords.reverseWord(stringArray,str);
    }
}
