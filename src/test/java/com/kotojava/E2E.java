package com.kotojava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class E2E {

    @Test
    public void quickTest1() throws InterruptedException {
        System.out.println("printing E2E test 1");
        Thread.sleep(10000);
    }

    @Test
    public void quickTest2() throws InterruptedException {
        Thread.sleep(10000);
    }

}