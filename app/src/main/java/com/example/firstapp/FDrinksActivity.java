package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FDrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fdrinks);

        // Finding CardViews by ID
        CardView lassi = findViewById(R.id.card_lassi);
        CardView chaach = findViewById(R.id.card_chaach);
        CardView kachchilassi = findViewById(R.id.card_kachchi_lassi);
        CardView thandai = findViewById(R.id.card_thandai);
        CardView noonchai = findViewById(R.id.card_noon_chai);
        CardView badammilk = findViewById(R.id.card_badam_milk);
        CardView kesarmilk = findViewById(R.id.card_kesar_pista_milk);
        CardView buranshjuice = findViewById(R.id.card_buransh_juice);


        // Setting OnClickListeners
        lassi.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, lassiActivity.class)));
        chaach.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, chaachActivity.class)));
        kachchilassi.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, kachchilassiActivity.class)));
        thandai.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, thandaiActivity.class)));
        noonchai.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, noonchaiActivity.class)));
        badammilk.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, badam_milkActivity.class)));
        kesarmilk.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, kesar_milkActivity.class)));
        buranshjuice.setOnClickListener(view -> startActivity(new Intent(FDrinksActivity.this, buransh_juiceActivity.class)));

    }
}