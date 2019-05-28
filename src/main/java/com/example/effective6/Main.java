package com.example.effective6;

import java.util.regex.Pattern;

/**
 * 避免创建不必要的对象
 * @author qxw
 * @version 1.00
 * @time  28/5/2019 上午 11:15
 */
public class Main {



    /**
     * 判断一个字符串是否是有效的数字
     *
     * 虽然 String.matches 方法最易于查看一个字符串是否与正则表达式相匹配，但并不适合在注重性能的情形中重复使用
     * 内部为正则表达式创建了一个 Pattern 实例，却只用了一次，之后就可以进行垃圾回收
     * @param s
     * @return
     */
     public  static boolean isRomanNumeral(String s) {
        return s.matches("^[0-9]*$ ");
    }


    /**
     * 提升性能的做法是 将正则表达式编译成一个不可变的实例，让它成
     * 为类初始化的一部分，并将它缓存起来
     * @param s
     * @return
     */

    private  static  final Pattern ROMAN=Pattern.compile("^[0-9]*$");
    public  static boolean isRomanNumeral2(String s) {
        return ROMAN.matcher(s).matches();
    }
}
