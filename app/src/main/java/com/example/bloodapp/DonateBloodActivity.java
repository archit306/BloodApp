package com.example.bloodapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DonateBloodActivity extends AppCompatActivity {

    EditText etDonorName, etDonorBlood, etDonorPhone, etDonorAge;
    Button btnSubmitDonation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_blood);

        etDonorName = findViewById(R.id.etDonorName);
        etDonorBlood = findViewById(R.id.etDonorBlood);
        etDonorPhone = findViewById(R.id.etDonorPhone);
        etDonorAge = findViewById(R.id.etDonorAge);
        btnSubmitDonation = findViewById(R.id.btnSubmitDonation);

        btnSubmitDonation.setOnClickListener(v ->
                Toast.makeText(this, "Donor Registered!", Toast.LENGTH_SHORT).show()
        );
    }
}
