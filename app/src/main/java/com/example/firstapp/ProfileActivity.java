package com.example.firstapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.OpenableColumns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    EditText usernameEdit;
    Button changePicBtn, saveBtn, termsBtn, privacyBtn, rateBtn, shareBtn, aboutAppBtn;
    ImageView profileImage;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    Uri imageUri;

    private static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // UI Components
        usernameEdit = findViewById(R.id.usernameEdit);
        changePicBtn = findViewById(R.id.changePicBtn);
        saveBtn = findViewById(R.id.saveBtn);
        profileImage = findViewById(R.id.profileImage);
        termsBtn = findViewById(R.id.termsBtn);
        privacyBtn = findViewById(R.id.privacyBtn);
        rateBtn = findViewById(R.id.rateBtn);
        shareBtn = findViewById(R.id.shareBtn);
        aboutAppBtn = findViewById(R.id.aboutAppBtn);

        // SharedPreferences
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();

        // Load saved data
        usernameEdit.setText(prefs.getString("username", ""));
        String uriString = prefs.getString("profileImageUri", "");
        if (!uriString.isEmpty()) {
            imageUri = Uri.parse(uriString);
            profileImage.setImageURI(imageUri);
        }

        // Save button
        saveBtn.setOnClickListener(v -> {
            editor.putString("username", usernameEdit.getText().toString());
            if (imageUri != null) {
                editor.putString("profileImageUri", imageUri.toString());
            }
            editor.apply();
            Toast.makeText(this, "Profile Saved", Toast.LENGTH_SHORT).show();
        });

        // Change profile picture
        changePicBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType("image/*");
            startActivityForResult(intent, PICK_IMAGE_REQUEST);
        });

        // About this app
        aboutAppBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, about_appActivity.class));
        });

        // Terms & Conditions
        termsBtn.setOnClickListener(v -> startActivity(new Intent(this, termsActivity.class)));

        // Privacy Policy
        privacyBtn.setOnClickListener(v -> startActivity(new Intent(this, privacyActivity.class)));

        // Rate the app
        rateBtn.setOnClickListener(v -> {
            final String appPackageName = getPackageName();
            Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName));
            startActivity(rateIntent);
        });

        // Share the app
        shareBtn.setOnClickListener(v -> {
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Check out this awesome Cooking App: https://play.google.com/store/apps/details?id=" + getPackageName());
            startActivity(Intent.createChooser(sendIntent, "Share via"));
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();

            // Take persistable URI permission
            getContentResolver().takePersistableUriPermission(
                    imageUri,
                    Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION
            );

            profileImage.setImageURI(imageUri);
        }
    }
}