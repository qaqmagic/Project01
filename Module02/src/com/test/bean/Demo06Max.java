package com.test.bean;

/**
 * @auther Recruit
 * @creat 2019/12/18 23:37
 */
//使用三元运算符和标准的if-else语句分别实现：取两个数字中的最大值
public class Demo06Max {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //int max=a>b?a:b;
        int max;
        if (a>b) {
            max=a;
        }else{
            max=b;
        }
        System.out.println("最大值是："+max);
    }
}
