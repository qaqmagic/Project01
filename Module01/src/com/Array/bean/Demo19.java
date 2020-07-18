package com.Array.bean;

/**
 * @auther Erdan
 * @creat 2019/9/2 14:46
 */
public class Demo19 {
    public static void main(String[] args)
    {
        int[][] arr=new int[2][3];
        int[][] b={{1,2,3},{2,3,4,5}};
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
