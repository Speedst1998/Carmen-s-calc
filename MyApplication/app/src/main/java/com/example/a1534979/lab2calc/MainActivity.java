package com.example.a1534979.lab2calc;

import android.support.v7.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText etAmount, etTerm, etInterest;
    TextView amountR, termR, interestR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAmount = (EditText) findViewById(R.id.amount);
        etTerm = (EditText) findViewById(R.id.term);
        etInterest = (EditText) findViewById(R.id.interest);
        amountR = (TextView) findViewById(R.id.amountR);
        termR = (TextView) findViewById(R.id.termR);
        interestR = (TextView) findViewById(R.id.interestR);

    }

    public void clear(View v) {

        etAmount.setText("");
        etTerm.setText("");
        etInterest.setText("");

    }

    public void calculate(View v) {


        LoanCalculator cal = new LoanCalculator(Double.parseDouble(etAmount.getText().toString()),
                Integer.parseInt(etTerm.getText().toString()),
                Double.parseDouble(etInterest.getText().toString()));
        amountR.setText(cal.getLoanAmount() + "");
        termR.setText(cal.getMonthlyPayment() + "");
        interestR.setText(cal.getNumberOfYears() + "");
    }
}
