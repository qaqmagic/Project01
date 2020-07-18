package com.Array.bean;

class Demo15 {
    public static void main(String[] args)
    {
        //查找：一个数在数组中第一次出现的下标，不存在输出-1
        int[] arr={12,3,44,55,6,3};
        int key=3;

        int i=0;
        for(;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("index="+i);
                break;
            }
        }
        if(i==arr.length)
            System.out.println(("index=-1"));
    }
}
