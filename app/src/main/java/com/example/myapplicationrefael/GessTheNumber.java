package com.example.myapplicationrefael;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class GessTheNumber extends AppCompatActivity implements View.OnClickListener {
    private TextView txvTitle, tvInfromation;
    private EditText edtGuess;
    private Button btnCheck;
    int num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gess_the_number);
        initView();
        num = (int)(1 + Math.random()*100);
        btnCheck.setOnClickListener(this);

    }

    private void initView() {
    txvTitle = findViewById(R.id.txvTitle);
    tvInfromation = findViewById(R.id.tvInfromation);
    edtGuess = findViewById(R.id.edtGuess);
        btnCheck = findViewById(R.id.buttonCheck);
    }

    @Override
    public void onClick(View view) {
        if (view == btnCheck)
        {
            if (Integer.parseInt(edtGuess.getText().toString())== num)
                tvInfromation.setText("grate!");
            else
            if (Integer.parseInt(edtGuess.getText().toString())> num)
                tvInfromation.setText("go down!");
            if (Integer.parseInt(edtGuess.getText().toString())< num)
                tvInfromation.setText("go up!");
        }

    }
}