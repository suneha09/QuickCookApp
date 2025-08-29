package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class sidduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siddu); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Siddu - Traditional Himachali Stuffed Bread");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 40 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "*For Dough:*\n" +
                "- 2 cups wheat flour\n" +
                "- 1 tsp dry yeast\n" +
                "- 1/2 tsp sugar\n" +
                "- 1/2 cup warm water\n" +
                "- 1/2 tsp salt\n" +
                "- 1 tbsp oil\n\n" +

                "*For Stuffing:*\n" +
                "- 1/2 cup walnuts (crushed)\n" +
                "- 1/2 cup paneer (crumbled)\n" +
                "- 2 tbsp mustard seeds\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1/2 tsp garam masala\n" +
                "- Salt to taste\n" +
                "- 1 tbsp coriander leaves (chopped)\n" +
                "- 1 tbsp ghee (for greasing)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Dough*\n" +
                "1. In a small bowl, mix yeast, sugar, and warm water. Let it sit for 5-10 minutes until it foams.\n" +
                "2. In a large bowl, add wheat flour and salt. Pour in the yeast mixture and knead into a soft dough.\n" +
                "3. Cover the dough with a damp cloth and let it rest for 1-2 hours until it doubles in size.\n\n" +

                "*Step 2: Make the Stuffing*\n" +
                "1. In a pan, heat mustard seeds until they crackle.\n" +
                "2. Add crushed walnuts, paneer, turmeric, red chili powder, and garam masala. Mix well.\n" +
                "3. Season with salt and stir in coriander leaves.\n" +
                "4. Remove from heat and let the stuffing cool.\n\n" +

                "*Step 3: Shape & Steam the Siddu*\n" +
                "1. Take a portion of the dough, roll it into a small circle, and place stuffing in the center.\n" +
                "2. Fold the dough over the stuffing and seal it well.\n" +
                "3. Steam the Siddu for about 15-20 minutes until it becomes fluffy.\n" +
                "4. Serve hot with ghee, chutney, or dal.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 250 kcal\n" +
                "- Carbohydrates: 40g\n" +
                "- Protein: 8g\n" +
                "- Fat: 7g\n" +
                "- Fiber: 5g");

        // Set Image
        recipeImage.setImageResource(R.drawable.siddu); // Ensure 'siddu' image exists in drawable
    }
}