package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    EditText password;
    CheckBox showpassword;

    EditText password1;
    CheckBox showpassword1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        password=findViewById(R.id.password);
        showpassword=findViewById(R.id.showpassword);

        password1=findViewById(R.id.password);
        showpassword1=findViewById(R.id.showpassword);


showpassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(b){

password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

        }

        else {

            password.setTransformationMethod(PasswordTransformationMethod.getInstance());

        }

    }

}





);





    }

    public void btn_login(View view) {

        startActivity(new Intent(getApplicationContext(),LoginIn.class));



    }

    public void btn_home(View view) {




        startActivity(new Intent(getApplicationContext(),MainActivity.class));



    }
}
