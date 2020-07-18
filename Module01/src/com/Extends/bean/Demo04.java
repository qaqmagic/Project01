package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/6 16:59
 * 继承中构造函数的特点：在创建子类对象时，先调用父类的构造方法，再调用子类的构造方法
 * 原因是系统自动在子类的构造函数的第一行加入了一条语句:super()
 * super()默认是调用父类中的无参的构造函数
 * 注意：当父类中不存在无参的构造函数时，必须在子类构造函数的第一行手动加入super语句，调用父类的某个构造方法
 */
class Fu964
{
    int age;
    String name;
    Fu964()
    {
        System.out.println("fu");
    }
    Fu964(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
}
class Zi964 extends Fu964
{
    double weight;
    Zi964()
    {   super();
        System.out.println("zi");
    }
    Zi964(int age,String name,double weight)
    {
        super(age,name);
        this.weight=weight;
    }
}
class Demo04
{
    public static void main(String[] args)
    {
        Zi964 z=new Zi964();
    }
}
