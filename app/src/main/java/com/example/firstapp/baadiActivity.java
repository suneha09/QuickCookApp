package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class baadiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baadi); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Baadi - Traditional Uttarakhand Dish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 5 minutes\nServes: 2-3");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup Mandua (Finger Millet) flour\n" +
                "- 2 cups water\n" +
                "- 1/2 tsp salt (or as per taste)\n" +
                "- 1/2 tsp ghee (for extra flavor, optional)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Boil the Water*\n" +
                "1. Heat 2 cups of water in a pan and bring it to a boil.\n" +
                "2. Add salt and stir well.\n\n" +

                "*Step 2: Add Mandua Flour*\n" +
                "1. Slowly add mandua flour while stirring continuously to avoid lumps.\n" +
                "2. Keep stirring until the mixture thickens and forms a dough-like consistency.\n\n" +

                "*Step 3: Final Touch*\n" +
                "1. Once cooked, remove from heat.\n" +
                "2. Serve hot with ghee and Phaanu (a traditional lentil dish) or gahat dal.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 150 kcal\n" +
                "- Carbohydrates: 30g\n" +
                "- Protein: 4g\n" +
                "- Fiber: 3g\n" +
                "- Fat: 1g");

        // Set Image
        recipeImage.setImageResource(R.drawable.baadi); // Ensure 'baadi' image exists in drawable
    }
}