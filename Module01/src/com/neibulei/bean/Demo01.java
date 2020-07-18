package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/17 16:52
 内部类：在一个类内部定义的类
        内部类属于外部类的一个成员，所以内部类可以直接使用外部类的成员
 */
class Outer9171
{
    int num=233;

    class Inner9171//成员内部类
    {
        public void show()
        {
            System.out.println(num);
        }
    }

    public void fun()
    {
        Inner9171 in=new Inner9171();
        in.show();
    }
}
class Demo01
{
    public static void main(String[] args)
    {
        //Outer9171 out=new Outer9171();
        //out.fun();
        //直接创建内部对象
        Outer9171.Inner9171 in=new Outer9171().new Inner9171();
        in.show();
    }
}
