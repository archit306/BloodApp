package com.example.bloodapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

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

        // Request Blood button
        btnRequestBlood.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, RequestBloodActivity.class))
        );

        // Donate Blood button (Will add later)
        btnDonateBlood.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, DonateBloodActivity.class))
        );

        // My Requests button (Will add later)
        btnMyRequests.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, MyRequestsActivity.class))
        );

        // Profile button (Will add later)
        btnProfile.setOnClickListener(v ->
                startActivity(new Intent(DashboardActivity.this, ProfileActivity.class))
        );

        // Logout button
        btnLogout.setOnClickListener(v -> finish());
    }
}
