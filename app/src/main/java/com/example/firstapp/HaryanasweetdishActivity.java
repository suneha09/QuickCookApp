package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HaryanasweetdishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryanasweetdish);

        // Finding CardViews by ID
        CardView alsikipinni = findViewById(R.id.card_alsikipinni);
        CardView ghevar = findViewById(R.id.card_ghevar);
        CardView balushahi = findViewById(R.id.card_balushahi);
        CardView gulabjamun = findViewById(R.id.card_gulabjamun);
        CardView malpua = findViewById(R.id.card_malpua);
        CardView meethechawal = findViewById(R.id.card_meethechawal);
        CardView besankeladoo = findViewById(R.id.card_besankeladoo);


        // Setting OnClickListeners
        alsikipinni.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, alsikipinniActivity.class)));
        ghevar.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, ghevarActivity.class)));
        balushahi.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, balushahiActivity.class)));
        gulabjamun.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this,gulabjamunActivity.class)));
        malpua.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, malpuaActivity.class)));
        meethechawal.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, meethechawalActivity.class)));
        besankeladoo.setOnClickListener(view -> startActivity(new Intent(HaryanasweetdishActivity.this, besankeladooActivity.class)));

    }
}