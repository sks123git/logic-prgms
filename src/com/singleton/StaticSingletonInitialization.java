package com.singleton;

public class StaticSingletonInitialization {
    private static StaticSingletonInitialization onlyInstance = null;
    static {
        try {
            onlyInstance = new StaticSingletonInitialization();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    private StaticSingletonInitialization(){}
    public static StaticSingletonInitialization getInstance(){
        return onlyInstance;
    }
}

class Main{
    public static void main(String[] args) {
        StaticSingletonInitialization e1 = StaticSingletonInitialization.getInstance();
    }
}
