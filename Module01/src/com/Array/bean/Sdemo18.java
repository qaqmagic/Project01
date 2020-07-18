package com.Array.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 14:32
 */
public class Sdemo18 {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index=binarySearch(arr,2);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr,int item)
    {
        int low=0;
        int high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int guess=arr[mid];
            if(guess==item){
                index=mid;
                break;
            }
            if(guess>item){
                high=mid-1;
            }
            if(guess<item){
                high=mid+1;
            }
        }
        return index;
    }
}
