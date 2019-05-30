package com.example.effective11;

import java.util.HashMap;
import java.util.Map;

/**
 *  覆盖 equals 时总要覆盖 hashCode
 *      在每个 覆盖了 equals 方法的类中， 都必须覆盖 hashCode 方法
 *      相等的对象必须具有相等的散到码（ hash code ）
 * @author qxw
 * @version 1.00
 * @time  30/5/2019 下午 12:43
 */
public class Main {

    public static void main(String[] args) {
        Map<User,Object> map=new HashMap<>(2);
        map.put(new User("qxw","qw"),"qxw");
        map.put(new User("aaa","aaaa"),"aaaa");

        User u1=new User("qxw","qw");
        User u2=new User("qxw","qw");
        System.out.println(u1==u2);
        System.out.println(map.get(u1)==map.get(u2));


    }
}
