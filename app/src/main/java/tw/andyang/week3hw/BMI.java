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

        return weight / (height * height)*1.0f;
    }

    public String getEvaluation() {
        String evaluation = "";
        if(calculate()<18.5f&& gender=="female"){
            evaluation = "過瘦";
        }else if(calculate()<20 && gender=="male"){
            evaluation = "過瘦";
        }else if(calculate()>=18.5f && calculate()<25 && gender=="female"){
            evaluation =  "理想體重";
        }else if(calculate()>=20 && calculate()<25 && gender=="male"){
            evaluation = "理想體重";
        }else if(calculate()>=25&& calculate()<30 ){
            evaluation = "超重";
        }else if(calculate()>=30&& calculate()<40 ){
            evaluation = "嚴重超重";
        }else if(calculate()>=40 ){
            evaluation = "極度超重";
        }



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
