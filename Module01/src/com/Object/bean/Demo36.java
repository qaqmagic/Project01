package com.Object.bean;

/**
 * @auther Erdan
 * @creat 2019/9/5 21:16
 * 工厂加工零件
 */
class Factory
{
    private int num;
    private static Factory f=new Factory();
    private Factory(){}
    public static Factory getInstance()
    {
        return f;
    }
    public void jiaGong()
    {
        System.out.println("这是第"+(++num)+"个零件");
    }
}
class Demo36
{
    public static void main(String[] args)
    {
        Factory f1=Factory.getInstance();
        f1.jiaGong();
        f1.jiaGong();
        f1.jiaGong();
        f1.jiaGong();
        f1.jiaGong();

        Factory f2=Factory.getInstance();
        f2.jiaGong();
        f2.jiaGong();
        f2.jiaGong();
        f2.jiaGong();
        f2.jiaGong();

    }
}
