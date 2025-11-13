package com.example.bloodapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(R.style.Theme_BloodApp); // Keep this

        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, LoginActivity.class)));

        btnRegister.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, RegisterActivity.class)));
    }
}
