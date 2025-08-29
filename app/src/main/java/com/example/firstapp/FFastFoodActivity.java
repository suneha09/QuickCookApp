package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FFastFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ffast_food);

        // Finding CardViews by ID
        CardView choleBhature = findViewById(R.id.card_chole_bhature);
        CardView pavBhaji = findViewById(R.id.card_pav_bhaji);
        CardView samosa = findViewById(R.id.card_samosa);
        CardView golGappe = findViewById(R.id.card_gol_gappe);
        CardView choleKulche = findViewById(R.id.card_chole_kulche);
        CardView amritsariNaan = findViewById(R.id.card_amritsari_naan);
        CardView butterChicken = findViewById(R.id.card_butter_chicken);
        CardView paranthas = findViewById(R.id.card_paranthas);
        CardView pakoras = findViewById(R.id.card_pakoras);

        // Setting OnClickListeners
        choleBhature.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, chole_bhatureActivity.class)));
        pavBhaji.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, pav_bhajiActivity.class)));
        samosa.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, samosaActivity.class)));
        golGappe.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, gol_gappeActivity.class)));
        choleKulche.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, chole_kulcheActivity.class)));
        amritsariNaan.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, Amritsari_naanActivity.class)));
        butterChicken.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, butter_chickenActivity.class)));
        paranthas.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, paranthasActivity.class)));
        pakoras.setOnClickListener(view -> startActivity(new Intent(FFastFoodActivity.this, pakorasActivity.class)));
    }
}