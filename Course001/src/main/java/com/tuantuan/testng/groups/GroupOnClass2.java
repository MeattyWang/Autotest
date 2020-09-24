package com.tuantuan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 14:00
 */

@Test(groups = "stu")
public class GroupOnClass2 {
    public void stu1(){
        System.out.println("GroupOnClass2 中的 stu1 运行");
    }
    public void stu2(){
        System.out.println("GroupOnClass2 中的 stu2 运行");
    }
}
