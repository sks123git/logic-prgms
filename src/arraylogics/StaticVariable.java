package arraylogics;

public class StaticVariable {
    public  static int value = 10;
    int value2 = 30;

    {
      //instance block
    }

    static {
        //static block
    }
    public static void localVar(){
        //Local variable
        int i = 10;
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println(value);
        StaticVariable variable = new StaticVariable();
        System.out.println(variable.value2);
        localVar();
    }
}
