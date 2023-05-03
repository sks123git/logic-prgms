package com.singleton;
public class EagerSingletonInitialization {
private static EagerSingletonInitialization onlyInstance = new EagerSingletonInitialization();
private EagerSingletonInitialization(){
}
public static EagerSingletonInitialization getInstance(){
    return onlyInstance;
}
}

class MainSingleton{
    public static void main(String[] args) {
        EagerSingletonInitialization e1 = EagerSingletonInitialization.getInstance();
        EagerSingletonInitialization e2 = EagerSingletonInitialization.getInstance();

        System.out.println(e1+"\n"+e2);
    }
}