package com.example.brahmantyo.ratih_1202150244_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText aMenu,ajumlahpesanan;
    Button abutton1, abutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aMenu = findViewById(R.id.editText1);
        ajumlahpesanan = findViewById(R.id.editText2);
        abutton1 = findViewById(R.id.button1);
        abutton2 = findViewById(R.id.button2);

        abutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( MainActivity.this,Main2Activity.class);
        pindah.putExtra("tMakan", "Eatbus");
        pindah.putExtra("menu", aMenu.getText().toString());
        pindah.putExtra("jumlahpesanan", ajumlahpesanan.getText().toString());
        pindah.putExtra("harga", "50000");
        startActivity(pindah);
            }
        });

        abutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent( MainActivity.this,Main2Activity.class);
                pindah.putExtra("tMakan", " Abnormal");
                pindah.putExtra("menu", aMenu.getText().toString());
                pindah.putExtra("jumlahpesanan", ajumlahpesanan.getText().toString());
                pindah.putExtra("harga", "30000");
                startActivity(pindah);
            }
            });

    }
}
