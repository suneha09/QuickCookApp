package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HimachalsweetdishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachalsweetdish);

        // Finding CardViews by ID
        CardView siddu = findViewById(R.id.card_siddu);
        CardView akhrotihalwa = findViewById(R.id.card_akhrotihalwa);
        CardView babru = findViewById(R.id.card_babru);
        CardView gulgula = findViewById(R.id.card_gulgula);
        CardView boondikameetha = findViewById(R.id.card_boondikameetha);
        CardView patande = findViewById(R.id.card_patande);
        CardView sheera = findViewById(R.id.card_sheera);


        // Setting OnClickListeners
        siddu.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, sidduActivity.class)));
        akhrotihalwa.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, akhrotihalwaActivity.class)));
        babru.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, babruActivity.class)));
        gulgula.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, gulgulaActivity.class)));
        boondikameetha.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, boondikameethaActivity.class)));
        patande.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, patandeActivity.class)));
        sheera.setOnClickListener(view -> startActivity(new Intent(HimachalsweetdishActivity.this, sheeraActivity.class)));
    }
}