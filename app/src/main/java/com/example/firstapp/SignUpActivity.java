package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText nameInput, emailInput, passwordInput;
    private Button signUpButton;
    private TextView alreadyHaveAccountLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up); // Make sure the correct layout is set

        // Initialize UI elements
        nameInput = findViewById(R.id.et_name);
        emailInput = findViewById(R.id.et_email);
        passwordInput = findViewById(R.id.et_password);
        signUpButton = findViewById(R.id.btn_sign_up);
        alreadyHaveAccountLink = findViewById(R.id.tv_already_have_account);

        // Handle the sign-up button click event
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    // Simulate successful sign-up (You would add real sign-up logic here, like storing in a database)
                    Toast.makeText(SignUpActivity.this, "Account created successfully!", Toast.LENGTH_SHORT).show();

                    // After successful sign-up, navigate to LoginActivity
                    Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
                    startActivity(intent);
                    finish(); // Close SignUpActivity so the user can't go back to it
                }
            }
        }); // <- Closing brace added here
    }
}

