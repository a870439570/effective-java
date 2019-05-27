package com.example.effective3;

import java.io.Serializable;

/**
 *  私有构造器仅被调用一次，用来实例化公有的静态 final域
 *  由于缺少公有的或者受保护的构造器，所以保证了 Elvis 的全局唯一性
 *  一旦 Elvis 类被实例化，将只会存在一个 Elvis 实例 ，不多也不少
 *
 *  但是可以借助反射方法调用。想要禁止反射调用，可以修改构造器 让它第二次被要求创建实例e时抛出异常
 * @author qxw
 * @version 1.00
 * @time  27/5/2019 上午 11:41
 */
public class Singleton1 implements Serializable {
    public static final Singleton1 INSTANCE= new Singleton1();
    private Singleton1() {  }
    public void leaveTheBuilding() { }


    /**
     * 为了维护并保证 SSingleton,必须声明所有实例域都是瞬时（ transient ）的，并提供一个 readResolve 方法
     * 否则 ，每次反序列化一个序列化的实例时＼都会创建一个新的实例
     * @return
     */
    private Object readResolve () {

        return  INSTANCE;
    }
}
