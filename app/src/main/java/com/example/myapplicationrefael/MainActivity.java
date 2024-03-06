package com.example.myapplicationrefael;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2,etName;
    TextView et3;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        btn = findViewById(R.id.btn);
        etName = findViewById(R.id.editTextName);


        btn.setOnClickListener(this);



    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    public void onClick(View view) {
        if (view == btn)
        {
            boolean valid = false;
            if (et1.getText().toString().length()>=8)
                if (et1.getText().toString().equals(et2.getText().toString()))
                        if (et1.getText().toString().matches(".*[a-z].*"))
                            if (et1.getText().toString().matches(".*[A-Z].*"))
                                if (et1.getText().toString().matches(".*[0-9].*"))
                                    valid = true;
                                else
                                    et3.setText("the pasword must contain at list one digit");
                            else
                                et3.setText("the pasword must contane at list one apper case letter");
                        else
                            et3.setText("the pasword must contane at listone lower  letter");
                  else
                    et3.setText("the pasword must be identical to the confirm pasword");
             else
                et3.setText("the pasword must be at list 8 characters long");

                  if (valid)
                  {
                      et3.setText("grate!");

                      SharedPreferences sharedPref = this.getSharedPreferences("userData", Context.MODE_PRIVATE);
                      SharedPreferences.Editor editor = sharedPref.edit();
                      editor.putString("userName",etName.getText().toString());
                      editor.putString("password", et2.getText().toString());
                      editor.apply();
                      Intent go = new Intent(this,logIn.class);
                      startActivity(go);

                  }
                    }

        }
    }

