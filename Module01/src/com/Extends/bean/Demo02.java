package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/6 15:23
 * 继承中成员变量的特点：
 * this：是一个引用，总是指向当前使用的对象
 * super：不是引用，当子父类中出现同名成员现象是，用于区分子父类中成员的
 */
class Fu961
{
    private int num1=5;
    public int getNum1()
    {
        return num1;
    }
}
class Zi961 extends Fu961
{
    //int num1=6;
    public void show()
    {
        System.out.println(getNum1());
        //System.out.println(this.num1+","+super.num1);
    }
}
class Demo02
{
    public static void main(String[] args)
    {
        Zi961 z=new Zi961();
        z.show();
    }
}
