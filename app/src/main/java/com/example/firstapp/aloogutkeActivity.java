package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class aloogutkeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aloogutke); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Aloo Ke Gutke - Uttarakhand Special");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes\nServes: 2-3");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 4 medium-sized potatoes (boiled & cubed)\n" +
                "- 2 tbsp mustard oil\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp red chili powder\n" +
                "- 1/2 tsp coriander powder\n" +
                "- 1 tsp cumin seeds\n" +
                "- 1/2 tsp mustard seeds\n" +
                "- 1/2 tsp asafoetida (hing)\n" +
                "- 2 dried red chilies\n" +
                "- Salt to taste\n" +
                "- Fresh coriander leaves for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Heat the Oil*\n" +
                "1. Heat mustard oil in a pan until it starts to smoke slightly.\n" +
                "2. Add cumin seeds, mustard seeds, dried red chilies, and hing. Let them splutter.\n\n" +

                "*Step 2: Add Spices & Potatoes*\n" +
                "1. Add turmeric powder, red chili powder, and coriander powder. Stir for a few seconds.\n" +
                "2. Add the boiled & cubed potatoes. Mix well so they are evenly coated with spices.\n" +
                "3. Cook on medium flame for 5-7 minutes, stirring occasionally, until potatoes get a slight crisp.\n\n" +

                "*Step 3: Final Touch*\n" +
                "1. Add salt as per taste and mix well.\n" +
                "2. Turn off the heat and garnish with fresh coriander leaves.\n" +
                "3. Serve hot with rice or roti.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 200 kcal\n" +
                "- Carbohydrates: 30g\n" +
                "- Protein: 4g\n" +
                "- Fiber: 3g\n" +
                "- Fat: 7g");

        // Set Image
        recipeImage.setImageResource(R.drawable.aloogutke); // Ensure 'aloogutke' image exists in drawable
    }
}