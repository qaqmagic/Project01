package com.neibulei.bean;

/**
 * @auther Erdan
 * @creat 2019/9/20 16:03
 异常：程序在运行时出现的不正常情况
 异常的由来：java把程序在运行时出现的各种不正常情况也看成了对象，提取属性和行为进行描述。
 比如异常名称，异常信息，异常发生位置，从而形成了各种异常类
 异常的分类：一种是严重的异常：Error  (一般不用处理)
            一种是不严重的异常：Exception  (一般要进行处理)
 异常体系：
 Throwable
 ---Error
 ---Exception
 */
class Demo06 {
    public static void main(String[] args)
    {
        //int[] a=new int[1024*1024*800];//OutOfMemoryError
        //System.out.println(5/0);
        int[] arr=new int[3];
        /*
        当发生下标越界异常时，因为这种异常在java内部已经定义了，所以系统会自动创建该异常类的对象，因为main函数处理不了这种该异常，所以抛给了jvm，jvm默认的处理方式是调用该异常类对象的printStackTrace()方法，该方法会打印异常名称，异常信息，异常发生位置，然后程序中断执行
         */
        System.out.println(arr[3]);//throw new ArrayIndexOutOfBoundsException
        System.out.println("hello");
    }
}
