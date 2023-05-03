package com.singleton;

public class SynchronizedSingleton {


    private static SynchronizedSingleton onlyInstance = null;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (onlyInstance == null){
            onlyInstance = new SynchronizedSingleton();
        }
        return onlyInstance;
    }
}

    class Main3{
        public static void main(String[] args) {
            SynchronizedSingleton e1 = SynchronizedSingleton.getInstance();
            SynchronizedSingleton e2 = SynchronizedSingleton.getInstance();

            System.out.println(e1+"\n"+e2);
        }
    }

