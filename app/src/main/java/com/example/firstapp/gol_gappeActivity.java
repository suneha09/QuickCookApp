package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class gol_gappeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gol_gappe); // Ensure your XML layout file is correctly named.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Gol Gappe");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 cup wheat flour (gehu ka atta)\n" +
                "- 1/4 tsp baking soda\n" +
                "- 1/2 tsp salt\n" +
                "- 1/2 cup water (as needed)\n" +
                "- Oil for deep frying\n" +
                "- 2 boiled potatoes (mashed)\n" +
                "- 1/2 cup boiled chickpeas\n" +
                "- 1 finely chopped onion\n" +
                "- 1 tsp chaat masala\n" +
                "- 1/2 tsp black salt\n" +
                "- Tamarind chutney & mint water");

        recipeInstructions.setText("Instructions:\n" +
                "1. Mix wheat flour, baking soda, salt, and water to form a stiff dough. Let it rest for 15 minutes.\n" +
                "2. Roll small puris and deep fry until golden and crispy.\n" +
                "3. In a bowl, mix mashed potatoes, chickpeas, onions, and spices.\n" +
                "4. Poke a hole in each puri and stuff with filling.\n" +
                "5. Serve with tamarind chutney and spicy mint water.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 160 kcal\n" +
                "- Carbohydrates: 28g\n" +
                "- Protein: 4g\n" +
                "- Fat: 4g");

        // Set Image
        recipeImage.setImageResource(R.drawable.gol_gappe); // Ensure you have gol_gappe image in drawable
    }
}