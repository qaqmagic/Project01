package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/5 21:26
 * 显示超人的名字
 */
class SuperMan
{
    private  String name;
    private  static SuperMan sm=new SuperMan("暴徒");
    private SuperMan(){}
    private SuperMan(String name){
        this.name=name;
    }
    public static SuperMan getInstance()
    {
        return sm;
    }
    public String getName()
    {
        return name;
    }
}
class Demo37
{
    public static void main(String[] args)
    {
        SuperMan sm=SuperMan.getInstance();
        System.out.println(sm.getName());
    }
}
