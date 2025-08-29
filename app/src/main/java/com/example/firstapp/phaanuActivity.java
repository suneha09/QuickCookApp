package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class phaanuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phaanu); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Phaanu - Uttarakhand Special");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 40 minutes\nServes: 3-4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup mixed lentils (arhar, moong, chana, gahat)\n" +
                "- 2 tbsp mustard oil\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 1/2 tsp mustard seeds\n" +
                "- 1 onion (finely chopped)\n" +
                "- 2 garlic cloves (finely chopped)\n" +
                "- 1 green chili (chopped)\n" +
                "- 1/2 cup water\n" +
                "- 1/2 tsp garam masala\n" +
                "- Salt to taste\n" +
                "- Fresh coriander leaves for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Soaking and Grinding*\n" +
                "1. Soak the mixed lentils for 4-5 hours or overnight.\n" +
                "2. Grind them into a thick paste with minimal water.\n\n" +

                "*Step 2: Making the Base*\n" +
                "1. Heat mustard oil in a pan and add cumin seeds, mustard seeds, and green chilies.\n" +
                "2. Add chopped onions and garlic, sauté until golden brown.\n" +
                "3. Stir in turmeric, red chili powder, and salt.\n\n" +

                "*Step 3: Cooking the Phaanu*\n" +
                "1. Add the lentil paste and stir continuously to avoid lumps.\n" +
                "2. Gradually add water, stirring until a smooth consistency is achieved.\n" +
                "3. Simmer for 15-20 minutes, stirring occasionally.\n" +
                "4. Sprinkle garam masala and mix well.\n" +
                "5. Garnish with fresh coriander leaves and serve hot with rice or roti.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 200 kcal\n" +
                "- Carbohydrates: 30g\n" +
                "- Protein: 12g\n" +
                "- Fiber: 6g\n" +
                "- Fat: 5g");

        // Set Image
        recipeImage.setImageResource(R.drawable.phaanu); // Ensure 'phaanu' image exists in drawable
    }
}