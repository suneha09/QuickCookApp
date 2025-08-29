package com.example.firstapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LogInActivity extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private Button loginButton;
    private TextView recoverPassword, signUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);  // Make sure the correct layout is set

        // Initialize UI elements
//        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);
        recoverPassword = findViewById(R.id.recoverPassword);
        signUpLink = findViewById(R.id.signUpLink);

        // Handle the login button click event
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simply show a Toast and navigate to the HomeActivity
                Toast.makeText(LogInActivity.this, "Login button clicked", Toast.LENGTH_SHORT).show();

                // Navigate to HomeActivity directly without checking the credentials
                Intent intent = new Intent(LogInActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Close LogInActivity so the user can't go back to it
            }
        });

        // Handle forgot password link click
        recoverPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to ForgotPasswordActivity
                Intent intent = new Intent(LogInActivity.this, ForgotActivity.class);
                startActivity(intent);
            }
        });

        // Handle sign-up link click
        signUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to SignUpActivity
                Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}