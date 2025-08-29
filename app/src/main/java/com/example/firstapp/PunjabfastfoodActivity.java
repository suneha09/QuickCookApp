package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PunjabfastfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabfastfood);

        // Finding CardViews by ID
        CardView amritsariNaan = findViewById(R.id.card_amritsari_naan);
        CardView choleBhature = findViewById(R.id.card_chole_bhature);
        CardView pavBhaji = findViewById(R.id.card_pav_bhaji);
        CardView samosa = findViewById(R.id.card_samosa);
        CardView butterChicken = findViewById(R.id.card_butter_chicken);

        // Setting OnClickListeners
        amritsariNaan.setOnClickListener(view -> startActivity(new Intent(PunjabfastfoodActivity.this, Amritsari_naanActivity.class)));
        choleBhature.setOnClickListener(view -> startActivity(new Intent(PunjabfastfoodActivity.this, chole_bhatureActivity.class)));
        pavBhaji.setOnClickListener(view -> startActivity(new Intent(PunjabfastfoodActivity.this, pav_bhajiActivity.class)));
        samosa.setOnClickListener(view -> startActivity(new Intent(PunjabfastfoodActivity.this, samosaActivity.class)));
        butterChicken.setOnClickListener(view -> startActivity(new Intent(PunjabfastfoodActivity.this, butter_chickenActivity.class)));
    }
}