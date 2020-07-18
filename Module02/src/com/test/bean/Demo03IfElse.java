package com.test.bean;

/**
 * @auther Recruit
 * @creat 2019/12/18 18:11
 */
//标准的if-else语句
public class Demo03IfElse {
    public static void main(String[] args) {
        int num=5;

        if (num%2 == 0) {//如果除以2能够余数为0，说明是偶数
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
