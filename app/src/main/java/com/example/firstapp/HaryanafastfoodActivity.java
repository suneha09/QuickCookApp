package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HaryanafastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryanafastfood);

        // Finding CardViews by ID
        CardView choleBhature = findViewById(R.id.card_chole_bhature);
        CardView rajma_chawal = findViewById(R.id.card_rajma_chawal);
        CardView paranthas = findViewById(R.id.card_paranthas);
        CardView pakoras = findViewById(R.id.card_pakoras);
        CardView golGappe = findViewById(R.id.card_gol_gappe);
        CardView samosa = findViewById(R.id.card_samosa);


        // Setting OnClickListeners
        choleBhature.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this, chole_bhatureActivity.class)));
        rajma_chawal.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this, rajma_chawalActivity.class)));
        paranthas.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this, paranthasActivity.class)));
        pakoras.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this,pakorasActivity.class)));
        samosa.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this, samosaActivity.class)));
        golGappe.setOnClickListener(view -> startActivity(new Intent(HaryanafastfoodActivity.this, gol_gappeActivity.class)));
    }
}