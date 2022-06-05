package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btlogin=findViewById(R.id.btlogin);
        setTitle("Login");


        btlogin.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               Toast.makeText(Login.this, "logging in", Toast.LENGTH_SHORT).show();
           }
        });
    }
}