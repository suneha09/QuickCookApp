package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class pani_puriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pani_puri); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Suji Pani Puri - Crispy Semolina Puri with Tangy Water");

        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 30 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "*For Puri:*\n" +
                "- 1 cup semolina (suji)\n" +
                "- 2 tbsp all-purpose flour (maida)\n" +
                "- 1/4 tsp baking soda\n" +
                "- 1/2 tsp salt\n" +
                "- Water (as needed)\n" +
                "- Oil (for deep frying)\n\n" +

                "*For Spicy Pani:*\n" +
                "- 1/2 cup mint leaves\n" +
                "- 1/4 cup coriander leaves\n" +
                "- 1-inch ginger\n" +
                "- 2 green chilies\n" +
                "- 1 tbsp tamarind pulp\n" +
                "- 1 tsp roasted cumin powder\n" +
                "- 1/2 tsp black salt\n" +
                "- 1 tsp chaat masala\n" +
                "- 3 cups chilled water\n" +
                "- Ice cubes (optional)\n\n" +

                "*For Stuffing:*\n" +
                "- 1 cup boiled potatoes (mashed)\n" +
                "- 1/2 cup boiled chickpeas\n" +
                "- 1/2 tsp black salt\n" +
                "- 1/2 tsp chaat masala\n" +
                "- 1/2 tsp cumin powder\n" +
                "- 1/4 tsp red chili powder\n" +
                "- 2 tbsp chopped onions\n" +
                "- 1 tbsp chopped coriander leaves");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Puri*\n" +
                "1. In a bowl, mix semolina, all-purpose flour, salt, and baking soda.\n" +
                "2. Add water gradually and knead into a firm dough.\n" +
                "3. Cover with a damp cloth and let it rest for 20 minutes.\n" +
                "4. Roll out small puris and deep-fry until crispy and puffed up.\n\n" +

                "*Step 2: Prepare Spicy Pani*\n" +
                "1. Blend mint, coriander, ginger, green chilies, and tamarind pulp into a smooth paste.\n" +
                "2. Add roasted cumin powder, black salt, and chaat masala.\n" +
                "3. Mix with chilled water and refrigerate.\n\n" +

                "*Step 3: Prepare the Stuffing*\n" +
                "1. In a bowl, mash boiled potatoes and chickpeas.\n" +
                "2. Add black salt, chaat masala, cumin powder, red chili powder, onions, and coriander.\n" +
                "3. Mix well.\n\n" +

                "*Step 4: Assemble Pani Puri*\n" +
                "1. Crack open a puri and stuff it with the potato mixture.\n" +
                "2. Pour in the spicy mint water.\n" +
                "3. Enjoy the crispy, tangy, and spicy pani puri!");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 220 kcal\n" +
                "- Carbohydrates: 35g\n" +
                "- Protein: 5g\n" +
                "- Fat: 7g\n" +
                "- Fiber: 4g");

        // Set Image
        recipeImage.setImageResource(R.drawable.pani_puri); // Ensure 'pani_puri' image exists in drawable
    }
}