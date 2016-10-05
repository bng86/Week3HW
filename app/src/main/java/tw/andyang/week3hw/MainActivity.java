package tw.andyang.week3hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person male = new person(100.0f,100.0f,person.MALE);
        BMI bmi=new BMI(male);
        Log.d(TAG,"calculate:"+bmi.calculate());
        Log.d(TAG,"getEvaluation:"+bmi.getEvaluation());

        TextView
    }
}
