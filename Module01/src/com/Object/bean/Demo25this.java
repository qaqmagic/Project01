package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/3 16:29
 */
//构造函数之间的调用使用this
class Person3
{
    int age;
    String name;
    Person3()
    {
        name="张三";
        age=23;
    }
    Person3(String name,int age)
    {
        this();//必须写在构造函数的第一行
        this.name=name;
        this.age=age;
    }
}
class Demo25 {
    public static void  main(String[] args)
    {
        Person3 ren=new Person3("Tom",25);
        System.out.println(ren.name+","+ren.age);
    }
}
