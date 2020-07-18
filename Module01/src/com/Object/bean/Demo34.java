package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/5 20:36
 * a构造代码块：对象一创建就执行，优先于构造函数的执行
 * 实现所有对象初始化
 */
class Person951
{
    int age;
    String name;

    {
        System.out.println("hello");
    }

    Person951(){}
    Person951(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println(age+","+name);
    }
}
class Demo34
{
    public static void main(String[] args)
    {
        Person951 person1=new Person951(23,"李四");
        Person951 person2=new Person951(22,"李五");
    }
}
