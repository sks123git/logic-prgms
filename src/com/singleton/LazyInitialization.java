package com.singleton;

public class LazyInitialization {
    private static LazyInitialization onlyInstance = null;

    private LazyInitialization(){}
    public static LazyInitialization getInstance(){
        if (onlyInstance == null){
            onlyInstance = new LazyInitialization();
        }
        return onlyInstance;
    }
}
class Main2{
    public static void main(String[] args) {
        LazyInitialization e1 = LazyInitialization.getInstance();
        System.out.println(e1);
    }
}
