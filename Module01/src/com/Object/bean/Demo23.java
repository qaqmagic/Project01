package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/3 14:19
 */
//面向对象三大特点：封装，继承，多态
//封装：只对外界提供有用的属性和行为
class Person1
{
    private int age;
    private String name;

    public void setAge(int nianling)
    {
        if (nianling>100 || nianling<1)
            System.out.println("年龄不合法");
        else
            age=nianling;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String mingzi)
    {
        name=mingzi;
    }
    public String getName()
    {
        return name;
    }
}
class Demo23 {
    public static void main(String[] args)
    {
        Person1 person1=new Person1();

        //person1.age=223;
        //person1.name="Tom";

        person1.setAge(80);
        person1.setName("李四");
        System.out.println(person1.getAge()+","+person1.getName());
    }
}
