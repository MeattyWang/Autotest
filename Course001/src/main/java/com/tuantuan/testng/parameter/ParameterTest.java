package com.tuantuan.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 14:36
 */
public class ParameterTest {

    @Parameters({"name","age"})
    @Test
    public void parameterTest1(String name, int age){
        System.out.println("name="+name);
        System.out.println("age=" + age);
    }
}
