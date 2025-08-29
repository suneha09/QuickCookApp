package com.example.firstapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;
    private Handler sliderHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Button initialization
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);

        // Section buttons
        ImageButton fastFoodSection = findViewById(R.id.fastFoodSection);
        ImageButton sweetDishesSection = findViewById(R.id.sweetDishesSection);
        ImageButton drinksSection = findViewById(R.id.drinksSection);

        // Image slider setup
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.indicator);

        List<Integer> images = Arrays.asList(
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image31,
                R.drawable.image4
        );

        ImageSliderAdapter adapter = new ImageSliderAdapter(this, images);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {}).attach();

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 3000);
            }
        });

        // State Buttons
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, PunjabActivity.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HimachalActivity.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HaryanaActivity.class);
            startActivity(intent);
        });

        button4.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, JammuActivity.class);
            startActivity(intent);
        });

        button5.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, UkActivity.class);
            startActivity(intent);
        });

        // Food Section Buttons
        fastFoodSection.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, FFastFoodActivity.class);
            startActivity(intent);
        });

        sweetDishesSection.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, FSweetDishesActivity.class);
            startActivity(intent);
        });

        drinksSection.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, FDrinksActivity.class);
            startActivity(intent);
        });

        // 🔁 Home and Profile Navigation
        ImageButton homeButton = findViewById(R.id.homeButton);
        ImageButton profileButton = findViewById(R.id.profileButton);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        profileButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }

    private final Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager.setCurrentItem((viewPager.getCurrentItem() + 1) % 4);
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sliderHandler.removeCallbacks(sliderRunnable);
    }
}