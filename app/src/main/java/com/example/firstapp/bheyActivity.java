package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bheyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhey); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Bhey - Spicy Lotus Stem Dish from Himachal");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 25 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 cups lotus stem (Bhey), thinly sliced\n" +
                "- 2 tbsp mustard oil\n" +
                "- 1 onion, finely chopped\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1 tsp coriander powder\n" +
                "- 1/2 tsp garam masala\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 2 cloves garlic, minced\n" +
                "- 1 green chili, chopped\n" +
                "- 1 tbsp gram flour (besan)\n" +
                "- Salt to taste\n" +
                "- Water as needed\n" +
                "- Fresh coriander for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Lotus Stem*\n" +
                "1. Wash and thinly slice the lotus stem.\n" +
                "2. Boil the slices in water with a pinch of salt for 10 minutes to remove bitterness. Drain and set aside.\n\n" +

                "*Step 2: Cook the Dish*\n" +
                "1. Heat mustard oil in a pan until it reaches the smoking point, then reduce the flame.\n" +
                "2. Add cumin seeds and let them splutter.\n" +
                "3. Add chopped onions and sauté until golden brown.\n" +
                "4. Stir in garlic and green chili, cook for a minute.\n" +
                "5. Add turmeric, red chili powder, coriander powder, and salt. Mix well.\n" +
                "6. Add boiled lotus stem slices and stir-fry for 5 minutes.\n" +
                "7. Sprinkle gram flour (besan) to coat the lotus stem and enhance texture.\n" +
                "8. Add a little water if required, cover, and cook for another 5 minutes.\n" +
                "9. Finish with garam masala and garnish with fresh coriander.\n" +
                "10. Serve hot with chapati or rice.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 180 kcal\n" +
                "- Carbohydrates: 30g\n" +
                "- Protein: 5g\n" +
                "- Fat: 7g\n" +
                "- Fiber: 6g");

        // Set Image
        recipeImage.setImageResource(R.drawable.bhey); // Ensure 'bhey' image exists in drawable
    }
}