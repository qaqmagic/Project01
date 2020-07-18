package com.firstz.bean;

class Demo05 {
    public static void main(String[] args)
    {
        fun(12);
        System.out.println("hello");
    }
    //一个函数没有返回值，也可以使用return
    public static void fun(int num)
    {
        if(num>10)
            return;//直接返回到函数调用的位置，提前结束函数的执行
        else
            System.out.println("num="+num);
    }
    //一个函数如果有返回值，那么必须在任何情况下都返回值
    public static int show(int a,int b)
    {
        if(a>b)
            return 1;
        else if(a<b)
            return 2;
        else
            return 3;
    }
}
