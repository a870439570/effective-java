package com.example.effective2;

public class Main {

    /**
     * 这样的客户端代码很容易编写，更为重要的是易于阅读 。 Builde「模式模拟了具名的可
     * 选参数，就像 Python 和 Scala 编程语言中的一样 。
     * @param args
     */
    public static void main(String[] args) {
        NutritionFacts  facts=new NutritionFacts.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).builder();

        System.err.println(facts.getServingSize());
        System.err.println(facts.toString());
    }
}
