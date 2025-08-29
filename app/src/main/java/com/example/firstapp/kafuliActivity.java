package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kafuliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kafuli); // Ensure XML layout file name is correct

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Kafuli - A Traditional Uttarakhand Dish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes\nServes: 2-3");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 cups spinach (palak), chopped\n" +
                "- 1/2 cup fenugreek leaves (methi), chopped\n" +
                "- 1 tbsp mustard oil\n" +
                "- 1 tsp cumin seeds (jeera)\n" +
                "- 2 cloves garlic, minced\n" +
                "- 1 green chili, finely chopped\n" +
                "- 1 tbsp wheat flour (or rice flour for gluten-free)\n" +
                "- 1/2 cup buttermilk or water\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- Salt to taste");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Spinach & Fenugreek*\n" +
                "1. Wash and chop spinach and fenugreek leaves.\n" +
                "2. Boil the greens with a little water for 5-7 minutes until soft.\n" +
                "3. Blend into a smooth paste and set aside.\n\n" +

                "*Step 2: Cook the Base*\n" +
                "1. Heat mustard oil in a pan.\n" +
                "2. Add cumin seeds, garlic, and green chili. Sauté until fragrant.\n" +
                "3. Add wheat flour and stir continuously to avoid lumps.\n\n" +

                "*Step 3: Combine Everything*\n" +
                "1. Slowly add the spinach-fenugreek paste to the pan and mix well.\n" +
                "2. Add buttermilk/water, turmeric, red chili powder, and salt.\n" +
                "3. Cook on low heat for 8-10 minutes until thick and creamy.\n" +
                "4. Serve hot with steamed rice or roti!");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 120 kcal\n" +
                "- Carbohydrates: 15g\n" +
                "- Protein: 4g\n" +
                "- Fat: 5g\n" +
                "- Fiber: 3g");

        // Set Image
        recipeImage.setImageResource(R.drawable.kafuli); // Ensure 'kafuli' image exists in drawable
    }
}