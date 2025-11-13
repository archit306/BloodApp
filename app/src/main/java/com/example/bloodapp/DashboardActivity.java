package com.example.bloodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    Button btnRequestBlood, btnDonateBlood, btnMyRequests, btnProfile, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnRequestBlood = findViewById(R.id.btnRequestBlood);
        btnDonateBlood = findViewById(R.id.btnDonateBlood);
        btnMyRequests = findViewById(R.id.btnMyRequests);
        btnProfile = findViewById(R.id.btnProfile);
        btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(v ->
                finish() // return to previous screen
        );
    }
}
