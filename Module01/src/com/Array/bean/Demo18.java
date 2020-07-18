package com.Array.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 14:17
 */
class Demo18 {
    public static void main(String[] args)
    {
        //二分法查找：前提条件：被查找的数组必须是有序的
        int[] arr={2,34,45,56,67,78,89,99};
        int key=89;
        int index=halfSearch(arr,45);
        System.out.println("index="+index);
    }
    //二分法查找
    //结果：下标或-1
    //参数：数组，被查找的数
    public static int halfSearch(int[] arr,int key)
    {
        int min=0,max=arr.length-1,mid;
        while(min<=max)
        {
            mid=(min+max)/2;
            if(key>arr[mid])
                min=mid+1;
            else if(key<arr[mid])
                max=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
