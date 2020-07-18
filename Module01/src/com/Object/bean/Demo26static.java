package com.Object.bean;
/**
 * @auther Erdan
 * @creat 2019/9/3 16:49
 * static:静态的
 * static修饰的成员变量的特点：
 * 1：static修饰的成员变量是该类的所有对象共享
 * 2：static修饰的成员变量是随着类的加载就在静态区中开辟内存了，所以优先于非静态成员变量开辟内存
 * 3：static修饰的成员变量可以通过类名直接访问
 *
 * 静态成员变量和非静态成员变量的对比：
 * 1：存储的数据：
 * 静态成员变量存储的是所有对象共享的数据
 * 非静态成员变量存储的是每个对象特有的数据
 * 2：存储的位置：
 * 静态成员变量是随着类的加载就在方法区中的静态区开辟内存了
 * 非静态成员变量是随着对象的创建在堆中开辟内存
 * 3：调用方式
 * 静态成员变量既可以通过对象访问也可以通过类名直接访问
 * 非静态成员变量只能使用对象访问
 * 4：生命周期
 * 静态成员变量是随着类的加载就在方法区中的静态区出现，整个程序执行完才消失
 * 非静态成员变量是随着对象的创建在堆中出现，随着对象的被垃圾回收而消失
 */
class Student
{
    String name;
    static String country="CN";

    public void show()
    {
        System.out.println(name+","+country);
    }
}
class Demo26static {
    public static void main(String[] args)
    {
        Student stu=new Student();
        stu.name="Jack";
        stu.show();

        Student stu2=new Student();
        stu2.name="Tom";
        stu2.show();

        //stu.country="USA";
        //System.out.println(stu2.country);
        System.out.println(Student.country);
    }
}
