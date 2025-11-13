package com.example.bloodapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLoginNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLoginNow = findViewById(R.id.btnLoginNow);

        btnLoginNow.setOnClickListener(v -> {
            String email = etEmail.getText().toString();
            Toast.makeText(this, "Login: " + email, Toast.LENGTH_SHORT).show();
        });
    }
}
