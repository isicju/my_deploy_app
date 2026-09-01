package com.kotojava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class UnitTests {

    @Test
    public void quickTest1() throws InterruptedException {
        System.out.println("printing Unit test 1");
        Thread.sleep(100);
    }

    @Test
    public void quickTest2() throws InterruptedException {
//        if(true){
//            throw new RuntimeException("Something went wrong!");
//        }
        Thread.sleep(100);
    }

    @Test
    public void quickTest3() throws InterruptedException {
        Thread.sleep(100);
    }

    @Test
    public void quickTest4() throws InterruptedException {
        Thread.sleep(100);
    }

}