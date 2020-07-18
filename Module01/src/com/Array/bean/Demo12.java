package com.Array.bean;

class Demo12 {
    public static void main(String[] args)
    {
        int[] arr={23,3,44,55,67,345,8};
        /*int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("max="+max);*/
        int max=getMax(arr);
        System.out.println("max="+max);
    }

    //求整形数组中最大值的功能
    public static int getMax(int[] a)
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}
