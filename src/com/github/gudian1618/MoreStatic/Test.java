package com.github.gudian1618.MoreStatic;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/7/26 16:13
 * @description
 * 多态展示
 */

public class Test {
    
    public static void show(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) {
            Dog c = (Dog)a;
            c.work();
        }
    }
    
    public static void main(String[] args) {
        
        show(new Cat());
        show(new Dog());
        
        Animal a = new Cat();
        a.eat();
     
        Cat c = (Cat)a;
        c.work();
    }
}

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}

