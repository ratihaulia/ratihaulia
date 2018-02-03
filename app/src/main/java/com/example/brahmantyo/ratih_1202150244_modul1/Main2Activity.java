package com.example.brahmantyo.ratih_1202150244_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView aMakanMalam;
    TextView aMenu;
    TextView ajumlahpesanan;
    TextView aharga;
    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        aMakanMalam = findViewById(R.id.tempatMakan);
        aMenu = findViewById(R.id.nasiuduk);
        ajumlahpesanan = findViewById(R.id.jumlahpesanan);
        aharga = findViewById(R.id.bilangan);

        Intent a = getIntent();

        String tempatmakan = a.getStringExtra("tMakan");
        String menu = a.getStringExtra("menu");
        String jumlahpesanan = a.getStringExtra("jumlahpesanan");
        String harga = a.getStringExtra("harga");

        int hargakeseluruhan = Integer.valueOf(harga) * Integer.valueOf(jumlahpesanan);

        aMakanMalam.setText(tempatmakan);
        aMenu.setText(menu);
        ajumlahpesanan.setText(jumlahpesanan);
        aharga.setText(String.valueOf(hargakeseluruhan));

        if (hargakeseluruhan <= uang) {
            Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText( this, "jangan makan disini, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
        }


    }
}
