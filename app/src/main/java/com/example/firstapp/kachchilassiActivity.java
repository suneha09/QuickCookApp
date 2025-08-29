package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kachchilassiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kachchilassi); // This should match the XML file name

        // Link XML views with Java code
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content for Kachchi Lassi
        recipeTitle.setText("KACHCHI LASSI");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n- 1 cup yogurt\n- 2 cups cold water\n- 1/2 tsp cumin powder\n- A pinch of black salt\n- Fresh mint leaves (optional)");

        recipeInstructions.setText("Instructions:\n1. In a bowl, whisk the yogurt until smooth.\n2. Add cold water and mix well.\n3. Add cumin powder and black salt, stir to combine.\n4. Serve chilled. Garnish with mint leaves if desired.");

        recipeNutrition.setText("Nutritional Information:\n- Calories: ~90\n- Protein: 3g\n- Fat: 3g\n- Carbs: 8g");

        recipeImage.setImageResource(R.drawable.kachchilassi); // Make sure the image is in the drawable folder
    }
}
