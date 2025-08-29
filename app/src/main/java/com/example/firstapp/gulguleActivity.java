package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class gulguleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulgule); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Sweet Gulgule - Uttarakhand Special");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes\nServes: 3-4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup wheat flour\n" +
                "- 1/2 cup jaggery (grated)\n" +
                "- 1/2 cup water\n" +
                "- 1/2 tsp fennel seeds\n" +
                "- 1/4 tsp cardamom powder\n" +
                "- 1 pinch salt\n" +
                "- 1/4 tsp baking soda (optional)\n" +
                "- Oil for deep frying");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Batter*\n" +
                "1. Dissolve jaggery in warm water and mix well.\n" +
                "2. In a bowl, add wheat flour, fennel seeds, cardamom powder, salt, and baking soda.\n" +
                "3. Pour the jaggery water gradually and mix to form a thick batter.\n" +
                "4. Let it rest for 10 minutes.\n\n" +

                "*Step 2: Fry the Gulgule*\n" +
                "1. Heat oil in a pan on medium heat.\n" +
                "2. Drop small spoonfuls of batter into the oil.\n" +
                "3. Fry until golden brown and crispy.\n" +
                "4. Remove and drain excess oil on tissue paper.\n\n" +

                "*Step 3: Serve & Enjoy*\n" +
                "1. Serve warm with tea or as a sweet snack.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 180 kcal\n" +
                "- Carbohydrates: 32g\n" +
                "- Protein: 3g\n" +
                "- Fiber: 2g\n" +
                "- Fat: 5g");

        // Set Image
        recipeImage.setImageResource(R.drawable.gulgula); // Ensure 'gulgula' image exists in drawable
    }
}