package com.nsh.r3s_apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int add1, add2, add3, add4, add5, add6, add7, add8, add9, add10 = 0;
    int harga = 0;

    ImageButton kurang1, kurang2, kurang3, kurang4, kurang5, kurang6, kurang7, kurang8, kurang9, kurang10,
            tambah1, tambah2, tambah3, tambah4, tambah5, tambah6, tambah7, tambah8, tambah9, tambah10, btnCheckOut;

    TextView tvMenu1, tvMenu2, tvMenu3, tvMenu4, tvMenu5, tvMenu6,
            tvMenu7, tvMenu8, tvMenu9, tvMenu10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button Kurang
        kurang1 = findViewById(R.id.kurang1);
        kurang1.setOnClickListener(this);
        kurang2 = findViewById(R.id.kurang2);
        kurang2.setOnClickListener(this);
        kurang3 = findViewById(R.id.kurang3);
        kurang3.setOnClickListener(this);
        kurang4 = findViewById(R.id.kurang4);
        kurang4.setOnClickListener(this);
        kurang5 = findViewById(R.id.kurang5);
        kurang5.setOnClickListener(this);
        kurang6 = findViewById(R.id.kurang6);
        kurang6.setOnClickListener(this);
        kurang7 = findViewById(R.id.kurang7);
        kurang7.setOnClickListener(this);
        kurang8 = findViewById(R.id.kurang8);
        kurang8.setOnClickListener(this);
        kurang9 = findViewById(R.id.kurang9);
        kurang9.setOnClickListener(this);
        kurang10 = findViewById(R.id.kurang10);
        kurang10.setOnClickListener(this);

        // Button Tambah
        tambah1 = findViewById(R.id.tambah1);
        tambah1.setOnClickListener(this);
        tambah2 = findViewById(R.id.tambah2);
        tambah2.setOnClickListener(this);
        tambah3 = findViewById(R.id.tambah3);
        tambah3.setOnClickListener(this);
        tambah4 = findViewById(R.id.tambah4);
        tambah4.setOnClickListener(this);
        tambah5 = findViewById(R.id.tambah5);
        tambah5.setOnClickListener(this);
        tambah6 = findViewById(R.id.tambah6);
        tambah6.setOnClickListener(this);
        tambah7 = findViewById(R.id.tambah7);
        tambah7.setOnClickListener(this);
        tambah8 = findViewById(R.id.tambah8);
        tambah8.setOnClickListener(this);
        tambah9 = findViewById(R.id.tambah9);
        tambah9.setOnClickListener(this);
        tambah10 = findViewById(R.id.tambah10);
        tambah10.setOnClickListener(this);

        //Button CheckOut
        btnCheckOut = findViewById(R.id.btnCheckOut);
        btnCheckOut.setOnClickListener(this);

        //TextView Menu
        tvMenu1 = findViewById(R.id.jumlah_menu1);
        tvMenu2 = findViewById(R.id.jumlah2);
        tvMenu3 = findViewById(R.id.jumlah_menu3);
        tvMenu4 = findViewById(R.id.jumlah4);
        tvMenu5 = findViewById(R.id.jumlah_menu5);
        tvMenu6 = findViewById(R.id.jumlah6);
        tvMenu7 = findViewById(R.id.jumlah_menu7);
        tvMenu8 = findViewById(R.id.jumlah8);
        tvMenu9 = findViewById(R.id.jumlah_menu9);
        tvMenu10 = findViewById(R.id.jumlah10);
    }
        @Override
        public void onClick (View view){
            switch (view.getId()) {
                case R.id.tambah1:
                    add1++;
                    harga += 41000;
                    String text = "" + add1;
                    tvMenu1.setText(text);
                    break;

                case R.id.kurang1:
                    if (add1 > 0) {
                        add1--;
                        harga -= 41000;
                        text = "" + add1;
                        tvMenu1.setText(text);
                    } else {
                        add1 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah2:
                    add2++;
                    harga += 35000;
                    text = "" + add2;
                    tvMenu2.setText(text);
                    break;

                case R.id.kurang2:
                    if (add2 > 0) {
                        add2--;
                        harga -= 35000;
                        text = "" + add2;
                        tvMenu2.setText(text);
                    } else {
                        add2 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah3:
                    add3++;
                    harga += 20000;
                    text = "" + add3;
                    tvMenu3.setText(text);
                    break;

                case R.id.kurang3:
                    if (add3 > 0) {
                        add3--;
                        harga -= 20000;
                        text = "" + add3;
                        tvMenu3.setText(text);
                    } else {
                        add3 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah4:
                    add4++;
                    harga += 60000;
                    text = "" + add4;
                    tvMenu4.setText(text);
                    break;

                case R.id.kurang4:
                    if (add4 > 0) {
                        add4--;
                        harga -= 60000;
                        text = "" + add4;
                        tvMenu4.setText(text);
                    } else {
                        add4 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah5:
                    add5++;
                    harga += 40500;
                    text = "" + add5;
                    tvMenu5.setText(text);
                    break;

                case R.id.kurang5:
                    if (add5 > 0) {
                        add5--;
                        harga -= 40500;
                        text = "" + add5;
                        tvMenu5.setText(text);
                    } else {
                        add5 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah6:
                    add6++;
                    harga += 32000;
                    text = "" + add6;
                    tvMenu6.setText(text);
                    break;

                case R.id.kurang6:
                    if (add6 > 0) {
                        add6--;
                        harga -= 32000;
                        text = "" + add6;
                        tvMenu6.setText(text);
                    } else {
                        add6 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah7:
                    add7++;
                    harga += 5000;
                    text = "" + add7;
                    tvMenu7.setText(text);
                    break;

                case R.id.kurang7:
                    if (add7 > 0) {
                        add7--;
                        harga -= 5000;
                        text = "" + add7;
                        tvMenu4.setText(text);
                    } else {
                        add7 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah8:
                    add8++;
                    harga += 9000;
                    text = "" + add8;
                    tvMenu8.setText(text);
                    break;

                case R.id.kurang8:
                    if (add8 > 0) {
                        add8--;
                        harga -= 9000;
                        text = "" + add8;
                        tvMenu8.setText(text);
                    } else {
                        add8 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah9:
                    add9++;
                    harga += 8000;
                    text = "" + add9;
                    tvMenu9.setText(text);
                    break;

                case R.id.kurang9:
                    if (add9 > 0) {
                        add9--;
                        harga -= 8000;
                        text = "" + add9;
                        tvMenu9.setText(text);
                    } else {
                        add9 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.tambah10:
                    add10++;
                    harga += 6000;
                    text = "" + add10;
                    tvMenu10.setText(text);
                    break;

                case R.id.kurang10:
                    if (add10 > 0) {
                        add10--;
                        harga -= 6000;
                        text = "" + add10;
                        tvMenu10.setText(text);
                    } else {
                        add10 = 0;
                        Toast.makeText(this, "Pesanan Tidak Boleh Dibawah 0", Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.btnCheckOut:
                    //int totalAdd = add1 + add2;
                    int price = harga;
                    Intent intent = new Intent(this, TransactionActivity.class);
                    intent.putExtra("Price", price);
                    startActivity(intent);
            }
        }
    }
