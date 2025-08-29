package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class tudkiya_bhathActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tudkiya_bhath); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Tudkiya Bhath - A Traditional Himachali Rice Dish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 40 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup basmati rice\n" +
                "- 2 tbsp ghee (clarified butter)\n" +
                "- 1/2 cup potatoes, diced\n" +
                "- 1/2 cup onions, finely chopped\n" +
                "- 1/2 cup tomatoes, chopped\n" +
                "- 2 tbsp yogurt\n" +
                "- 1 tsp ginger-garlic paste\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1 tsp coriander powder\n" +
                "- 1 tsp garam masala\n" +
                "- 1 bay leaf\n" +
                "- 2 green cardamoms\n" +
                "- 2 cloves\n" +
                "- 1-inch cinnamon stick\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 4 cups water\n" +
                "- Salt to taste\n" +
                "- Fresh coriander for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Masala*\n" +
                "1. Wash and soak the rice for 20 minutes.\n" +
                "2. Heat ghee in a pan and add cumin seeds, bay leaf, cardamoms, cloves, and cinnamon.\n" +
                "3. Add onions and sauté until golden brown.\n" +
                "4. Add ginger-garlic paste and cook for a minute.\n" +
                "5. Add chopped tomatoes, turmeric, red chili powder, and coriander powder. Cook until tomatoes turn soft.\n\n" +

                "*Step 2: Cook the Rice*\n" +
                "1. Add diced potatoes and sauté for 2-3 minutes.\n" +
                "2. Stir in the yogurt and cook for another minute.\n" +
                "3. Add soaked rice and mix well.\n" +
                "4. Pour in 4 cups of water and add salt.\n" +
                "5. Cover and cook on low heat for 20-25 minutes, or until rice is fully cooked.\n" +
                "6. Garnish with fresh coriander and serve hot.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 350 kcal\n" +
                "- Carbohydrates: 60g\n" +
                "- Protein: 8g\n" +
                "- Fat: 10g\n" +
                "- Fiber: 5g");

        // Set Image
        recipeImage.setImageResource(R.drawable.tudkiya_bhath); // Ensure 'tudkiya_bhath' image exists in drawable
    }
}