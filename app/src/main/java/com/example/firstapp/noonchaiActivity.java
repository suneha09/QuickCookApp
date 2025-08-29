package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class noonchaiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noonchai); // Make sure this matches your XML file name

        // Bind Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Data
        recipeTitle.setText("NOON CHAI");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 2 cups water\n" +
                "- 2 tsp green tea leaves\n" +
                "- 1/4 tsp baking soda\n" +
                "- 1 cup cold water\n" +
                "- 1/2 cup milk\n" +
                "- Salt to taste\n" +
                "- Crushed nuts (optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Boil 2 cups of water with tea leaves and baking soda.\n" +
                "2. Simmer until water reduces to half and turns deep red.\n" +
                "3. Add 1 cup cold water and stir vigorously.\n" +
                "4. Add milk and salt; bring to a boil.\n" +
                "5. Strain and garnish with crushed nuts. Serve hot!");

        recipeNutrition.setText("Nutritional Information:\n" +
                "- Calories: ~90\n" +
                "- Protein: 3g\n" +
                "- Fat: 4g\n" +
                "- Carbohydrates: 8g");

        recipeImage.setImageResource(R.drawable.noonchai);
    }
}
