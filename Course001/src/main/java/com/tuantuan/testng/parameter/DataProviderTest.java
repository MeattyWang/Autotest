package com.tuantuan.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 14:58
 */
public class DataProviderTest {
    @Test(dataProvider = "providerData")
    public void testDataprovider(String name, int age){
        System.out.println("name="+name);
        System.out.println("age=" + age);
    }
    @DataProvider(name = "providerData")
    public Object[][] providerData(){
        Object[][] datas ={

                {"zhangsan",11},
                {"lisi",20}

        };

        return datas;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("name="+name);
        System.out.println("age=" + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("name="+name);
        System.out.println("age=" + age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodData(Method method){
        Object[][] datas = null;
        if("test1".equals(method.getName())){
            datas = new Object[][]{
                    {"张三",10},
                    {"李四",20}
            };
        }else if("test2".equals(method.getName())){
            datas = new Object[][]{
                    {"zhangsan",13},
                    {"lisi",16}
            };
        }
        return datas;
    }
}
