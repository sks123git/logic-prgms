package strings;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String str = "aaaaabbbbbb";
        removeConsecutive(str);
    }
    static  void removeConsecutive(String string){
        System.out.print(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i)!=string.charAt(i-1)){
                System.out.print(string.charAt(i));
            }
        }
    }
}
