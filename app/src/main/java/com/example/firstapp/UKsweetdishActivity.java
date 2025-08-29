package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UKsweetdishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uksweetdish);

        // Finding CardViews by ID
        CardView balmithai = findViewById(R.id.card_balmithai);
        CardView singori = findViewById(R.id.card_singori);
        CardView jhangorekikheer = findViewById(R.id.card_jhangorekikheer);
        CardView gulgula = findViewById(R.id.card_gulgula);
        CardView roat = findViewById(R.id.card_roat);
        CardView gujiya = findViewById(R.id.card_gujiya);
        CardView arsa = findViewById(R.id.card_arsa);


        // Setting OnClickListeners
        balmithai.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, balmithaiActivity.class)));
        singori.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, singoriActivity.class)));
        jhangorekikheer.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this,jhangorekikheerActivity.class)));
        gulgula.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, gulgulaActivity.class)));
        roat.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, roatActivity.class)));
        gujiya.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, gujiyaActivity.class)));
        arsa.setOnClickListener(view -> startActivity(new Intent(UKsweetdishActivity.this, arsaActivity.class)));
    }
}