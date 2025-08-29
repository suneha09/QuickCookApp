package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kaladi_kulchaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaladi_kulcha); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Kaladi Kulcha - Jammu's Special Cheese Kulcha");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes\nServes: 2");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 kulchas (soft bread)\n" +
                "- 100g kaladi cheese (Jammu's traditional cheese)\n" +
                "- 1 tbsp butter/ghee\n" +
                "- 1/2 tsp black salt\n" +
                "- 1/2 tsp chaat masala\n" +
                "- 1/4 tsp black pepper\n" +
                "- 1 tbsp finely chopped onions\n" +
                "- 1 tbsp finely chopped tomatoes\n" +
                "- 1 tbsp green chutney (mint & coriander)\n" +
                "- 1 tbsp tamarind chutney\n" +
                "- Fresh coriander leaves for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare Kaladi Cheese*\n" +
                "1. Heat a non-stick pan on low-medium heat.\n" +
                "2. Add kaladi cheese and cook until golden brown on both sides.\n" +
                "3. Sprinkle black salt, chaat masala, and black pepper over the cheese.\n\n" +

                "*Step 2: Toast the Kulchas*\n" +
                "1. Spread butter/ghee on kulchas.\n" +
                "2. Toast on a hot pan until crisp and golden brown.\n\n" +

                "*Step 3: Assemble the Kaladi Kulcha*\n" +
                "1. Place the toasted kulcha on a plate.\n" +
                "2. Spread green chutney and tamarind chutney over it.\n" +
                "3. Add cooked kaladi cheese on top.\n" +
                "4. Garnish with chopped onions, tomatoes, and fresh coriander.\n\n" +
                "Serve hot and enjoy Jammu’s famous Kaladi Kulcha!");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 320 kcal\n" +
                "- Carbohydrates: 40g\n" +
                "- Protein: 10g\n" +
                "- Fat: 12g\n" +
                "- Fiber: 4g");

        // Set Image
        recipeImage.setImageResource(R.drawable.kaladi_kulcha); // Ensure 'kaladi_kulcha' image exists in drawable
    }
}