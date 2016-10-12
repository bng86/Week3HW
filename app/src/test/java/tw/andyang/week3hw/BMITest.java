package tw.andyang.week3hw;

import org.junit.Assert;
import org.junit.Test;

public class BMITest {

    /**
     * 健康狀況	BMI       值
     * 女性	      男性
     * 過瘦      18.5以下  20 以下
     * 理想體重	18.5~25   20~25
     * 超重	    25～30
     * 嚴重超重	30～40
     * 極度超重	40以上
     */

    @Test


    public void getEvaluation() throws Exception {

        BMI bmi = new BMI(1.75f, 56.350002f, "female");
        Assert.assertEquals("過瘦", bmi.getEvaluation());

        bmi.update(1.75f, 60.943752f, "male");
        Assert.assertEquals("過瘦", bmi.getEvaluation());

        bmi.update(1.75f, 67.375f, "female");
        Assert.assertEquals("理想體重", bmi.getEvaluation());

        bmi.update(1.75f, 71.96875f, "male");
        Assert.assertEquals("理想體重", bmi.getEvaluation());

        bmi.update(1.75f, 78.09375f, "male");
        Assert.assertEquals("超重", bmi.getEvaluation());

        bmi.update(1.75f, 108.71875f, "male");
        Assert.assertEquals("嚴重超重", bmi.getEvaluation());

        bmi.update(1.75f, 139.34375f, "male");
        Assert.assertEquals("極度超重", bmi.getEvaluation());
    }

}