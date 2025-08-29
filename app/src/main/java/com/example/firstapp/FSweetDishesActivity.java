package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FSweetDishesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fsweet_dishes);

        // Finding CardViews by ID
        CardView balmithai = findViewById(R.id.card_balmithai);
        CardView aatekahalwa = findViewById(R.id.card_aatekahalwa);
        CardView kashmirizardapulao = findViewById(R.id.card_kashmirizardapulao);
        CardView siddu = findViewById(R.id.card_siddu);
        CardView ghevar = findViewById(R.id.card_ghevar);
        CardView kheer = findViewById(R.id.card_kheer);
        CardView alsikipinni = findViewById(R.id.card_alsikipinni);
        CardView gulgula = findViewById(R.id.card_gulgula);

        // Setting OnClickListeners
        balmithai.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, balmithaiActivity.class)));
        aatekahalwa.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, aatekahalwaActivity.class)));
        kashmirizardapulao.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, kashmirizardapulaoActivity.class)));
        siddu.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, sidduActivity.class)));
        ghevar.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, ghevarActivity.class)));
        kheer.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this,  kheerActivity.class)));
        alsikipinni.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, alsikipinniActivity.class)));
        gulgula.setOnClickListener(view -> startActivity(new Intent(FSweetDishesActivity.this, gulgulaActivity.class)));
    }
}