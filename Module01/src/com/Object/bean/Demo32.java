package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/4 21:51
 */
class Demo32 {
    public static void main(String[] args)
    {
        //静态的应用：工具类
        //ArrayTool arrayTool=new ArrayTool();

        int[] arr={34,2,56,78};
        int max=ArrayTool.getMax(arr);
        System.out.println("max="+max);

    }
}
