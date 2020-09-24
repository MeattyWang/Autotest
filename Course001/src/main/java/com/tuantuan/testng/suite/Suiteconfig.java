package com.tuantuan.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 9:16
 */
public class Suiteconfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 完成了");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 完成了");
    }
}
