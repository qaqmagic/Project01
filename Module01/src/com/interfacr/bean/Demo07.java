package com.interfacr.bean;

/**
 * @auther Erdan
 * @creat 2019/9/17 15:10
 */
//Object:是类层次结构的根类
class Person9171
{
    int age;

    Person9171(){}
    Person9171(int age)
    {
        this.age=age;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Person9171)
        {
            Person9171 ren=(Person9171)obj;
            return  this.age==ren.age;
        }
        else
            return false;
    }

    public String toString()
    {
        return ""+age;
    }
}
class Dog9171
{}
class Demo07
{
    public static void main(String[] args)
    {
        //boolean equals(Object obj)  :任何两个对象都可以比较是否是同一个对象
        Person9171 p1=new Person9171(11);
        Person9171 p2=new Person9171();

        Dog9171 dog=new Dog9171();
        boolean boo=p1.equals(dog);//Object obj=new Dog9171()
        //System.out.println(boo);

        //System.out.println(p1==p2);

        System.out.println(p1);//Person9171@28d93b30
        System.out.println(p1.toString());//Person9171@28d93b30

        /**System.out.println(Integer.toHexString(p1.hashCode()));//十进制转换成十六进制

        Class claz=p1.getClass();//Person9171.class---字节码也被看成了对象
        String name=claz.getName();
        System.out.println(name);

        System.out.println(p1.getClass().getName()+"@"+Integer.toHexString(p1.hashCode()));*/
    }
}
