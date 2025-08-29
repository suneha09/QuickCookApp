package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lassiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lassi);

        // Initialize UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set data (you can fetch from database or API)
        recipeTitle.setText("Lassi");
        recipeDetails.setText("Preparation Time: 10 minutes");
        recipeIngredients.setText("Ingredients:\n- 2 cups yogurt\n- 1/2 cup water\n- 4 tbsp sugar\n- 1/2 tsp cardamom powder\n- Ice cubes (optional)");
        recipeInstructions.setText("Instructions:\n1. Blend all ingredients together.\n2. Serve chilled with a garnish of mint leaves or saffron.");
        recipeNutrition.setText("Calories: 150 kcal per serving");
    }
}
