package com.example.effective9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * try-with-resources 优先于 try-finally
 * @author qxw
 * @version 1.00
 * @time  28/5/2019 上午 11:58
 */
public class Main {

    /**
     * 传统的资源关闭方式
     * @param args
     */
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File("test"));
            System.out.println(inputStream.read());
        } catch (IOException e) {
             throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }
    }

    /**
     *  try-with-resource语法
     *
     *  不论 try 中是否有异常，都会首先自动执行 close 方法，然后才判断是否进入 catch 块
     */
    public static void test() {
        try (FileInputStream inputStream = new FileInputStream(new File("test"))) {
            System.out.println(inputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
