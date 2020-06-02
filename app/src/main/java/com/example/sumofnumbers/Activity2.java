package com.example.sumofnumbers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv=(TextView)findViewById(R.id.text5);
        Intent i= getIntent();
        Bundle b=i.getExtras();
        String str=b.getString("num");
        String s1=b.getString("n1");
        String s2=b.getString("n2");

        tv.setText("Sum of "+s1+" + "+s2+" = "+str);






    }
}
