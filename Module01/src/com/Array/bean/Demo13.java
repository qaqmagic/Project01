package com.Array.bean;

class Demo13 {
    public static void main(String[] args)
    {
        int[] arr={23,4,56,126,2};
        selectSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
                System.out.print(arr[i]+",");
            else
                System.out.print(arr[i]);
        }
    }
    //选择排序
    //结果:无结果
    //参数：整形数组
    public static void selectSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    //交换
                    huan(arr,j,i);
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
