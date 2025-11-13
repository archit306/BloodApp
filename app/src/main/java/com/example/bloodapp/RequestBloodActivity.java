package com.example.bloodapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RequestBloodActivity extends AppCompatActivity {

    EditText etPatientName, etBloodGroup, etUnits, etLocation, etReason, etContact;
    Button btnSubmitRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_blood);

        etPatientName = findViewById(R.id.etPatientName);
        etBloodGroup = findViewById(R.id.etBloodGroup);
        etUnits = findViewById(R.id.etUnits);
        etLocation = findViewById(R.id.etLocation);
        etReason = findViewById(R.id.etReason);
        etContact = findViewById(R.id.etContact);
        btnSubmitRequest = findViewById(R.id.btnSubmitRequest);

        btnSubmitRequest.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Blood Request Submitted!",
                    Toast.LENGTH_SHORT).show();
        });
    }
}
