package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class butter_chickenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_chicken); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Butter Chicken");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        recipeIngredients.setText("Ingredients:\n\nFor Marination:\n" +
                "- 500g boneless chicken\n" +
                "- 1/2 cup yogurt\n" +
                "- 1 tbsp ginger-garlic paste\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp red chili powder\n" +
                "- 1 tsp garam masala\n" +
                "- Salt to taste\n" +
                "- 1 tbsp lemon juice\n\n" +
                "For Gravy:\n" +
                "- 2 tbsp butter\n" +
                "- 1 chopped onion\n" +
                "- 2 tomatoes (pureed)\n" +
                "- 1/2 cup fresh cream\n" +
                "- 1 tsp kasuri methi (dried fenugreek leaves)\n" +
                "- 1 tsp sugar\n" +
                "- Salt to taste\n" +
                "- 1 tsp garam masala\n" +
                "- 1 tsp coriander powder");

        recipeInstructions.setText("Instructions:\n\nFor Marination:\n" +
                "1. Mix chicken with yogurt, lemon juice, ginger-garlic paste, and spices.\n" +
                "2. Let it marinate for at least 1 hour (overnight for best results).\n\n" +
                "For Cooking Chicken:\n" +
                "1. Heat a pan and cook the marinated chicken until golden brown.\n" +
                "2. Set aside.\n\n" +
                "For Butter Chicken Gravy:\n" +
                "1. In the same pan, melt butter and sauté onions until golden.\n" +
                "2. Add tomato puree, salt, sugar, and cook for 5-7 minutes.\n" +
                "3. Blend the mixture for a smooth texture and return to the pan.\n" +
                "4. Add kasuri methi, garam masala, and cooked chicken. Mix well.\n" +
                "5. Pour in fresh cream, stir, and simmer for 5 minutes.\n" +
                "6. Serve hot with naan or rice.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 450 kcal\n" +
                "- Carbohydrates: 12g\n" +
                "- Protein: 35g\n" +
                "- Fat: 30g");

        // Set Image
        recipeImage.setImageResource(R.drawable.butter_chicken); // Ensure you have butter_chicken image in drawable
    }
}