package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/8 15:24
 * final:可以修饰类，方法，局部变量，成员变量
 * final修饰类：不能有子类
 * final修饰方法：不能被重写
 * final修饰局部变量：
 * final修饰成员变量：
 */
final class Test
{
    final public void show()
    {
        System.out.println("show");
    }
}
//求圆形的面积
class Circle981
{
    public static final double PI=3.1415;//符号常量
    private double radius;

    Circle981(){}
    Circle981(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return PI*radius*radius;
    }
}
class Demo05
{
    public static void main(String[] args)
    {
        final int num=5;
        //num=56;//无法为最终变量num分配值
        show(4,5);
    }
    public static void show(final int a,final int b)
    {
        //a=44;//不能分配最终参数a
        //b=55;//不能分配最终参数b
    }
}
class Single
{
    private static final Single s=new Single();
    private Single(){}
    public static Single getInstance()
    {
        //s=new Single();
        return s;
    }
}
