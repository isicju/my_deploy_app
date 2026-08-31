package com.kotojava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationTests {

    @Test
    public void quickTest1() throws InterruptedException {
        System.out.println("printing Integration test 1");
        Thread.sleep(1000);
    }
    @Test
    public void quickTest2() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Test
    public void quickTest3() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Test
    public void quickTest4() throws InterruptedException {
        Thread.sleep(1000);
    }
    @Test
    public void quickTest5() throws InterruptedException {
        Thread.sleep(1000);
    }
}