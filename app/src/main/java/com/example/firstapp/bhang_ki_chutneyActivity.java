package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class bhang_ki_chutneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhang_ki_chutney); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Bhang Ki Chutney - A Traditional Uttarakhand Delight");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 5 minutes\nServes: 3-4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 3 tbsp hemp seeds (bhang seeds)\n" +
                "- 2 tbsp fresh coriander leaves\n" +
                "- 2 green chilies\n" +
                "- 1 tsp cumin seeds\n" +
                "- 1/2 tsp salt (or as per taste)\n" +
                "- 1/2 tsp lemon juice\n" +
                "- 2-3 cloves of garlic (optional)\n" +
                "- 1 tbsp yogurt (optional, for a creamy texture)\n" +
                "- 2 tbsp water");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Roast the Bhang Seeds*\n" +
                "1. Heat a pan and dry roast bhang (hemp) seeds on low flame until they start crackling.\n" +
                "2. Remove from heat and let them cool.\n\n" +

                "*Step 2: Blend the Ingredients*\n" +
                "1. In a grinder, add roasted bhang seeds, green chilies, cumin seeds, salt, garlic (if using), and fresh coriander leaves.\n" +
                "2. Add a little water and grind to make a smooth paste.\n\n" +

                "*Step 3: Final Touch*\n" +
                "1. Transfer the chutney to a bowl.\n" +
                "2. Add lemon juice and mix well.\n" +
                "3. (Optional) Mix in yogurt for a creamy texture.\n\n" +
                "Serve fresh with roti, rice, or snacks!");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 80 kcal\n" +
                "- Carbohydrates: 6g\n" +
                "- Protein: 3g\n" +
                "- Fat: 5g\n" +
                "- Fiber: 2g");

        // Set Image
        recipeImage.setImageResource(R.drawable.bhang_ki_chutney); // Ensure 'bhang_ki_chutney' image exists in drawable
    }
}