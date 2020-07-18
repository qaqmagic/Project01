package com.Array.bean;

class Demo11 {
    public static void main(String[] args)
    {
        //数组的初始化
        //int a=34;
        int[] a=new int[]{23,34,3,44};
        int[] b={12,2,3,45,66,77};

        //数组的遍历
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

        //System.out.println(a[4]);//ArrayIndexOutOfBoundsException:数组下标越界

        a=null;
        System.out.println(a[3]);//NullPointerException:空指针问题
    }
}
