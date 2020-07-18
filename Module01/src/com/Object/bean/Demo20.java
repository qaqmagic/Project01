package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 15:06
 */
class Car
{
    int num;
    String color;

    public static void run()
    {
        System.out.println("行驶");
    }
}
//在类中定义的变量：成员变量
//在类中定义的函数：成员函数
public class Demo20 {
    public static void main(String[] args)
    {
        //创建一个Car对象
        Car baoma=new Car();
        //成员访问符号
        baoma.num=4;
        baoma.color="红色";
        System.out.println(baoma.num+","+baoma.color);
        baoma.run();
    }
}
