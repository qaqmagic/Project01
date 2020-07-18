package com.firstz.bean;

import java.util.Scanner;

class Demo03 {
    //定义一个求和的函数
    //函数:具备特定功能的一段独立代码段，什么时候用到这个功能，什么时候去调用
    public static int add(int a,int b)//形式参数
    {
        int sum=a+b;
        return sum;//返回到函数调用的位置

    }
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;

        System.out.println("输入第一个数");
        num1=sc.nextInt();

        System.out.println("输入第二个数");
        num2=sc.nextInt();

        int s=add(num1,num2);//实际参数，实参和形参在 个数，顺序，类型上都要一致
        if (s>100)
            System.out.println("大于100");
        else
            System.out.println("小于100");
    }
}
