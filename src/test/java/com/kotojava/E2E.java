package com.kotojava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class E2E {

    @Test
    public void quickTest1() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void quickTest2() throws InterruptedException {
        Thread.sleep(2000);
    }

}