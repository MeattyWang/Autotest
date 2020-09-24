package com.tuantuan.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 15:31
 */
public class MultiThreadOnXML {
    @Test
    public void test1(){
        System.out.printf("test1 +Thread Id : %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("test2 +Thread Id : %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("test3 + Thread Id : %s%n", Thread.currentThread().getId());
    }
}
