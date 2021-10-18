package com.example.lesson_four_exercise_two;

import android.util.Log;

public class Calculator {
    public int firstnumber;
    public int secondnumber;
    public char operation;
    public boolean onoff;


    public Calculator(boolean onoff,int firstnumber, char operation, int secondnumber) {
        this.firstnumber = firstnumber;
        this.operation = operation;
        this.secondnumber = secondnumber;
        this.onoff = onoff;

        this.onoff(onoff);

    }

    public void onoff(boolean onoff) {
        if(this.onoff) {
            this.operations();
        }else {
            Log.d("myLog", "Please turn on!");
        }
    }


    public void operations(){
        switch (operation) {
            case '+':
                int result = firstnumber + secondnumber;
                Log.d("myLog", "" + result);
                break;

            case '-':
                result = firstnumber - secondnumber;
                Log.d("myLog", "" + result);
                break;

            case '*':
                result = firstnumber * secondnumber;
                Log.d("myLog", "" + result);
                break;

            case '/':
                result = firstnumber / secondnumber;
                if(result % 2 != 0) {
                    Math.round(result);
                    Log.d("myLog", "" + result);
                }else
                {
                Log.d("myLog", "" + result);
                }
                break;

            case ' ':
                Log.d("myLog", "No operation selected.");
                break;
        }

    }

}
