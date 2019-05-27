package com.example.effective3;

/**
 *  实现 Singleton 的第三种方法是声明一个包含单个元素的枚举类型：
 * @author qxw
 * @version 1.00
 * @time  27/5/2019 上午 11:52
 */
public class Singleton3 {
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
    private static enum Singleton{
        INSTANCE;

        private Singleton3 singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new Singleton3();
        }
        public Singleton3 getInstance(){
            return singleton;
        }
    }
}
