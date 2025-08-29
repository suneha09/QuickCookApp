package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sharbatebazooriActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharbatebazoori); // Make sure this matches your XML file name

        // Bind views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set data (hardcoded for now, can be dynamic)
        recipeTitle.setText("Sharbat-e-Bazoori");
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: No cooking needed");
        recipeIngredients.setText("Ingredients\n- 2 tbsp Bazoori concentrate\n- 1 cup cold water\n- Ice cubes\n- Sugar (optional)");
        recipeInstructions.setText("Instructions\n1. Mix the Bazoori concentrate with cold water.\n2. Add sugar if desired.\n3. Stir well.\n4. Add ice cubes.\n5. Serve chilled.");
        recipeNutrition.setText("Nutritional Information\n- Calories: 80 per serving\n- Sugar: 12g\n- Vitamin C: 15% of daily value");

        // Optionally set image programmatically if needed
        recipeImage.setImageResource(R.drawable.sharbatebazoori);
    }
}
