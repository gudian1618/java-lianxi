package com.github.gudian1618.MoreStatic;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/7/26 16:49
 * @description
 */
public class Salary extends Employee{
    
    private double salary;
    
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    
    @Override
    public void mailCheck() {
        super.mailCheck();
        System.out.println("Salary 类的mailCheck 方法");
        System.out.println("邮寄支票给："+getName()+",工资为："+salary);
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double newsalary) {
        if (newsalary >= 0.0) {
            salary = newsalary;
        }
    }
    
    public double computePay() {
        System.out.println("计算工资，付给："+getName());
        return salary/52;
    }
}
