package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/19 15:20
 局部类：在函数内部定义的类
 局部内部类使用了其所在函数的局部变量时，该局部变量必须是final的
 */
class Outer9192
{
    Object obj;
    public void fun()
    {
        final int y=6;//在常量池中
        class Inner9192
        {
            public void show()
            {
                System.out.println("inner"+y);//从内部类中访问本地变量y；需要被声明为最终类型
            }
            public String toString()
            {
                return "inner"+y;
            }
        }
        obj=new Inner9192();//多态 obj.show();
    }
    public void function()
    {
        System.out.println(obj.toString());
    }
}
class Demo04
{
    public static void main(String[] args)
    {
        Outer9192 out=new Outer9192();
        out.fun();
        out.function();
    }
}
