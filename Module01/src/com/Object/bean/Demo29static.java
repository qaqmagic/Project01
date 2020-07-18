package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/4 15:18
 * public static void main(String[] args)
 * public:权限最大的
 * static:这个函数随着类的加载就加载到方法区的静态区了
 * void:无返回值
 * main:一个函数名，被JVM所识别，程序运行的入口
 * String[] args:一个字符串数组类型的参数
 */
class Test
{
    public static void main(String[] args)
    {
        String[] arr={"java","html","android"};
        Demo29static.main(arr);
    }
}
class Demo29static {
    public static void main(String[] args)
    {
        //System.out.println(args);//[Ljava.lang.String;@28d93b30
        //System.out.println(args.length);//0  命令行参数
        for (int i=0;i<args.length;i++)
        {
            System.out.println(args[i]+" ");
        }
    }
}
