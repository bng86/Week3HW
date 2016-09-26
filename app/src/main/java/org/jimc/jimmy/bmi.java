package org.jimc.jimmy;

/**
 * Created by Jimmy on 9/26/2016.
 */
public class bmi {

    short shortInteger=0;
    int age;
    long billion;
    float pi;
    double lat;
    boolean isAdult;
    byte singal;
    char aChar;

    public bmi() {

        printBMI();
    }
    private  void printBMI(){
        float weight=75.5f;
        float height=170.5f;

        //BMI=W/((H/100)*(H/100));

        float bmi=weight/((height/100) *( height/100));
        System.out.println(bmi);
        System.out.println("            女性        男性\n" + " 過瘦      18.5以下     20 以下\n"+ "理想體重    18.5~23    20~24\n"+"超重       25～30\n"+
                "嚴重超重 30～40\n"+
                "極度超重 40以上");

        if(bmi<18.5f)
        {
            System.out.println("too thin");
        }
        else if(bmi>18.5f&&bmi<25)
        {
            System.out.println("normal");

        }
        else
        {
            System.out.println("too fat");
        }
    }
}
