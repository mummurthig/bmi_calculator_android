package com.example.bmicalculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        //Actionbar and its title
        actionBar = getSupportActionBar();
        actionBar.setTitle("BMI Calculator");
        //anable back button
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);

    }

    public void calcbmi(View view)
    {
        double weight = 0;
        double height = 0;
        double bmi = 0;
        String msg = "";

        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);

        Button b1 = (Button) findViewById(R.id.button2);

        TextView t1 = (TextView) findViewById(R.id.newtext1);
        TextView t2 = (TextView) findViewById(R.id.newtext2);


        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi= height * height ;
        bmi = weight/bmi;

        t1.setText(String.valueOf(bmi));

        if(bmi<18.5)
        {
            msg="Under Weight";
        }
        else if(bmi>18.5 && bmi<25)
        {
            msg="Normal";
        }
        else if(bmi>25)
        {
            msg="Over Weight";
        }
        t2.setText(msg);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();  //go previous activity
        return super.onSupportNavigateUp();
    }
}
