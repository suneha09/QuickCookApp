package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class rajma_chawalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajma_chawal); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Rajma Chawal - A Classic North Indian Dish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 40-45 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "*For Rajma (Kidney Beans Curry):*\n" +
                "- 1 cup rajma (kidney beans), soaked overnight\n" +
                "- 2 cups water (for pressure cooking)\n" +
                "- 2 tbsp oil or ghee\n" +
                "- 1 large onion (finely chopped)\n" +
                "- 2 medium tomatoes (pureed)\n" +
                "- 1 tsp ginger-garlic paste\n" +
                "- 1 green chili (finely chopped)\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp red chili powder\n" +
                "- 1 tsp coriander powder\n" +
                "- 1/2 tsp garam masala\n" +
                "- Salt to taste\n" +
                "- Fresh coriander leaves (for garnish)\n\n" +
                "*For Chawal (Rice):*\n" +
                "- 2 cups basmati rice\n" +
                "- 4 cups water\n" +
                "- 1/2 tsp salt\n" +
                "- 1 tsp ghee or oil");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Cook Rajma*\n" +
                "1. Rinse the soaked rajma and pressure cook with 2 cups of water for 20-25 minutes until soft.\n" +
                "2. Heat oil/ghee in a pan, add onions, and sauté until golden brown.\n" +
                "3. Add ginger-garlic paste and chopped green chili. Sauté for a minute.\n" +
                "4. Add tomato puree and cook until the oil separates.\n" +
                "5. Add turmeric, red chili powder, coriander powder, and salt. Mix well.\n" +
                "6. Add the cooked rajma along with the water and let it simmer for 10 minutes.\n" +
                "7. Stir in garam masala and garnish with fresh coriander leaves.\n\n" +
                "*Step 2: Cook Chawal*\n" +
                "1. Rinse basmati rice thoroughly.\n" +
                "2. In a pot, bring 4 cups of water to a boil, add salt and ghee/oil.\n" +
                "3. Add rice, cover, and cook on low heat for 10-12 minutes until soft.\n" +
                "4. Fluff with a fork and serve hot with rajma.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 350 kcal\n" +
                "- Carbohydrates: 65g\n" +
                "- Protein: 12g\n" +
                "- Fat: 5g\n" +
                "- Fiber: 10g");

        // Set Image
        recipeImage.setImageResource(R.drawable.rajma_chawal); // Ensure you have 'rajma_chawal' image in drawable
    }
}