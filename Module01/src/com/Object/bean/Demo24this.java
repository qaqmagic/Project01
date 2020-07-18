package com.Object.bean;
/**
 * @auther Erdan
 * @creat 2019/9/3 15:25
 */
//this:是一个引用，总是指向当前对象
class Person2
{
    int age;
    String name;

    Person2(){}
    Person2(String name,int age)//局部变量和成员变量同名时，成员变量无效
    {
        this.name=name;
        this.age=age;
    }
    public void show()
    {
        System.out.println(name+","+age);
    }

    //判断两个人是否是同龄人
    public boolean isSameAge(Person2 p1)
    {
        return this.age==p1.age;
    }
}
class Demo24 {
    public static void main(String[] args)
    {
        Person2 person11=new Person2("李四",20);
        //person2.show();

        Person2 person12=new Person2("王五",21);
        //person2.show();
        System.out.println(person11.isSameAge(person12));
    }
}
