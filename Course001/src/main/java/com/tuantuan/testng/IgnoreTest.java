package com.tuantuan.testng;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 9:39
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1已执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2已执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3已执行");
    }
}
