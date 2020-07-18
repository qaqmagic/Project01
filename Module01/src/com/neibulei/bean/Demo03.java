package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/19 15:08
 内部类得到外部类对象中的成员  外部类名.this.成员
 内部类得到外部类对象         外部类.this
 */
class Outer9191
{
    int num=5;
    class Inner9191
    {
        int num=6;
        public void show()
        {
            int num=7;
            System.out.println(Outer9191.this.num);
        }
    }
    public void fun()
    {
        Inner9191 in=new Inner9191();
        in.show();
    }
}
class Demo03
{
    public static void main(String[] args)
    {
        Outer9191 out=new Outer9191();
        out.fun();
    }
}
