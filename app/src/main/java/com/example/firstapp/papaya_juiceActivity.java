package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class papaya_juiceActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papaya_juice); // Match this to your XML filename

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set data
        recipeTitle.setText("PAPAYA JUICE");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 cup ripe papaya (chopped)\n" +
                "- 1/2 cup cold water or coconut water\n" +
                "- 1 tsp lemon juice\n" +
                "- 1 tbsp honey or sugar (optional)\n" +
                "- Ice cubes");

        recipeInstructions.setText("Instructions:\n" +
                "1. Add chopped papaya into a blender.\n" +
                "2. Add water or coconut water, lemon juice, and sweetener if needed.\n" +
                "3. Blend until smooth.\n" +
                "4. Strain if preferred for a smoother texture.\n" +
                "5. Serve chilled with ice.");

        recipeNutrition.setText("Nutritional Information (per glass):\n" +
                "- Calories: ~100\n" +
                "- Carbohydrates: 24g\n" +
                "- Fiber: 2g\n" +
                "- Vitamin C: 88% DV\n" +
                "- Potassium: High");

        // Set image
        recipeImage.setImageResource(R.drawable.papaya_juice); // Ensure the image is present in res/drawable
    }
}
