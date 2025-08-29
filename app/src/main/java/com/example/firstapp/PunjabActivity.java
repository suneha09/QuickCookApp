package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PunjabActivity extends AppCompatActivity {

    private Button btnFatFood, btnSweetDishes, btnDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);

        // Initialize buttons
        btnFatFood = findViewById(R.id.btn_fast_food);
        btnSweetDishes = findViewById(R.id.btn_sweet_dishes);
        btnDrinks = findViewById(R.id.btn_drinks);

        // Set click listeners
        btnFatFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PunjabActivity.this, PunjabfastfoodActivity.class);
                startActivity(intent);
            }
        });

        btnSweetDishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PunjabActivity.this, PunjabsweetdishActivity.class);
                startActivity(intent);
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PunjabActivity.this, PunjabdrinksActivity.class);
                startActivity(intent);
            }
        });
    }
}



