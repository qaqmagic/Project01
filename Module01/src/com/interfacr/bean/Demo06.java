package com.interfacr.bean;

/**
 * @auther Erdan
 * @creat 2019/9/11 15:43
 */
interface inter
{
    public abstract void show();
}
class Test9111 implements inter
{
    public void show()
    {
        System.out.println("test9111");
    }
}
class Test9112 implements inter
{
    public void show()
    {
        System.out.println("test9112");
    }
}

class Demo06
{
    public static void main(String[] args)
    {
        Test9111 t1=new Test9111();
        fun(t1);

        Test9112 t2=new Test9112();
        fun(t2);
    }
    public static void fun(inter t)//inter t=new Test9111();   inter t=new Test9112();
    {
        t.show();
    }
}
