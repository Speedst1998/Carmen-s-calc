package com.example.a1534979.lab2calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText etAmount, etTerm, etInterest;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void clearNums(View v){

        etNum1.setText("");
        etNum2.setText("");

    }
}
