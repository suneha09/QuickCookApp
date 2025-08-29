package com.example.firstapp;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class chole_bhatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chole_bhature);

        // Finding Views by ID
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Setting Image and Title
        recipeImage.setImageResource(R.drawable.chole_bhature);
        recipeTitle.setText("Chole Bhature");

        // Recipe Details (Time & Servings)
        recipeDetails.setText(Html.fromHtml(
                "<b>Preparation Time:</b> 10 minutes<br>" +
                        "<b>Cooking Time:</b> 30 minutes<br>" +
                        "<b>Servings:</b> 2-3 people"
        ));

        // Ingredients
        recipeIngredients.setText(Html.fromHtml(
                "<b>Ingredients:</b><br><br>" +
                        "<b>For Chole:</b><br>" +
                        "• 1 cup chickpeas (soaked overnight)<br>" +
                        "• 2 onions (finely chopped)<br>" +
                        "• 2 tomatoes (pureed)<br>" +
                        "• 1 tbsp ginger-garlic paste<br>" +
                        "• 1 tsp cumin seeds<br>" +
                        "• 1 tsp turmeric powder<br>" +
                        "• 1 tsp coriander powder<br>" +
                        "• 1 tsp garam masala<br>" +
                        "• 1 tbsp oil<br>" +
                        "• Salt to taste<br><br>" +
                        "<b>For Bhature:</b><br>" +
                        "• 2 cups all-purpose flour (maida)<br>" +
                        "• 2 tbsp curd (yogurt)<br>" +
                        "• 1/2 tsp baking soda<br>" +
                        "• Water as required<br>" +
                        "• Oil for deep frying"
        ));

        // Instructions
        recipeInstructions.setText(Html.fromHtml(
                "<b>Instructions:</b><br><br>" +
                        "<b>1. Preparing Chole:</b><br>" +
                        "• Boil the soaked chickpeas until soft.<br>" +
                        "• Heat oil in a pan, add cumin seeds, then sauté onions till golden brown.<br>" +
                        "• Add ginger-garlic paste and cook until raw smell disappears.<br>" +
                        "• Pour in the tomato puree and cook until oil separates.<br>" +
                        "• Add spices and boiled chickpeas, mix well, and let simmer for 10 minutes.<br><br>" +
                        "<b>2. Preparing Bhature:</b><br>" +
                        "• Mix flour, curd, baking soda, and salt.<br>" +
                        "• Add water gradually and knead into a soft dough. Let it rest for 2 hours.<br>" +
                        "• Divide into small balls and roll them into circles.<br>" +
                        "• Deep fry in hot oil until golden brown and puffy.<br><br>" +
                        "<b>3. Serve hot with sliced onions, green chutney, and lemon. Enjoy!</b>"
        ));

        // Nutritional Info
        recipeNutrition.setText(Html.fromHtml(
                "<b>Nutritional Information (per serving):</b><br>" +
                        "• Calories: ~450 kcal<br>" +
                        "• Protein: 12g<br>" +
                        "• Carbohydrates: 60g<br>" +
                        "• Fat: 18g"
        ));
    }
}