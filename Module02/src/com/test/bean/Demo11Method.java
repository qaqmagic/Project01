package com.test.bean;

/**
 * @auther Recruit
 * @creat 2019/12/17 21:05
 * 注意事项：
 * 1.方法定义的先后顺序无所谓。
 * 2.方法的定义不能产生嵌套包含关系。
 * 3.方法定义好了之后，不会执行的。如果想要执行，一定要进行方法的【调用】
 *
 * 调用方法，格式：
 *
 * 方法名称();
 */
public class Demo11Method {
    public static void main(String[] args) {
        farmer();//调用农民的方法
        seller();//调用小商贩的方法
        cook();//调用厨子的方法
        me();//调用我自己的方法

    }
    //农民
    public static void farmer(){
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }
    //小商贩
    public static void seller(){
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
    }
    //厨子
    public static void cook(){
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }
    //我
    public static void me(){
        System.out.println("吃");
    }
}
