package com.Array.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 10:34
 */
class Demo17 {
    public static void main(String[] args)
    {
        int[] arr={12,23,34,45,57,6};
        //在数组中，找到指定元素99对应的索引
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==99)
            {
                index=i;
            }
        }
        System.out.println("对应的索引："+index);
    }
}
