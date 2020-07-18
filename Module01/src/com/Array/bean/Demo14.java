package com.Array.bean;

class Demo14 {
    public static void main(String[] args)
    {
        int[] arr={23,4,56,126,2};
        bubble(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        }
    }
    //冒泡排序
    //结果:无结果
    //参数：整形数组
    public static void bubble(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    //交换
                    huan(arr,j+1,j);
                }
            }
        }
    }
    //交换整形数组中的两个下标中的数
    public static void huan(int[] arr,int i,int j)
    {
        int c;
        c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }
}
