package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bhattchutneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhattchutney); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Bhatt Ki Chukrani - Uttarakhand Special");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes\nServes: 2-3");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup bhatt (black soybeans)\n" +
                "- 2 tbsp ghee\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 1/2 tsp mustard seeds\n" +
                "- 2 garlic cloves (finely chopped)\n" +
                "- 1/2 cup curd (whisked)\n" +
                "- Salt to taste\n" +
                "- Fresh coriander leaves for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Roast the Bhatt*\n" +
                "1. Heat a dry pan and roast the black soybeans (bhatt) until they turn dark and aromatic.\n" +
                "2. Once roasted, grind them into a coarse powder.\n\n" +

                "*Step 2: Prepare the Masala*\n" +
                "1. Heat ghee in a pan and add cumin seeds, mustard seeds, and garlic.\n" +
                "2. Sauté until garlic turns golden brown.\n\n" +

                "*Step 3: Cooking the Chukrani*\n" +
                "1. Add turmeric powder, red chili powder, and salt. Stir for a few seconds.\n" +
                "2. Add the roasted bhatt powder and mix well.\n" +
                "3. Pour in the whisked curd, stirring continuously to prevent curdling.\n" +
                "4. Cook for 10 minutes on low flame until the mixture thickens.\n" +
                "5. Garnish with fresh coriander leaves and serve hot with rice or roti.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 180 kcal\n" +
                "- Carbohydrates: 20g\n" +
                "- Protein: 8g\n" +
                "- Fiber: 5g\n" +
                "- Fat: 6g");

        // Set Image
        recipeImage.setImageResource(R.drawable.bhattchutney); // Ensure 'bhattchutney' image exists in drawable
    }
}