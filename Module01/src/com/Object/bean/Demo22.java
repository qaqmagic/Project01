package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 20:37
 */
class Person
{
    int age;
    String name;
    Person(){}

    Person(int nianling,String mingzi){
        age=nianling;
        name=mingzi;
    }

}
class Demo22 {
    public static void main(String[] args)
    {
        Person ren=new Person();
        ren.age=23;
        ren.name="李四";

        Person person=new Person(20,"张三");
        System.out.println(person.age+","+person.name);
    }
}
