package com.example.bloodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etName, etEmail, etPhone, etBlood, etPassword;
    Button btnRegisterNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etBlood = findViewById(R.id.etBlood);
        etPassword = findViewById(R.id.etPassword);
        btnRegisterNow = findViewById(R.id.btnRegisterNow);

        btnRegisterNow.setOnClickListener(v -> {

            // Show toast message
            Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show();

            // Go to Dashboard
            Intent intent = new Intent(RegisterActivity.this, DashboardActivity.class);
            startActivity(intent);
        });
    }
}
