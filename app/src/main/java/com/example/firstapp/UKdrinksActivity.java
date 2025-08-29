package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UKdrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ukdrinks);

        // Finding CardViews by ID
        CardView buranshjuice = findViewById(R.id.card_buransh_juice);
        CardView baelsharbat = findViewById(R.id.card_bael_sharbat);
        CardView amlajuice = findViewById(R.id.card_amla_juice);
        CardView kaphaljuice = findViewById(R.id.card_kaphal_juice);
        CardView thandai = findViewById(R.id.card_thandai);
        CardView chaach = findViewById(R.id.card_chaach);



        // Setting OnClickListeners
        buranshjuice.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this, buransh_juiceActivity.class)));
        baelsharbat.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this, bael_sharbatActivity.class)));
        amlajuice.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this,amla_juiceActivity.class)));
        kaphaljuice.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this, kaphal_juiceActivity.class)));
        thandai.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this, thandaiActivity.class)));
        chaach.setOnClickListener(view -> startActivity(new Intent(UKdrinksActivity.this, chaachActivity.class)));

    }
}