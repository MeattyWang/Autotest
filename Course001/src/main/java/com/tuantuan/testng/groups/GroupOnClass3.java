package com.tuantuan.testng.groups;

import org.testng.annotations.Test;

/**
 * @author ：xxx
 * @description：TODO
 * @date ：2020/9/24 14:00
 */

@Test(groups = "teacher")
public class GroupOnClass3 {
     public void teacher1(){
         System.out.println("GroupOnClass3中的 teacher1 运行");
     }

    public void teacher2(){
        System.out.println("GroupOnClass3中的 teacher2 运行");
    }
}
