package com.example.lesson_four_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Calculator addition = new Calculator(true, 15, '+',2);
    Calculator subtraction = new Calculator(true, 15, '-',2);
    Calculator multiplication = new Calculator(true, 15, '*',2);
    Calculator division = new Calculator(true, 15, '/',2);
    Calculator mycalc = new Calculator(true, 15, ' ',2);






}