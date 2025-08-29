package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bael_sharbatActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bael_sharbat); // Make sure this XML filename is correct

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set values
        recipeTitle.setText("BAEL SHARBAT");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 ripe bael fruit\n" +
                "- 2-3 tablespoons sugar or jaggery (adjust to taste)\n" +
                "- 2 cups chilled water\n" +
                "- A pinch of black salt (optional)\n" +
                "- A few mint leaves (for garnish)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Break the bael fruit and scoop out the pulp using a spoon.\n" +
                "2. Soak the pulp in water for 10–15 minutes.\n" +
                "3. Mash it well and strain using a sieve.\n" +
                "4. Add sugar/jaggery and black salt. Stir until dissolved.\n" +
                "5. Add more water if needed. Serve chilled with mint leaves on top.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Excellent for digestion\n" +
                "- Rich in fiber and vitamin C\n" +
                "- Natural coolant and detox drink\n" +
                "- Great for stomach-related ailments");

        recipeImage.setImageResource(R.drawable.bael_sharbat); // Ensure this image is in your drawable folder
    }
}
