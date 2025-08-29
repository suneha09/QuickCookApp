package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HimachalfastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachalfastfood);

        // Finding CardViews by ID
        CardView madra = findViewById(R.id.card_madra);
        CardView himachalidhaam = findViewById(R.id.card_himachali_dhaam);
        CardView tudkiyabhath = findViewById(R.id.card_tudkiya_bhath);
        CardView bhey = findViewById(R.id.card_bhey);
        CardView siddu = findViewById(R.id.card_siddu);
        CardView kullutrout = findViewById(R.id.card_kullu_trout);
        CardView babru = findViewById(R.id.card_babru);


        // Setting OnClickListeners
        madra.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, madraActivity.class)));
        himachalidhaam.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, himachali_dhaamActivity.class)));
        tudkiyabhath.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, tudkiya_bhathActivity.class)));
        bhey.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, bheyActivity.class)));
        siddu.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, sidduActivity.class)));
        kullutrout.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, kullu_troutActivity.class)));
        babru.setOnClickListener(view -> startActivity(new Intent(HimachalfastfoodActivity.this, babruActivity.class)));
    }
}