package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/20 15:32
 匿名内部类：简化书写
 使用匿名内部类的前提条件：存在父类或父接口
 */
abstract class Test9201
{
    public abstract void show();
}
class Demo
{
    class Inner9201 extends Test9201
    {
        public void show()
        {
            System.out.println("show");
        }
        public void eat()
        {
            System.out.println("吃饭");
        }
    }
    public void fun()
    {
        /**Inner9201 in=new Inner9201();
        in.show();
        in.eat();*/
        //创建了Test9201的子类对象
        new Test9201(){
            public void show()
            {
                System.out.println("show");
            }
            public void eat()
            {
                System.out.println("吃饭");
            }
        }.show();
        new Test9201(){
        public void show()
        {
            System.out.println("show");
        }
        public void eat()
        {
            System.out.println("吃饭");
        }
    }.eat();

        //父类类型的引用指向了子类对象
        Test9201 t=new Test9201(){
            public void show()
            {
                System.out.println("show");
            }
            public void eat()
            {
                System.out.println("吃饭");
            }
        };
        t.show();
    }
}
class Demo05
{
    public static void main(String[] args)
    {
        Demo d=new Demo();
        d.fun();
    }
}
