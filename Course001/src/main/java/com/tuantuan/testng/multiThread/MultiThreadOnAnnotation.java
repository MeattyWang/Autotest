package com.tuantuan.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 15:25
 */
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 3, threadPoolSize = 3)
    public void test(){
        System.out.println("1");
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}
