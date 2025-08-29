package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class amla_juiceActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amla_juice); // Ensure your XML filename matches

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set values
        recipeTitle.setText("AMLA JUICE");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 4-5 fresh amla (Indian gooseberry)\n" +
                "- 1 tablespoon honey (optional)\n" +
                "- 1/2 teaspoon black salt\n" +
                "- 1/4 teaspoon ginger juice\n" +
                "- 1 cup water\n" +
                "- Mint leaves for garnish");

        recipeInstructions.setText("Instructions:\n" +
                "1. Wash and chop amla into small pieces, remove seeds.\n" +
                "2. Blend amla with water until smooth.\n" +
                "3. Strain the juice using a fine sieve or muslin cloth.\n" +
                "4. Add black salt, ginger juice, and honey. Mix well.\n" +
                "5. Serve chilled, garnished with mint leaves.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- High in Vitamin C and antioxidants\n" +
                "- Boosts immunity and metabolism\n" +
                "- Good for skin and digestion\n" +
                "- Acts as a detoxifier");

        recipeImage.setImageResource(R.drawable.amla_juice); // Make sure this image exists in res/drawable
    }
}
