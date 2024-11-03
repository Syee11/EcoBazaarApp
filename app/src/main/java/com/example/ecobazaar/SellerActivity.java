package com.example.ecobazaar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller);

        Button uploadItemButton = findViewById(R.id.buttonUploadItem);

        uploadItemButton.setOnClickListener(v -> {
        });
    }
}