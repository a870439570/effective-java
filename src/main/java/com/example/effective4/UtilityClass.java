package com.example.effective4;


/**
 * 通过私有构造器强化不可实例化的能力
 * @author qxw
 * @version 1.00
 * @time  28/5/2019 上午 10:01
 */
public class UtilityClass {

    /**
     * 只有当类不包含显式的构造器时，
     * 编译器才会生成缺省的构造器，因此只要让这个类包含一个私有构造器，它就不能被实例化 ：
     */


    private UtilityClass(){

    }

    public  static String getName(){
        return "【UtilityClass】";
    }
}
