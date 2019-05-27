package com.example.effective3;

/**
 *  用私有构造器或者枚举类型强化 Singleton 属性
 * @author qxw
 * @version 1.00
 * @time  27/5/2019 上午 11:35
 */
public class Main {

    public static void main(String[] args) {
        Singleton1 obj1=Singleton1.INSTANCE;
        Singleton1 obj2=Singleton1.INSTANCE;
        System.err.println(obj1==obj2);

        Singleton2 obj3=Singleton2.getInstance();
        Singleton2 obj4=Singleton2.getInstance();
        System.err.println(obj3==obj4);


        Singleton3 obj5=Singleton3.getInstance();
        Singleton3 obj6=Singleton3.getInstance();
        System.err.println(obj5==obj6);
    }
}
