package com.example.sumofnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText fn,sn;
    Button submit,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn=(EditText)findViewById(R.id.text3);
        sn=(EditText)findViewById(R.id.text4);
        submit=(Button)findViewById(R.id.addb);
        reset=(Button)findViewById(R.id.resetb);

        submit.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  int num1= Integer.parseInt(fn.getText().toString());
                  int num2=Integer.parseInt(sn.getText().toString());
                  int sum=num1+num2;


                  Intent i=new Intent(MainActivity.this,Activity2.class);
                  Bundle b= new Bundle();
                  b.putString("num",sum+"");
                  b.putString("n1",num1+"");
                  b.putString("n2",num2+"");
                  i.putExtras(b);
                  startActivity(i);


              }

          });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fn.setText("");
                sn.setText("");
                fn.requestFocus();

            }
        });






    }
}
