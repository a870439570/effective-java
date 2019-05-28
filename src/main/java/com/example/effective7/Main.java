package com.example.effective7;

import java.util.Arrays;

/**
 * 消除过期的对象引用
 * @author qxw
 * @version 1.00
 * @time  28/5/2019 上午 11:26
 */
public class Main {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public  Main(){
        elements=new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public  void  push(Object e){
              ensureCapacity();
            elements[size++]=e;
    }

    public  Object pop(){
        if(size==0){
            throw new RuntimeException();
        }
        Object result=elements[--size];
        elements[size]=null;  //消除过期引用
//        return elements[--size];
        return  result;
    }


    private  void  ensureCapacity(){
        if(elements.length==size){
            elements= Arrays.copyOf(elements,2*size+1);
        }
    }
}
