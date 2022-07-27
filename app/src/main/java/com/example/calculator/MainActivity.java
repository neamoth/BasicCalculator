package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView sum;
    Button plus, minus, mult, div, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        mult = findViewById(R.id.mult);
        div = findViewById(R.id.div);
        clear = findViewById(R.id.clear);
        sum = findViewById(R.id.sum);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int plusis = (Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString()));
                sum.setText("Ans is, "+ plusis);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minus = (Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString()));
                sum.setText("Ans is, "+ minus);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mult = (Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString()));
                sum.setText("Ans is, "+ mult);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((Integer.parseInt(n2.getText().toString()))==0){
                    sum.setText("Undefined");
                }
                else {
                    double div = (Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString()));
                    sum.setText("Ans is, " + div);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum.setText("");
                n1.setText("");
                n2.setText("");
            }
        });
    }

}