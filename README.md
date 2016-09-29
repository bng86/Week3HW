# Week3HW

作業目標依據性別計算 BMI 並顯示的健康狀況 

在 java/tw.andyang.week3hw 下有一個 BMI 的 class

請完成 calculate() 計算 BMI 及 getEvaluation() 取的將康狀況 兩個方法

題目情境如下 

```java
/**
 * 健康狀況	BMI       值
 *          女性	      男性
 * 過瘦      18.5以下  20 以下
 * 理想體重	18.5~23   20~24
 * 超重	    25～30
 * 嚴重超重	30～40
 * 極度超重	40以上
 */
```

```java
public float calculate() {

    //TODO 使用身高體重計算 BMI

    return 0.0f;
}
```

```java
public String getEvaluation() {
    String evaluation = "";

    //TODO 依據 calculate() 計算的 BMI 值給出評價，需要考慮男女

    return evaluation;
}
```

# 如何驗證是否完成

到 java/tw.andyang.week3hw (test) 下的 BMITest 類別中

點選 getEvaluation() 方法左邊的綠色小箭頭 可看到測試結果出現綠色的 ok 代表通過
