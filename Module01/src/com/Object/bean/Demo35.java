package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/5 20:54
 * 设计模式：解决某一类问题最有效的方式（23中设计模式）
 * 单例设计模式：解决的是一个类只能有一个对象
 * 1：构造函数私有化
 * 2：在类内部创建一个自身类型的对象
 * 3：使用一个public的函数把该对象返回
 */
//饿汉式
class Single
{
    private  static Single s=new Single();

    private  Single(){}

    public static Single getInstance()
    {
        return s;
    }
}
class Demo35
{
    public static void main(String[] args)
    {
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();
        System.out.println(s1==s2);
    }
}
