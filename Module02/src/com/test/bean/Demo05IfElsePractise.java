package com.test.bean;

/**
 * @auther Recruit
 * @creat 2019/12/18 22:24
 */
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        int score = 100;
        if (score < 0 || score > 100) {
            System.out.println("成绩错误");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 70 && score < 80) {
            System.out.println("良");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else {
            System.out.println("不及格");
        }
    }
}
