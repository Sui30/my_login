package com.example.loginappl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText username, password;
    private String correct_username = "admin";
    private String correct_password = "admin";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.inputusername);
        password=findViewById(R.id.inputpassword);
        loginButton=findViewById(R.id.loginbtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(username.getText().toString()) && TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this, "FAILED LOGIN!", Toast.LENGTH_SHORT).show();
                } else if (username.getText().toString().equals(correct_username)){
                    if (password.getText().toString().equals(correct_password)){
                        Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, myhomepagel.class));
                    }else {
                        Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                    }

                } else{
                    Toast.makeText(MainActivity.this, "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}