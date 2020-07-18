package com.Extends.bean;

/**
 * @auther Erdan
 * @creat 2019/9/8 17:13
 需求：公司中程序员有姓名，工号，薪水，工作内容
 项目经理除了有姓名，工号，薪水，还有奖金，工作内容
 对给出需求进行数据建模
 */
abstract class Employee
{
    private String name;
    private String id;
    private double money;

    public Employee(){}

    public Employee(String name,String id, double money)
    {
        this.name=name;
        this.id=id;
        this.money=money;
    }
    public abstract void work();
}
class Programmer extends Employee
{
    public Programmer(){}
    public Programmer(String name,String id,double money)
    {
        super(name,id,money);
    }
    public void work()
    {
        System.out.println("写代码");
    }
}
class Manager extends Employee
{
    private double bonus;

    public Manager(){}
    public Manager(String name,String id,double money,double bonus)
    {
        super(name,id,money);
        this.bonus=bonus;
    }
    public void work()
    {
        System.out.println("管理程序员");
    }
}
class Demo09
{
    public static void main(String[] args)
    {
        Programmer prog=new Programmer("张三","1001",15000);
        prog.work();

        Manager manager=new Manager("李四","1009",25000,5000);
        manager.work();
    }
}
