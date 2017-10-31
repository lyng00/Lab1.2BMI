package com.example.user.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight, editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Linking UI to program
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        imageViewResults = (ImageView) findViewById(R.id.imageViewResults);
    }

    public void calculateBMI (View view)
    {
        double weight, height, BMI;
        String result;

        weight = (Double.parseDouble(editTextWeight.getText().toString()));
        height = (Double.parseDouble(editTextHeight.getText().toString()));
        BMI = weight/(height*height);

        if(BMI<=18.5)
        {
            result = "You are underweight, exercise more to gain weight!";
            imageViewResults.setImageResource(R.drawable.under);
        }
        else if(BMI>=21)
        {
            result = "You are overweight, watch your diet!";
            imageViewResults.setImageResource(R.drawable.over);
        }
        else
        {
            result = "You are normal, keep up the balanced diet!";
            imageViewResults.setImageResource(R.drawable.normal);
        }


        textViewResult.setText(result);

    }

    public void reset (View view)
    {
        editTextWeight.setText("");
        editTextHeight.setText("");
        textViewResult.setText("");
        imageViewResults.setImageResource(R.drawable.empty);
    }
}
