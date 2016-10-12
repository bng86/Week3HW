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

       // BMI bmi = new BMI(1.75f, 56.350002f, "female");
        //Assert.assertEquals("過瘦", bmi.getEvaluation());

        BMI bmi = new BMI(1.75f, 60.943752f, "male");
        Assert.assertEquals("過瘦", bmi.getEvaluation());

         //bmi.update(1.75f, 60.943752f, "male");
        //Assert.assertEquals("過瘦", bmi.getEvaluation());

        bmi.update(1.75f, 64.375f, "female");
        Assert.assertEquals("理想體重", bmi.getEvaluation());

        bmi.update(1.75f, 66.93575f, "male");
        Assert.assertEquals("理想體重", bmi.getEvaluation());

        bmi.update(1.75f, 79.06775f, "male");
        Assert.assertEquals("超重", bmi.getEvaluation());

        bmi.update(1.75f, 99.71865f, "male");
        Assert.assertEquals("嚴重超重", bmi.getEvaluation());

        bmi.update(1.75f, 100.34575f, "male");
        Assert.assertEquals("極度超重", bmi.getEvaluation());
    }

}