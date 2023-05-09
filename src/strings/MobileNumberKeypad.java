package strings;
// Convert a sentence into its equivalent mobile numeric keypad sequence
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MobileNumberKeypad {
    public static void main(String[] args) {
        Map<Character,Integer> keypad = new HashMap<>();
        keypad.put('A',2);
        keypad.put('B',22);
        keypad.put('C',222);
        keypad.put('D',3);
        keypad.put('E',33);
        keypad.put('F',333);
        keypad.put('G',4);
        keypad.put('H',44);
        keypad.put('I',444);
        keypad.put('J',5);
        keypad.put('K',55);
        keypad.put('L',555);
        keypad.put('M',6);
        keypad.put('N',66);
        keypad.put('O',666);
        keypad.put('P',7);
        keypad.put('Q',77);
        keypad.put('R',777);
        keypad.put('S',7777);
        keypad.put('T',8);
        keypad.put('U',88);
        keypad.put('V',888);
        keypad.put('W',9);
        keypad.put('X',99);
        keypad.put('Y',999);
        keypad.put('Z',9999);
        keypad.put(' ',0);
        String str = "GEEKSFORGEEKS";
        printKeypad(keypad,str);
    }
        static void printKeypad(Map<Character,Integer> keypad, String str){
            for (int i = 0; i < str.length(); i++) {
                System.out.print(keypad.get(str.charAt(i)));
            }
        }
}


