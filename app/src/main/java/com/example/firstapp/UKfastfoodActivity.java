package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UKfastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukfastfood);

        // Finding CardViews by ID
        CardView kafuli = findViewById(R.id.card_kafuli);
        CardView bhangkichutney = findViewById(R.id.card_bhang_ki_chutney);
        CardView baadi = findViewById(R.id.card_baadi);
        CardView aloogutke = findViewById(R.id.card_aloogutke);
        CardView bhattchutney = findViewById(R.id.card_bhattchutney);
        CardView phaanu = findViewById(R.id.card_phaanu);
        CardView gulgula = findViewById(R.id.card_gulgula);

        // Setting OnClickListeners
        kafuli.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, kafuliActivity.class)));
        bhangkichutney.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, bhang_ki_chutneyActivity.class)));
        baadi.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, baadiActivity.class)));
        aloogutke.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, aloogutkeActivity.class)));
        bhattchutney.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, bhattchutneyActivity.class)));
        phaanu.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, phaanuActivity.class)));
        gulgula.setOnClickListener(view -> startActivity(new Intent(UKfastfoodActivity.this, gulguleActivity.class)));
    }
}