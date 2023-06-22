package com.nsh.r3s_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class TransactionActivity extends AppCompatActivity {
    TextView tvPrice, tvPayment;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        tvPrice = findViewById(R.id.tvPrice);
        tvPayment = findViewById(R.id.tvTotalPayment);

        int price = getIntent().getIntExtra("Price", 0);
        String textPrice = "Price : " + price;
        int payment = price + 15000;
        String textPayment = "Total Payment : " + payment;
        tvPrice.setText(textPrice);
        tvPayment.setText(textPayment);

    }
}