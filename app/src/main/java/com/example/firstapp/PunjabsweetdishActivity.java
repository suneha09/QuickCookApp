package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PunjabsweetdishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabsweetdish);

        // Finding CardViews by ID
        CardView jalebi = findViewById(R.id.card_jalebi);
        CardView gulabjamun = findViewById(R.id.card_gulabjamun);
        CardView ladoo = findViewById(R.id.card_ladoo);
        CardView pinni = findViewById(R.id.card_pinni);
        CardView kheer = findViewById(R.id.card_kheer);
        CardView aatekahalwa = findViewById(R.id.card_aatekahalwa);
        CardView barfi = findViewById(R.id.card_barfi);


        // Setting OnClickListeners
        jalebi.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, jalebiActivity.class)));
        gulabjamun.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, gulabjamunActivity.class)));
        ladoo.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, ladooActivity.class)));
        pinni.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, pinniActivity.class)));
        kheer.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, kheerActivity.class)));
        aatekahalwa.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, aatekahalwaActivity.class)));
        barfi.setOnClickListener(view -> startActivity(new Intent(PunjabsweetdishActivity.this, barfiActivity.class)));
    }
}