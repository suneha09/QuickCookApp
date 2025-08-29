package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class chaangActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaang); // Match with your layout file name

        // Initialize Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Content
        recipeTitle.setText("CHAANG");
        recipeDetails.setText("Preparation Time: 10 minutes (plus fermentation time)");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 cup millet or barley\n" +
                "- 2 tbsp yeast (local or brewer's)\n" +
                "- Water (as needed)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Wash and soak the millet or barley overnight.\n" +
                "2. Steam the soaked grains for 30–40 minutes.\n" +
                "3. Let the grains cool, then mix in the yeast.\n" +
                "4. Store in an airtight container for 2–3 days to ferment.\n" +
                "5. To serve, mix fermented grains with warm water and strain.\n" +
                "6. Serve warm or chilled as preferred.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Rich in probiotics\n" +
                "- Carbohydrate-dense\n" +
                "- Moderate alcohol content (varies)\n" +
                "- Traditional digestive aid");

        recipeImage.setImageResource(R.drawable.chaang); // Make sure this image exists in res/drawable
    }
}
