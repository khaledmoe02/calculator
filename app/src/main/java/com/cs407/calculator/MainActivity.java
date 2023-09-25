package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickSubtractFunction(View view){
        EditText myFirstNumber = (EditText) findViewById(R.id.myFirstNumber);
        EditText mySecondNumber = (EditText) findViewById(R.id.mySecondNumber);

        int total = Integer.parseInt(myFirstNumber.getText().toString()) - Integer.parseInt(mySecondNumber.getText().toString());
        goToActivity(String.valueOf(total));
    }

    public void clickAddFunction(View view){
        EditText myFirstNumber = (EditText) findViewById(R.id.myFirstNumber);
        EditText mySecondNumber = (EditText) findViewById(R.id.mySecondNumber);

        int total = Integer.parseInt(myFirstNumber.getText().toString()) + Integer.parseInt(mySecondNumber.getText().toString());
        goToActivity(String.valueOf(total));
    }

    public void clickMultFunction(View view){
        EditText myFirstNumber = (EditText) findViewById(R.id.myFirstNumber);
        EditText mySecondNumber = (EditText) findViewById(R.id.mySecondNumber);

        int total = Integer.parseInt(myFirstNumber.getText().toString()) * Integer.parseInt(mySecondNumber.getText().toString());
        goToActivity(String.valueOf(total));
    }

    public void clickDivideFunction(View view){
        EditText myFirstNumber = (EditText) findViewById(R.id.myFirstNumber);
        EditText mySecondNumber = (EditText) findViewById(R.id.mySecondNumber);

        int num2 = Integer.parseInt(mySecondNumber.getText().toString());
        if( num2 == 0){
            goToErrorActivity("Error, Can't divide by zero.");
        }else {
            int total = Integer.parseInt(myFirstNumber.getText().toString()) / Integer.parseInt(mySecondNumber.getText().toString());
            goToActivity(String.valueOf(total));
        }
    }

    public void goToActivity(String num){
        Intent intent = new Intent(this, CalcApp.class);
        intent.putExtra("message", num);
        startActivity(intent);
    }

    public void goToErrorActivity(String s){
        Intent intent = new Intent(this, CalcApp.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}