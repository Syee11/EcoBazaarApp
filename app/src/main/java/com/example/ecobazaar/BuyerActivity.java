package com.example.ecobazaar;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BuyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer);

        Button browseItemsButton = findViewById(R.id.buttonBrowseItems);

        browseItemsButton.setOnClickListener(v -> {
        });
    }
}