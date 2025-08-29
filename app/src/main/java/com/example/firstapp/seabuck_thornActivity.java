package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class seabuck_thornActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seabuck_thorn); // Ensure your XML is named this

        // Initialize Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Recipe Content
        recipeTitle.setText("SEABUCKTHORN JUICE");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 cup seabuckthorn berries (fresh or frozen)\n" +
                "- 2 tablespoons honey or sugar (adjust to taste)\n" +
                "- 2 cups water\n" +
                "- A pinch of black salt (optional)\n" +
                "- Ice cubes (optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Rinse the seabuckthorn berries thoroughly.\n" +
                "2. Blend the berries with water until smooth.\n" +
                "3. Strain the mixture to remove seeds and skin.\n" +
                "4. Add honey or sugar and stir well.\n" +
                "5. Add black salt and ice cubes if desired.\n" +
                "6. Serve fresh and enjoy the tangy flavor.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Rich in Vitamin C, E, and antioxidants\n" +
                "- Boosts immunity\n" +
                "- Good for skin and digestion\n" +
                "- Anti-inflammatory properties");

        recipeImage.setImageResource(R.drawable.seabuckthornjuice); // Ensure image is in res/drawable
    }
}
