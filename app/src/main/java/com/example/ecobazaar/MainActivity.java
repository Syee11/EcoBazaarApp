package com.example.ecobazaar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sellerLoginButton = findViewById(R.id.buttonSellerLogin);
        Button buyerLoginButton = findViewById(R.id.buttonBuyerLogin);

        sellerLoginButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SellerActivity.class);
            startActivity(intent);
        });

        buyerLoginButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BuyerActivity.class);
            startActivity(intent);
        });
    }
}