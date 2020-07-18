package com.Array.bean;

class Demo09 {
    public static void main(String[] args)
    {
        int[] arr=new int[5];
                System.out.println(arr[0]);
    }
}
/*
java程序在运行时,JVM会把内存分为5块区域
栈，堆，方法区，本地方法区，寄存器

栈：先进后出，局部变量进栈，（在函数中定义的变量，在语句中定义的变量）
   局部变量的作用域一旦结束了立刻释放内存

堆：存储的是实体（数组，对象），实体都可以存储多个数据
    特点：1：有默认值
         2：垃圾回收机制
 */