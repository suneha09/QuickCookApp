package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is your splash screen layout XML

        // Splash screen delay (4 seconds)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // After the delay, navigate to the Login page
                Intent intent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(intent);
                finish(); // Close MainActivity to prevent returning to splash
            }
        }, 4000); // Delay in milliseconds (4 seconds)
    }
}