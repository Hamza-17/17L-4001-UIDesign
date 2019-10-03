package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in);
    }

    public void btn_signup(View view) {

        startActivity(new Intent(getApplicationContext(),SignUp.class));

    }

    public void btn_forgotpassword(View view) {


        startActivity(new Intent(getApplicationContext(),ForgotPassword.class));

    }

    public void btn_home(View view) {


        startActivity(new Intent(getApplicationContext(),MainActivity.class));


    }
}
