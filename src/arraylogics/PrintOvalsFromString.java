package arraylogics;

//Program to count the ovals in string
public class PrintOvalsFromString {
    public void getOvals(String string){
        for (int i = 0; i < string.length(); i++) {
            if(string.toLowerCase().charAt(i) == 'a' || string.toLowerCase().charAt(i) == 'e' || string.toLowerCase().charAt(i) == 'i' || string.toLowerCase().charAt(i) == 'o' || string.toLowerCase().charAt(i) == 'u'){
                System.out.println(string.charAt(i));
            }
        }

    }

    public static void main(String[] args) {
        String string = "Welcome to Bridgelabz";
        PrintOvalsFromString printOvalsFromString = new PrintOvalsFromString();
        printOvalsFromString.getOvals(string);
    }
}
