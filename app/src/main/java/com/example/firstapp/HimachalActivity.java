package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HimachalActivity extends AppCompatActivity {

    private Button btnFastFood, btnSweetDishes, btnDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal);

        // Initialize buttons
        btnFastFood = findViewById(R.id.btn_fast_food);
        btnSweetDishes = findViewById(R.id.btn_sweet_dishes);
        btnDrinks = findViewById(R.id.btn_drinks);

        // Set click listeners
        btnFastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HimachalActivity.this, HimachalfastfoodActivity.class);
                startActivity(intent);
            }
        });

        btnSweetDishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HimachalActivity.this, HimachalsweetdishActivity.class);
                startActivity(intent);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HimachalActivity.this, HimachaldrinksActivity.class);
                startActivity(intent);
            }
        });
    }
}