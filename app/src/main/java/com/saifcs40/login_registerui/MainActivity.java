package com.saifcs40.login_registerui;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView hintUsername, hintPassword;
    EditText username, password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hintUsername = findViewById(R.id.hint_username);
        hintPassword = findViewById(R.id.hint_password);
        username = findViewById(R.id.edit_username);
        password = findViewById(R.id.edit_password);
        submit = findViewById(R.id.submit);

        //username
        username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hintUsername.setVisibility(View.VISIBLE);
                        }
                    },100);
                }else {
                    if (username.getText().length()>0){
                        hintUsername.setVisibility(View.VISIBLE);
                    }else {
                        hintUsername.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        //password
        password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            hintPassword.setVisibility(View.VISIBLE);
                        }
                    },100);
                }else{
                    if (password.getText().length()>0){
                        hintPassword.setVisibility(View.VISIBLE);
                    }else {
                        hintPassword.setVisibility(View.INVISIBLE);
                    }
                }
            }
        });

        //submit

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login Success!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
