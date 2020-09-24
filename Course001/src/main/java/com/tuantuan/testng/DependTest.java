package com.tuantuan.testng;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 14:31
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"},alwaysRun = true)
    public void test2(){
        System.out.println("test2 run");
    }
}
