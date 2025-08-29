package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PunjabdrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabdrinks);

        // Finding CardViews by ID
        CardView lassi = findViewById(R.id.card_lassi);
        CardView chaach = findViewById(R.id.card_chaach);
        CardView papayajuice = findViewById(R.id.card_papaya_juice);
        CardView badammilk = findViewById(R.id.card_badam_milk);
        CardView kesarpistamilk = findViewById(R.id.card_kesar_pista_milk);
        CardView jaljeera = findViewById(R.id.card_jal_jeera);



        // Setting OnClickListeners
        lassi.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this, lassiActivity.class)));
        chaach.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this, chaachActivity.class)));
        papayajuice.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this,papaya_juiceActivity.class)));
        badammilk.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this, badam_milkActivity.class)));
        kesarpistamilk.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this, kesar_pista_milkActivity.class)));
        jaljeera.setOnClickListener(view -> startActivity(new Intent(PunjabdrinksActivity.this, jal_jeeraActivity.class)));

    }
}