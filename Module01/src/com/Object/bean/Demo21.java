package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 19:24
 * 1.局部变量没有默认值
 *   成员变量有默认值
 * 2.局部变量在栈中开辟内存
 *   成员变量在堆中开辟内存
 * 3.局部变量的作用范围是从其被定义的位置开始到其所在的大括号结束
 *   成员变量的作用范围是整个类
 * 4.局部变量从其所在的函数被调用在栈中开辟内存，到其作用域结束就释放内存
 *   成员变量从其所属的对象创建时开辟内存，到其所属的对象被垃圾回收时才释放内存
 */
class Cars
{
    int num;
    String color;

    public void run()
    {
        System.out.println("行驶");
    }
}
class Demo21
{
    public static void main(String[] args)
    {
        int a;
        //System.out.println(a);
        Cars che=new Cars();
        System.out.println(che.num+","+che.color);//0,null
        che.run();

        //匿名对象
        new Car().num=6;//匿名对象只能使用一次，使用完就成了垃圾了
        new Car().color="red";
        show(new Car());
    }

    public static void show(Car car)
    {
        car.run();
    }
}
