package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class babruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babru); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Babru - Himachali Stuffed Bread");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 cups whole wheat flour\n" +
                "- 1 cup black gram (soaked & ground)\n" +
                "- 1 tsp salt\n" +
                "- 1/2 tsp carom seeds (ajwain)\n" +
                "- 1/2 tsp black pepper powder\n" +
                "- 1/2 tsp cumin powder\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 2 tbsp chopped coriander leaves\n" +
                "- 1 tbsp mustard oil\n" +
                "- Water (as needed)\n" +
                "- Oil (for frying)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Dough*\n" +
                "1. In a mixing bowl, combine wheat flour, salt, carom seeds, and water.\n" +
                "2. Knead into a soft dough and let it rest for 20 minutes.\n\n" +

                "*Step 2: Prepare the Black Gram Stuffing*\n" +
                "1. Grind soaked black gram coarsely.\n" +
                "2. Mix it with black pepper, cumin, turmeric, red chili powder, and coriander leaves.\n" +
                "3. Heat mustard oil in a pan, add the gram mixture, and sauté for 2 minutes.\n" +
                "4. Let it cool before stuffing.\n\n" +

                "*Step 3: Shape and Cook Babru*\n" +
                "1. Take a small portion of dough and roll it into a circle.\n" +
                "2. Place a spoonful of stuffing in the center and seal the edges.\n" +
                "3. Roll it out gently into a flat disc.\n" +
                "4. Heat oil in a pan and deep-fry until golden brown and crispy.\n" +
                "5. Serve hot with tamarind chutney or yogurt.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 250 kcal\n" +
                "- Protein: 8g\n" +
                "- Fat: 10g\n" +
                "- Carbohydrates: 32g\n" +
                "- Fiber: 4g");

        // Set Image
        recipeImage.setImageResource(R.drawable.babru); // Ensure 'babru' image exists in drawable
    }
}