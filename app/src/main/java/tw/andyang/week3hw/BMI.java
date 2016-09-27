package tw.andyang.week3hw;

import android.support.annotation.VisibleForTesting;

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

        //TODO 使用身高體重計算 BMI

        return weight/(height*height);
    }

    /**
     *
     * 健康狀況	BMI       值
     *          女性	      男性
     * 過瘦      18.5以下  20 以下
     * 理想體重	18.5~25   20~25
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

        if(gender == "female")
        {
            if(calculate()<18.5){
                evaluation = "過瘦";
            }
            else if(calculate()>=18.5 && calculate()<25){
                evaluation = "理想體重";
            }
            else if(calculate()>=25 && calculate()<30){
                evaluation = "超重";
            }
            else if(calculate()>=30 && calculate()<40){
                evaluation = "嚴重超重";
            }
            else if(calculate()>=40){
                evaluation = "極度超重";
            }
        }
        else if(gender == "male");
        {
            if(calculate()<20){
                evaluation = "過瘦";
            }
            else if(calculate()>=20 && calculate()<25){
                evaluation = "理想體重";
            }
            else if(calculate()>=25 && calculate()<30){
                evaluation = "超重";
            }
            else if(calculate()>=30 && calculate()<40){
                evaluation = "嚴重超重";
            }
            else if(calculate()>=40){
                evaluation = "極度超重";
            }
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
