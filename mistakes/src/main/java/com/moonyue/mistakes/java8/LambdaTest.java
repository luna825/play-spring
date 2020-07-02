package com.moonyue.mistakes.java8;

import org.junit.Test;

public class LambdaTest {

    @Test
    public void lambdavsanonymouclass(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello1");
            }
        }).start();

        new Thread(()-> {
            System.out.println("hello2");
        }).start();
    }
}
