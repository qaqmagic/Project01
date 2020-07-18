package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/6 14:47
 * 继承：1：实现了代码的复用
 *      2：使类和类之间产生了关系（被继承的类称为父类，继承的类称为子类）
 * 继承的特点：
 * 1：单继承的
 *    （多继承：一个类可以有多个父类）（java不支持）
 *    单继承：一个类只能有一个父类
 * 2：多层继承
 *
 * 注意：什么时候使用继承？
 *       当事物之间存在所属关系时，x属于y的一种
 */
class Person961
{
    int age;
    String name;
    public void eat()
    {
        System.out.println("吃饭");
    }
}
class Student extends Person961
{
    public void study()
    {
        System.out.println("学习");
    }
}
class Worker extends Person961
{
    public void work()
    {
        System.out.println("工作");
    }
}
