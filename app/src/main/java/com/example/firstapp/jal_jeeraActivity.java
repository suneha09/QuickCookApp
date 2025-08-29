package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class jal_jeeraActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jal_jeera); // Match with your XML filename

        // Initialize Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Data
        recipeTitle.setText("JAL JEERA");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1/2 cup fresh mint leaves\n" +
                "- 1 tbsp roasted cumin powder\n" +
                "- 1 tsp black salt\n" +
                "- 1/2 tsp dry mango powder (amchur)\n" +
                "- 1 tsp grated ginger\n" +
                "- 1-2 green chilies (optional)\n" +
                "- 1 tbsp lemon juice\n" +
                "- 2 cups cold water\n" +
                "- Ice cubes");

        recipeInstructions.setText("Instructions:\n" +
                "1. Add mint, cumin powder, black salt, amchur, ginger, green chilies, and lemon juice into a blender.\n" +
                "2. Add a bit of water and blend until smooth.\n" +
                "3. Strain the mixture into a bowl.\n" +
                "4. Add remaining cold water and mix well.\n" +
                "5. Serve chilled with ice cubes.");

        recipeNutrition.setText("Nutritional Information (per glass):\n" +
                "- Calories: ~35\n" +
                "- Sodium: Moderate\n" +
                "- Rich in antioxidants\n" +
                "- Aids digestion");

        // Set Image
        recipeImage.setImageResource(R.drawable.jal_jerra); // Make sure this image exists in res/drawable
    }
}
