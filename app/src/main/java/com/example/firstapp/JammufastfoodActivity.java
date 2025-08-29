package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class JammufastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammufastfood);

        // Finding CardViews by ID
        CardView golgappe = findViewById(R.id.card_gol_gappe);
        CardView cholekulche = findViewById(R.id.card_chole_kulche);
        CardView panipuri = findViewById(R.id.card_pani_puri);
        CardView kachaluchaat = findViewById(R.id.card_kachalu_chaat);
        CardView kaladikulcha = findViewById(R.id.card_kaladi_kulcha);

        // Setting OnClickListeners
        golgappe.setOnClickListener(view -> startActivity(new Intent(JammufastfoodActivity.this, gol_gappeActivity.class)));
        cholekulche.setOnClickListener(view -> startActivity(new Intent(JammufastfoodActivity.this, chole_kulcheActivity.class)));
        panipuri.setOnClickListener(view -> startActivity(new Intent(JammufastfoodActivity.this, pani_puriActivity.class)));
        kachaluchaat.setOnClickListener(view -> startActivity(new Intent(JammufastfoodActivity.this, kachalu_chaatActivity.class)));
        kaladikulcha.setOnClickListener(view -> startActivity(new Intent(JammufastfoodActivity.this, kaladi_kulchaActivity.class)));
    }
}