package com.example.effective2;

/**
 *
 * 遇到多个构造器参数时要考虑使用构建器
 * @author qinxuewu
 * @version 1.00
 * @time  25/4/2019 下午 3:03
 */
public class NutritionFacts {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    public  static  class Builder{
        private int servingSize;
        private int servings;
        private int calories=0;
        private int fat=0;
        private int sodium=0;
        private int carbohydrate=0;

        public  Builder( int servingSize, int servings){
            this.servingSize=servingSize;
            this.servings=servings;
        }
        public  Builder calories(int val){
            calories=val;
            return this;
        }
        public  Builder fat(int val){
            fat=val;
            return this;
        }
        public  Builder sodium(int val){
            sodium=val;
            return this;
        }
        public  Builder carbohydrate(int val){
            carbohydrate=val;
            return this;
        }
        public  NutritionFacts builder(){
            return new NutritionFacts(this);
        }
    }

    private  NutritionFacts(Builder builder){
        servingSize=builder.servingSize;
        servings=builder.servings;
        calories=builder.calories;
        fat=builder.fat;
        sodium=builder.sodium;
        carbohydrate=builder.carbohydrate;
    }


    /**
     * 只提供getter方法
     * @return
     */
    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
