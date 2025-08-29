package com.example.firstapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class samosaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samosa);

        // Finding Views by ID
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Setting Image and Title
        recipeImage.setImageResource(R.drawable.samosa);
        recipeTitle.setText("Samosa");

        // Recipe Details (Time & Servings)
        recipeDetails.setText(Html.fromHtml(
                "<b>Preparation Time:</b> 15 minutes<br>" +
                        "<b>Cooking Time:</b> 20 minutes<br>" +
                        "<b>Servings:</b> 4-5 pieces"
        ));

        // Ingredients
        recipeIngredients.setText(Html.fromHtml(
                "<b>Ingredients:</b><br><br>" +
                        "<b>For the Dough:</b><br>" +
                        "• 1 cup all-purpose flour (maida)<br>" +
                        "• 2 tbsp oil<br>" +
                        "• 1/2 tsp salt<br>" +
                        "• Water as needed<br><br>" +
                        "<b>For the Filling:</b><br>" +
                        "• 2 medium potatoes (boiled & mashed)<br>" +
                        "• 1/2 cup green peas<br>" +
                        "• 1 tsp cumin seeds<br>" +
                        "• 1 tsp garam masala<br>" +
                        "• 1 tsp coriander powder<br>" +
                        "• 1/2 tsp turmeric powder<br>" +
                        "• 1/2 tsp red chili powder<br>" +
                        "• 1 tbsp oil<br>" +
                        "• Salt to taste"
        ));

        // Instructions
        recipeInstructions.setText(Html.fromHtml(
                "<b>Instructions:</b><br><br>" +
                        "<b>1. Preparing the Dough:</b><br>" +
                        "• Mix flour, salt, and oil. Gradually add water and knead into a stiff dough.<br>" +
                        "• Cover and let it rest for 20 minutes.<br><br>" +
                        "<b>2. Preparing the Filling:</b><br>" +
                        "• Heat oil in a pan, add cumin seeds.<br>" +
                        "• Add mashed potatoes, green peas, and spices. Cook for 5 minutes and let it cool.<br><br>" +
                        "<b>3. Making the Samosas:</b><br>" +
                        "• Roll the dough into small circles and cut in half.<br>" +
                        "• Shape each half into a cone and fill with the potato mixture.<br>" +
                        "• Seal the edges properly and deep fry until golden brown.<br><br>" +
                        "<b>4. Serve hot with chutney and enjoy!</b>"
        ));

        // Nutritional Info
        recipeNutrition.setText(Html.fromHtml(
                "<b>Nutritional Information (per piece):</b><br>" +
                        "• Calories: ~150 kcal<br>" +
                        "• Protein: 3g<br>" +
                        "• Carbohydrates: 20g<br>" +
                        "• Fat: 7g"
        ));
    }
}