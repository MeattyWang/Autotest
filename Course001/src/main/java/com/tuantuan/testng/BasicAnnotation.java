package com.tuantuan.testng;

import org.testng.annotations.*;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 9:01
 */
public class BasicAnnotation {
    @Test
    public void testcase01(){
        System.out.println("Test : 这是测试用例1");

    }

    @Test
    public void testcase02(){
        System.out.println("Test: 这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod ： 这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod : 这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass : 这是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass : 这是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite : 这是在suit之前运行的");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite : 这是在suit之后运行的");
    }
}
