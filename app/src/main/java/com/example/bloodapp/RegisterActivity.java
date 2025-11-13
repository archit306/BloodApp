package com.example.bloodapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword, etPhone, etBloodGroup;
    Button btnRegisterNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etPhone = findViewById(R.id.etPhone);
        etBloodGroup = findViewById(R.id.etBloodGroup);
        btnRegisterNow = findViewById(R.id.btnRegisterNow);

        btnRegisterNow.setOnClickListener(v -> {
            String name = etName.getText().toString();
            Toast.makeText(this, "Registered: " + name, Toast.LENGTH_SHORT).show();
        });
    }
}
