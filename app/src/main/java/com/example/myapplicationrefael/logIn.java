package com.example.myapplicationrefael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class logIn extends AppCompatActivity implements View.OnClickListener {
    private Button btnFinish, btnCreateAcount;
    private EditText edtName, edtPassword;
    private TextView tvInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        initView();
        btnFinish.setOnClickListener(this);
        btnCreateAcount.setOnClickListener(this);

    }

    private void initView() {
        btnFinish = findViewById(R.id.buttonFinnish);
        edtName = findViewById(R.id.editTextText2);
        edtPassword = findViewById(R.id.editTextTextPassword);
        tvInfo = findViewById(R.id.textViewInfo);
        btnCreateAcount = findViewById(R.id.buttonCreateAcount);
    }

    @Override
    public void onClick(View view) {
        if (view == btnFinish)
        {

        }
        if (view == btnCreateAcount)
        {
            Intent go = new Intent(this, MainActivity.class);
            startActivity(go);

        }

    }
}