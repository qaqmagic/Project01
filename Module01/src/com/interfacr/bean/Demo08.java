package com.interfacr.bean;

/**
 * @auther Erdan
 * @creat 2019/9/17 16:15
 模板设计模式：实现一个功能时，功能的一部分是确定的，而另一部分是不确定的，确定的部分还会用到不确定的部分，那么就把不确定的部分暴露出去，让子类去实现

 需求：计算一个程序的运行时间
 开始和结束时间
 */
abstract class Test9171
{
    public final void getTime()
    {
        //得到开始时间
        long start=System.currentTimeMillis();

        fun();
        //得到结束时间
        long end=System.currentTimeMillis();

        System.out.println("程序的运行时间为："+(end-start)+"毫秒");
    }
    public abstract void fun();
}
class Zi extends Test9171
{
    public void fun()
    {
        for (int i=1;i<=3000;i++)
        {
            System.out.println(i);
        }
    }
}
class Demo08
{
    public static void main(String[] args)
    {
        Zi z=new Zi();
        z.getTime();
    }
}
