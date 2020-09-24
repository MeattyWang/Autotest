package com.tuantuan.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 9:56
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public void test01(){
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test02(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups = "client")
    public void test03(){
        System.out.println("这是客户端组的测试方法3");
    }

    @Test(groups = "client")
    public void test04(){
        System.out.println("这是客户端组的测试方法4");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }

}
