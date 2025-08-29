package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class JammusweetdishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jammusweetdish);

        // Finding CardViews by ID
        CardView kesarpistakulfi = findViewById(R.id.card_kesarpistakulfi);
        CardView kahwa = findViewById(R.id.card_kahwa);
        CardView bakarkhani = findViewById(R.id.card_bakarkhani);
        CardView phirni = findViewById(R.id.card_phirni);
        CardView kashmirizardapulao = findViewById(R.id.card_kashmirizardapulao);
        CardView sundpanjiri = findViewById(R.id.card_sundpanjiri);
        CardView sheermal = findViewById(R.id.card_sheermal);


        // Setting OnClickListeners
        kesarpistakulfi.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, kesarpistakulfiActivity.class)));
        kahwa.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, kahwaActivity.class)));
        bakarkhani.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, bakarkhaniActivity.class)));
        phirni.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, phirniActivity.class)));
        kashmirizardapulao.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, kashmirizardapulaoActivity.class)));
        sundpanjiri.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, sundpanjiriActivity.class)));
        sheermal.setOnClickListener(view -> startActivity(new Intent(JammusweetdishActivity.this, sheermalActivity.class)));
    }
}