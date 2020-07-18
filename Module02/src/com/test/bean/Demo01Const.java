package com.test.bean;

/**
 * @auther Erdan
 * @creat 2019/12/15 10:57
 * 1.字符串常量：凡事用双引号引起来的部分，叫做字符串常量。例如：“abc”,“Hello”,“123”
 * 2.整数常量：直接写上的数字，没有小数点。例如：100、200、0、-250
 * 3.浮点数常量：直接写上的数字，有小数点。例如：2.5、-3.14、0.0
 * 4.字符常量：凡是用单引号引起来的单个字符，叫做字符常量。例如：'A'、'b'、'9'、'中'
 * 5.布尔常量：只有两种取值。true、false
 * 6.空常量：null。代表没有任何数据。
 */
public class Demo01Const {
    public static void main(String[] args){
        //字符串常量
        System.out.println("ABC");
        System.out.println("");//CCC字符串两个双引号中间的内容为空
        System.out.println("CCC");

        //整数常量
        System.out.println("38");
        System.out.println("-100");

        //浮点数常量（小数）
        System.out.println("3.14");
        System.out.println("-2.5");

        //字符常量
        System.out.println('A');
        System.out.println('5');
        //System.out.println('');//两个单引号中间必须有且仅有一个字符，没有不行。
        //System.out.println('AB');//两个单引号中间必须有且仅有一个字符，有两个不行。

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        //空常量。不能直接用来打印输出。
        //System.out.println(null);

    }
}
