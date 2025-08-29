package com.example.firstapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class pav_bhajiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pav_bhaji);

        // Finding Views by ID
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Setting Image and Title
        recipeImage.setImageResource(R.drawable.pav_bhaji);
        recipeTitle.setText("Pav Bhaji");

        // Recipe Details (Time & Servings)
        recipeDetails.setText(Html.fromHtml(
                "<b>Preparation Time:</b> 10 minutes<br>" +
                        "<b>Cooking Time:</b> 25 minutes<br>" +
                        "<b>Servings:</b> 2-3 people"
        ));

        // Ingredients
        recipeIngredients.setText(Html.fromHtml(
                "<b>Ingredients:</b><br><br>" +
                        "<b>For Bhaji:</b><br>" +
                        "• 2 potatoes (boiled and mashed)<br>" +
                        "• 1/2 cup cauliflower (finely chopped)<br>" +
                        "• 1/2 cup green peas<br>" +
                        "• 1 onion (finely chopped)<br>" +
                        "• 1 tomato (finely chopped)<br>" +
                        "• 1/2 green bell pepper (chopped)<br>" +
                        "• 1 tbsp butter<br>" +
                        "• 1 tsp ginger-garlic paste<br>" +
                        "• 1 tsp cumin seeds<br>" +
                        "• 1 tsp red chili powder<br>" +
                        "• 1 tsp pav bhaji masala<br>" +
                        "• 1/2 tsp turmeric powder<br>" +
                        "• 1/2 tsp salt (adjust as per taste)<br>" +
                        "• Water as needed<br><br>" +
                        "<b>For Pav:</b><br>" +
                        "• 4 pav buns<br>" +
                        "• 1 tbsp butter<br>" +
                        "• 1/2 tsp pav bhaji masala"
        ));

        // Instructions
        recipeInstructions.setText(Html.fromHtml(
                "<b>Instructions:</b><br><br>" +
                        "<b>1. Preparing Bhaji:</b><br>" +
                        "• Heat butter in a pan, add cumin seeds and let them crackle.<br>" +
                        "• Add onions and sauté until golden brown.<br>" +
                        "• Add ginger-garlic paste and cook until raw smell disappears.<br>" +
                        "• Mix in tomatoes, capsicum, and cook until soft.<br>" +
                        "• Add red chili powder, turmeric, pav bhaji masala, and salt.<br>" +
                        "• Mash boiled potatoes, cauliflower, and peas together, then add them to the pan.<br>" +
                        "• Pour water as needed and let the mixture cook for 10 minutes while stirring.<br>" +
                        "• Mash everything well to achieve a smooth consistency.<br>" +
                        "• Add more butter and mix before serving.<br><br>" +
                        "<b>2. Preparing Pav:</b><br>" +
                        "• Heat butter in a pan, sprinkle pav bhaji masala.<br>" +
                        "• Toast the pav buns on both sides until golden brown.<br><br>" +
                        "<b>3. Serve hot with chopped onions, lemon wedges, and butter. Enjoy!</b>"
        ));

        // Nutritional Info
        recipeNutrition.setText(Html.fromHtml(
                "<b>Nutritional Information (per serving):</b><br>" +
                        "• Calories: ~400 kcal<br>" +
                        "• Protein: 10g<br>" +
                        "• Carbohydrates: 55g<br>" +
                        "• Fat: 15g"
        ));
    }
}