package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/8 16:30
 * 抽象类的特点：
 * 1：抽象类不能创建对象，因为含有抽象方法
 * 2：继承了抽象类的子类，没有重写父类中的抽象方法，那么该子类还是抽象类
 */

//计算圆形和矩形的面积
abstract class Shape
{
    public abstract double getArea();
}
abstract class Circle extends Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius=radius;
    }
    //继承了父类中的抽象方法，含有抽象方法，如果没有重写该抽象方法，那么该类也是抽象类
    //public abstract double getArea();
}
class Rectangle extends Shape
{
    private double length;
    private double width;

    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double getArea()
    {
        return this.length*this.width;
    }
}
class Demo07 {
    public static void main(String[] args)
    {
        //Shape s=new Shape();//Shape是抽象的；无法实例化

        Rectangle r=new Rectangle(6,3);
        System.out.println(r.getArea());
    }
}
