package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/18 17:11
 静态内部类：内部类含有静态成员，那么内部类必须是静态的
 */
class Outer9172
{
    static int num=66;

    static class Inner9172
    {
        public static void show()
        {
            System.out.println(num);
        }
    }

    public void fun()
    {
        Inner9172 in=new Inner9172();
        in.show();
    }
}
class Demo02
{
    public static void main(String[] args)
    {
        //Outer9172 out=new Outer9172();
        //out.fun();

        //Outer9172.Inner9172 in=new Outer9172.Inner9172();
        //in.show();

        Outer9172.Inner9172.show();
    }
}
