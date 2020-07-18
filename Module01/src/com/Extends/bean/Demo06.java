package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/8 16:14
 * 抽象类:在提取父类的过程中，某一个共性方法子类有各自不同的实现方式，那么该方法需要修饰为abstract，该类就是抽象类了
 */
abstract class 犬科
{
    public abstract void 吼叫();//没有实现的方法
}
class 狼 extends 犬科
{
    public void 吼叫()
    {
        System.out.println("嗷嗷叫");
    }
}
class 狗 extends 犬科
{
    public void 吼叫()
    {
        System.out.println("汪汪叫");
    }
}
