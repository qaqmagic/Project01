package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/4 14:56
 *
 * static:修饰成员变量，成员函数
 * 1：什么时候把成员变量修饰为static？
 *    当成员变量需要被类的所有对象共享时
 * 2：什么时候把成员函数修饰为static？
 *    当成员函数没有用到其所属的类的任何非静态成员
 */
class Person11
{
    int age;

    Person11(){}
    Person11(int age)
    {
        this.age=age;
    }
    public static void show(Person11 person11)
    {
        System.out.println(person11.age);
    }
}
class Demo28static {
    public static void main(String[] args)
    {
        Person11 ren=new Person11(23);
        Person11.show(ren);
    }
}
