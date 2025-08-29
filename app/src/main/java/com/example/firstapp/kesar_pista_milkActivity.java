package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kesar_pista_milkActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesar_pista_milk); // Match this with your XML layout filename

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set values
        recipeTitle.setText("KESAR PISTA MILK");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 2 cups full cream milk\n" +
                "- 8-10 saffron strands (kesar)\n" +
                "- 1 tbsp chopped pistachios\n" +
                "- 2 tbsp sugar (adjust to taste)\n" +
                "- 1/4 tsp cardamom powder");

        recipeInstructions.setText("Instructions:\n" +
                "1. Heat milk in a pan and bring to a boil.\n" +
                "2. Add saffron strands and stir well.\n" +
                "3. Let it simmer on low flame for 5–7 minutes.\n" +
                "4. Add sugar and cardamom powder, mix until dissolved.\n" +
                "5. Add chopped pistachios and turn off the heat.\n" +
                "6. Serve warm or chilled, as preferred.");

        recipeNutrition.setText("Nutritional Information (per serving):\n" +
                "- Calories: ~180 kcal\n" +
                "- Protein: 6g\n" +
                "- Fat: 9g\n" +
                "- Carbs: 18g\n" +
                "- Calcium-rich and energizing");

        recipeImage.setImageResource(R.drawable.kesar_pista_milk); // Ensure this image is in res/drawable
    }
}
