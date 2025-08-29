package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HimachaldrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachaldrinks);

        // Finding CardViews by ID
        CardView buranshjuice = findViewById(R.id.card_buransh_juice);
        CardView chaang = findViewById(R.id.card_chaang);
        CardView seabuckthornjuice = findViewById(R.id.crad_seabuckthornjuice);
        CardView lugdi = findViewById(R.id.card_lugdi);
        CardView lassi = findViewById(R.id.card_lassi);
        CardView kesarpistamilk = findViewById(R.id.card_kesar_pista_milk);



        // Setting OnClickListeners
        buranshjuice.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this, buransh_juiceActivity.class)));
        chaang.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this, chaangActivity.class)));
        seabuckthornjuice.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this,seabuck_thornActivity.class)));
        lugdi.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this, lugdiActivity.class)));
        lassi.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this, lassiActivity.class)));
        kesarpistamilk.setOnClickListener(view -> startActivity(new Intent(HimachaldrinksActivity.this, kesar_pista_milkActivity.class)));

    }
}