package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/4 19:58
 * 这是一个定义了操作数字常用功能的工具类，比如求最大值，排序，查找
 */
public class ArrayTool
{
    private ArrayTool() {}

    /**
     * 这是数组中最大值的功能
     * @param int[] 接收一个整型的数组
     * @return int 返回一个整型的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    /**
     * 这是对数组进行选择排序的功能
     * @param int[] 接收一个整型数组
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[j] < arr[i]) {
                    exchange(arr, j, i);
                }
            }
        }
    }

    private static void exchange(int[] arr, int i, int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 这是对数组进行二分法查找的功能
     * @param int[] 接收一个整型数组
     * @param int[] 接收被查找的数
     * @return int 返回的是下标或-1
     */
    public static int halfSearch(int[] arr, int key)
    {
        int min = 0, max = arr.length - 1, mid;
        while (min < max) {
            mid = (min + max) >> 1;
            if (key > arr[mid])
                min = mid + 1;
            else if (key < arr[mid])
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
