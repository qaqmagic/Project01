package com.interfacr.bean;

/**
 * @auther Erdan
 * @creat 2019/9/11 14:26
 多态中成员的特点：
 1：成员变量：编译时期可以访问哪些变量看父类，运行结果看父类
 2：成员函数：编译时期可以访问哪些方法看父类，运行结果看子类（子类重写了父类的方法，没有重写还看父类）
 3：静态成员函数：编译运行都看父类
 */
class Fu9111
{
    int num=5;

    public void show()
    {
        System.out.println("show fu");
    }
    public static void ff()
    {
        System.out.println("fu");
    }
}
class Zi9111 extends Fu9111
{
    int num=7;
    int a=6;

    public void show()
    {
        System.out.println("show zi");
    }
    public void fun()
    {
        System.out.println("fun");
    }
    public static void ff()
    {
        System.out.println("zi");
    }
}
class Demo05
{
    public static void main(String[] args)
    {
        Fu9111 f=new Zi9111();
        //System.out.println(f.num);
        //System.out.println(f.a);
        //f.show();
        //f.fun();

        f.ff();
    }
}
