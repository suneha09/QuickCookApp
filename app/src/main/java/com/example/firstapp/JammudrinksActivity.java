package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class JammudrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammudrinks);

        // Finding CardViews by ID
        CardView kesarpistamilk = findViewById(R.id.card_kesar_pista_milk);
        CardView babribeoul = findViewById(R.id.card_babribeoul);
        CardView noonchai = findViewById(R.id.card_noon_chai);
        CardView thandai = findViewById(R.id.card_thandai);
        CardView sharbatebazoori = findViewById(R.id.card_sharbatebazoori);
        CardView kahwa = findViewById(R.id.card_kahwa);



        // Setting OnClickListeners
        kesarpistamilk.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this, kesar_pista_milkActivity.class)));
        babribeoul.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this, babri_beoulActivity.class)));
        noonchai.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this,noonchaiActivity.class)));
        thandai.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this, thandaiActivity.class)));
        sharbatebazoori.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this, sharbatebazooriActivity.class)));
        kahwa.setOnClickListener(view -> startActivity(new Intent(JammudrinksActivity.this, kahwaActivity.class)));

    }
}