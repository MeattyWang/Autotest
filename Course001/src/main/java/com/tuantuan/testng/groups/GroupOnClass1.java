package com.tuantuan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 13:57
 */
@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1 中的 stu1 运行");
    }

    public void stu2(){
        System.out.println("GroupOnClass1 中的 stu2 运行");
    }
}
