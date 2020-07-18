package com.Array.bean;

class Demo10 {
    public static void main(String[] args)
    {
        //int a=23;
        //int[] arr=new int[5];
        /*
        int m=5,n=6;
        System.out.println("m="+m+",n="+n);
        huan(m,n);
        System.out.println("m="+m+",m="+n);*/
        int[] a=new int[3];
        a[0]=5;
        a[1]=6;

        huan(a);
        System.out.println("a[0]="+a[0]+",a[1]="+a[1]);
    }
    //交换数组中的两个数
    public static void huan(int[] arr)
    {
        int c;
        c=arr[0];
        arr[0]=arr[1];
        arr[1]=c;
    }
    //交换两个整形变量的值
    public static void huan(int a,int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
    }
}
