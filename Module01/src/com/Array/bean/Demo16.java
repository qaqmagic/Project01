package com.Array.bean;

/**
 * @auther Erdan
 * @creat 2019/9/1 20:45
 */
class Demo16 {
    public static void main(String[] args)
    {
        //查找：一个数在数组中第一次出现的下标，不存在输出-1
        int[] arr={12,3,44,55,6,3};
        int key=4;

        int index=find(arr,key);
        System.out.println("index="+index);
        /*int i=0;
        for(;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("index="+i);
                break;
            }
        }
        if(i==arr.length)
            System.out.println(("index=-1"));*/
    }
    //查找：一个数在数组中第一次出现的下标，不存在输出-1
    //结果：下标或-1 int
    //参数：数组，查找的数
    public static int find(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
                  return i;
        }
        return -1;
    }
}

