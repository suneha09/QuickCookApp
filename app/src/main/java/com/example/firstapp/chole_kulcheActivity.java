package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class chole_kulcheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chole_kulche); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Chole Kulche");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        recipeIngredients.setText("Ingredients:\n\nFor Chole:\n" +
                "- 1 cup chickpeas (soaked overnight)\n" +
                "- 2 tbsp oil\n" +
                "- 1 chopped onion\n" +
                "- 1 chopped tomato\n" +
                "- 1 tsp ginger-garlic paste\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp red chili powder\n" +
                "- 1 tsp garam masala\n" +
                "- 1 tbsp chole masala\n" +
                "- 1 tsp salt\n" +
                "- 2 cups water\n" +
                "- Coriander leaves & lemon (for garnish)\n\n" +
                "For Kulche:\n" +
                "- 2 cups all-purpose flour (maida)\n" +
                "- 1/2 tsp baking powder\n" +
                "- 1/4 tsp baking soda\n" +
                "- 1/2 cup curd\n" +
                "- 1/2 tsp salt\n" +
                "- Water (as needed)\n" +
                "- Butter for roasting");

        recipeInstructions.setText("Instructions:\n\nFor Chole:\n" +
                "1. Boil soaked chickpeas with 2 cups water and salt until soft.\n" +
                "2. Heat oil in a pan, add cumin seeds, onions, and sauté until golden.\n" +
                "3. Add ginger-garlic paste, tomatoes, and cook until soft.\n" +
                "4. Add turmeric, chili powder, garam masala, and chole masala.\n" +
                "5. Mix boiled chickpeas and cook for 10 minutes. Garnish with coriander and lemon.\n\n" +
                "For Kulche:\n" +
                "1. Mix flour, baking powder, baking soda, curd, salt, and water to form a soft dough. Let it rest for 1 hour.\n" +
                "2. Roll into flatbreads and cook on a tawa with butter until golden brown.\n" +
                "3. Serve hot with chole.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 300 kcal\n" +
                "- Carbohydrates: 50g\n" +
                "- Protein: 10g\n" +
                "- Fat: 8g");

        // Set Image
        recipeImage.setImageResource(R.drawable.chole_kulche); // Ensure you have chole_kulche image in drawable
    }
}