package com.example.effective11;

import java.util.Objects;

/**
 *  覆盖 equals 时总要覆盖 hashCode
 *
 *
 如果两个对象相等，则hashcode一定也是相同的
 两个对象相等,对两个对象分别调用equals方法都返回true
 两个对象有相同的hashcode值，它们也不一定是相等的
 因此，equals 方法被覆盖过，则 hashCode 方法也必须被覆盖
 hashCode() 的默认行为是对堆上的对象产生独特值。如果没有重写 hashCode()，则该 class 的两个对象无论如何都不会相等（即使这两个对象指向相同的数据）

 * @author qxw
 * @version 1.00
 * @time  30/5/2019 下午 12:43
 */
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String name,String password){
        this.name=name;
        this.password=password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

//       此种写法： 运行速度更慢一些，因为它们会引发数组的创建，以便传入数目可变的参数， 如果参数中有基本类型，还需要装箱和拆箱
//      return   Objects.hash(getName(),getPassword());

//  如果一个类是不可变的，并且计算散列码的开销也比较大 ， 就应该考虑把散列码缓存在对象内部，而不是每次请求的时候都重新计算散列码
        int result = 17;
        result = result *31 + name.hashCode();
        result = result*31 + password.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // 自反性：对于任意的对象x，x.equals(x)返回true(自己一定等于自己)
        if(obj == this) {
            return true;
        }
//       比较是否为同一类型
        if(!(obj instanceof  User)){
            return false;
        }
//       类型转换成目标对象  比较 自定的字段 是否相等   全部字段都要进行比较
        User u=(User)obj;
//       //比较属性值
        return u.name.equals(name) && u.password.equals(password);
    }
}
