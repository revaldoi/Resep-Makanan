package com.example.uts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

    Button tombol;
    Button tomboldua;
    Button tomboltiga;

        tombol = (Button) findViewById(R.id.makanan_button);
        tomboldua = (Button) findViewById(R.id.makanan_dua_button);
        tomboltiga = (Button) findViewById(R.id.makanan_tiga_button);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makanan = new Intent(HomeActivity.this, MakananActivity.class);
                startActivity(makanan);
            }
        });

        tomboldua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makanan2 = new Intent(HomeActivity.this, MakananDuaActivity.class);
                startActivity(makanan2);
            }
        });

        tomboltiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makanan3 = new Intent(HomeActivity.this, MakananTigaActivity.class);
                startActivity(makanan3);
            }
        });
    }
}