package com.cathyhibari.a03160454;

/**
 * Created by user on 2016/9/21.
 */
public class HelloWorld {

        // default 0
        short shortInteger;
        // default is 0
        int age;
        //default is 0L
        long billion;
        //default is 0.0D
        double lat;
        //default is false
        boolean isAdult;
        // default is 0
        byte singal;
        char aChar;


public HelloWorld() {

    printBMI();
}
    private void printBMI() {
        float weight = 70.5f;
        float height = 1.76f;

        float  bmi =weight/height * height;

        if(bmi<18.5f){
            System.out.println("太輕");
        }else if (bmi>=18.5f &&bmi<25){
            System.out.println("一般體重");
        }
        else{
            System.out.println("極度超重");
        }
    }
}