package tw.andyang.week3hw;

/**
 * Created by user on 2016/10/5.
 */

public class person {

    private float height, weight;
    private String gender;

    public static final String MALE = "male";
    public static final String FEMALE = "female";

    public person(float height, float weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }


}
