package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        EditText ress = findViewById(R.id.EDres);

        Button ADD = findViewById(R.id.add);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int addNUM = number1 + number2;
                ress.setText(Integer.toString(addNUM));    }    });


        Button MINS = findViewById(R.id.mins);
        MINS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int minsNUM = number1 - number2;
                ress.setText(Integer.toString(minsNUM));    }    });


        Button MULTI = findViewById(R.id.multi);
        MULTI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int multiNUM = number1 * number2;
                ress.setText(Integer.toString(multiNUM));    }    });


        Button DIV = findViewById(R.id.div);
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int divNUM = number1 / number2;
                ress.setText(Integer.toString(divNUM));    }    });


    }
}