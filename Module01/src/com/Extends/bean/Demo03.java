package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/6 16:18
 * 继承中成员函数的特点：
 * 重写（覆盖）：子类在继承父类时，含有和父类一样的函数
 *   当创建子类对象时，执行的是重写之后的方法
 * 注意：
 * 子类在重写时，权限要大于等于父类中方法的权限
 * 父类中私有的方法不能被子类重写
 * 静态只能覆盖静态
 * 当父类中的方法的返回值是引用类型时，子类在重写时返回值类型可以是父类中方法的返回值类型，也可以是其子类类型
 */
class Fu962
{
    public void show()
    {
        System.out.println("fu");
    }
}
class Zi962 extends Fu962
{
    public void show()
    {
        super.show();
        System.out.println("zi");
    }
}
class Demo03
{
    public static void main(String[] args)
    {
        Zi962 z=new Zi962();
        z.show();//zi
        //z.fun();
    }
}
/**class ZhangSan
{
    public void eat()
    {
        System.out.println("细嚼慢咽的吃");
    }
}
class ZhangXiaoSan extends ZhangSan
{
    //沿袭了父类的功能，改变了具体的实现方式
    public void eat()
    {
        super.eat();
        System.out.println("吃甜点");
    }
}*/
