package com.github.gudian1618.MoreStatic;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/7/26 16:43
 * @description
 */
public class Employee {
    private String name;
    private String address;
    private int number;
    
    public Employee(String name, String address, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    public void mailCheck() {
        System.out.println("邮寄支票给："+this.name+" "+ this.address);
    }
    
    @Override
    public String toString() {
        return name +" "+ address +" "+ number;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getNumber() {
        return number;
    }
    
}
