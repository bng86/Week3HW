package tw.andyang.week3hw;

import android.support.annotation.VisibleForTesting;

import static java.lang.System.out;

public class BMI {

    private float height, weight;
    private String gender;

    private static final String MALE = "male";
    private static final String FEMALE = "female";

    public BMI(float height, float weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    /**
     * 計算 BMI
     *
     * @return BMI = weight (kg) / (height * height) (m)
     */
    public float calculate() {



        return  weight/ (height * height)*1.0f;
    }

    /**
     *
     * 健康狀況	BMI       值
     *          女性	      男性
     * 過瘦      18.5以下  20 以下
     * 理想體重	18.5~23   20~24
     * 超重	    25～30
     * 嚴重超重	30～40
     * 極度超重	40以上
     */

    /**
     * @return 回傳健康狀況
     */
    public String getEvaluation() {

        String evaluation = "";

        if(gender==MALE) {
            if (calculate() < 20) System.out.println(evaluation ="過瘦");
            else if (calculate() >= 20 && calculate() <= 24) System.out.println(evaluation ="理想體重");
            else if (calculate() > 24 && calculate() < 31) System.out.println(evaluation ="超重");
            else if(calculate()>32 && calculate()<41) System.out.println(evaluation ="嚴重超重");
            else System.out.println(evaluation ="極度超重");
        }
        else if(gender==FEMALE){
            if (calculate() < 18.5) System.out.println(evaluation ="過瘦");
            else if (calculate() >= 18.5 && calculate() <= 24) System.out.println(evaluation ="理想體重");
            else if (calculate() > 24 && calculate() < 31) System.out.println(evaluation ="超重");
            else if(calculate()>32 && calculate()<41) System.out.println(evaluation ="嚴重超重");
            else  System.out.println(evaluation ="極度超重");
        }

        return evaluation;
    }

    @VisibleForTesting
    public void update(float height, float weight, String gender){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

}
