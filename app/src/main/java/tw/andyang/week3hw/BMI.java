package tw.andyang.week3hw;

import android.icu.util.Output;
import android.provider.Settings;
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
     * 理想體重	18.5~23   20~24
     * 超重	    25～30
     * 嚴重超重	30～40
     * 極度超重	40以上
     */

    /**
     * @return 回傳健康狀況
     */
    public String getEvaluation() {

        System.out.print(calculate());
        String evaluation = "";
        if (gender.equals(MALE)){
            if ( calculate()<20f){

                evaluation="過瘦";
            }
            if ( calculate()>=20f &&  calculate()<=24f){
                evaluation="理想體重";
            }
            if ( calculate()>=25f &&  calculate()<30f){
                evaluation="超重";
            }
            if ( calculate()>=30f && calculate()<40f){
                evaluation="嚴重超重";
            }
            if ( calculate()>=40f){
                evaluation="極度超重";

            }
        }else {

            if ( calculate()<18.5f){
                evaluation="過瘦";
            }
            if ( calculate()>18.5f&&  calculate()<23f){
                evaluation="理想體重";
            }
            if ( calculate()>24f &&  calculate()<30f){
                evaluation="超重";
            }
            if ( calculate()>=30f &&  calculate()<40f){
                evaluation="嚴重超重";
            }
            if ( calculate()>=40f){
                evaluation="極度超重";
            }

        }
        System.out.print("      "+evaluation+" \n");

        //TODO 依據 calculate() 計算的 BMI 值給出評價，需要考 慮男女

        return evaluation;
    }

    @VisibleForTesting
    public void update(float height, float weight, String gender){

        this.height = height;
        this.weight = weight;
        this.gender = gender;


    }

}
