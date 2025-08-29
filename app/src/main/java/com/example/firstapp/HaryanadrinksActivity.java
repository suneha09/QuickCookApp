package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HaryanadrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryanadrinks);

        // Finding CardViews by ID
        CardView lassi = findViewById(R.id.card_lassi);
        CardView chaach = findViewById(R.id.card_chaach);
        CardView kachchilassi = findViewById(R.id.card_kachchi_lassi);
        CardView jaljeera = findViewById(R.id.card_jal_jeera);
        CardView kesarpistamilk = findViewById(R.id.card_kesar_pista_milk);
        CardView badammilk = findViewById(R.id.card_badam_milk);



        // Setting OnClickListeners
        lassi.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this, lassiActivity.class)));
        chaach.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this, chaachActivity.class)));
        kachchilassi.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this,kachchilassiActivity.class)));
        jaljeera.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this, jal_jeeraActivity.class)));
        kesarpistamilk.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this, kesar_pista_milkActivity.class)));
        badammilk.setOnClickListener(view -> startActivity(new Intent(HaryanadrinksActivity.this, badam_milkActivity.class)));

    }
}