package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/5 20:23
 * 静态代码块：随着类的加载而执行，只执行一次，优先于main函数的执行
 * 可以用于类的初始化
 *
 */
class Test1
{
    static int num=10;
    static
    {
        System.out.println(num);
    }
    public static void show()
    {
        System.out.println("show");
    }
}
class Demo33
{
    static
    {
        System.out.println("a");
    }
    public static void main(String[] args)
    {
        //new Test1();
        //Test1.show();
        Test1 t=null;
    }
    static
    {
        System.out.println("b");
    }
}
