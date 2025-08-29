package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kachalu_chaatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kachalu_chaat); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Kachalu Chaat - Spicy & Tangy Taro Root Chaat");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 cups kachalu (taro root), boiled & sliced\n" +
                "- 1 tbsp mustard oil\n" +
                "- 1/2 tsp black salt\n" +
                "- 1/2 tsp rock salt\n" +
                "- 1/2 tsp roasted cumin powder\n" +
                "- 1/4 tsp red chili powder\n" +
                "- 1/2 tsp chaat masala\n" +
                "- 1 tbsp tamarind pulp\n" +
                "- 1 tsp lemon juice\n" +
                "- 2 tbsp finely chopped onions\n" +
                "- 2 tbsp finely chopped coriander leaves\n" +
                "- 1 green chili (chopped, optional)\n" +
                "- 1 tsp crushed jaggery (optional, for sweetness)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare Kachalu*\n" +
                "1. Boil kachalu (taro root) until soft but firm.\n" +
                "2. Peel and slice into medium-sized pieces.\n\n" +

                "*Step 2: Mix Spices & Chaat Masala*\n" +
                "1. Heat mustard oil in a pan and let it cool slightly.\n" +
                "2. Add black salt, rock salt, roasted cumin powder, red chili powder, and chaat masala.\n" +
                "3. Mix in tamarind pulp, lemon juice, and jaggery (if using).\n" +
                "4. Stir well to form a tangy-spicy seasoning.\n\n" +

                "*Step 3: Toss & Serve*\n" +
                "1. Add boiled kachalu slices to the spice mix.\n" +
                "2. Toss everything well to coat the kachalu evenly.\n" +
                "3. Garnish with chopped onions, coriander leaves, and green chilies.\n" +
                "4. Serve immediately for the best taste!");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 180 kcal\n" +
                "- Carbohydrates: 35g\n" +
                "- Protein: 3g\n" +
                "- Fat: 5g\n" +
                "- Fiber: 6g");

        // Set Image
        recipeImage.setImageResource(R.drawable.kachalu_chaat); // Ensure 'kachalu_chaat' image exists in drawable
    }
}