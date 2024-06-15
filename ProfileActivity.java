package com.example.myshuttleapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText etName, etAddress;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        etName = findViewById(R.id.etName);
        etAddress = findViewById(R.id.etAddress);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(view -> {
            String name = etName.getText().toString();
            String address = etAddress.getText().toString();
            // Implementasikan logika penyimpanan profil
        });
    }
}
