package com.example.cafehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin,btnregister;
    TextView textskip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnlogin=findViewById(R.id.btnlogin);
        btnregister=findViewById(R.id.btnregister);
        textskip=findViewById(R.id.textskip);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Moving to Login Activity", Toast.LENGTH_SHORT).show();
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,signup.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Moving to register page", Toast.LENGTH_SHORT).show();
            }
        });

        textskip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Currently,Out of Order ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}