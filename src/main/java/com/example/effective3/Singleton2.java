package com.example.effective3;

/**
 * 公有域方法的主要优势在于， API 很清楚地表明了这个类是一个 Singleton ：
 * 公有的静态域是final的，所以该域总是包含相同的对象引用 。 第二个优势在于它更简单。
 * @author qxw
 * @version 1.00
 * @time  27/5/2019 上午 11:43
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE= new Singleton2();
    private Singleton2() {  }
    public static Singleton2 getInstance(){
        return INSTANCE;
    }
    public void leaveTheBuilding() { }


}
