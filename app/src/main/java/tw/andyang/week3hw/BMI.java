package tw.andyang.week3hw;

import android.support.annotation.VisibleForTesting;

public class BMI {

    private float height, weight;
    private String gender;

    private static s
    /**
     * 計算 BMI
     *
     * @return BMI = weight (kg) / (height * height) (m)
     */
    public float calculate() {

        float w,h,bmi=0;
        w/h*h=bmi;


        return bmi;
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


        //TODO 依據 calculate() 計算的 BMI 值給出評價，需要考慮男女

        return evaluation;
    }

    @VisibleForTesting
    public void update(float height, float weight, String gender){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

}
