package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class buransh_juiceActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buransh_juice); // Make sure this matches your layout filename

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set data
        recipeTitle.setText("BURANSH JUICE");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1 cup Buransh (rhododendron) flower juice or squash\n" +
                "- 2 cups cold water\n" +
                "- 1 tbsp lemon juice (optional)\n" +
                "- 1-2 tbsp sugar or honey (optional)\n" +
                "- Ice cubes");

        recipeInstructions.setText("Instructions:\n" +
                "1. Mix Buransh juice with cold water in a jug.\n" +
                "2. Add sugar or honey if needed and stir well.\n" +
                "3. Squeeze in lemon juice for extra tang (optional).\n" +
                "4. Add ice cubes.\n" +
                "5. Serve chilled, garnish with mint leaves if desired.");

        recipeNutrition.setText("Nutritional Information (per glass):\n" +
                "- Calories: ~90\n" +
                "- Carbohydrates: 20g\n" +
                "- Sugars: 18g\n" +
                "- Vitamin C: High\n" +
                "- Antioxidants: Rich in natural compounds");

        // Set image
        recipeImage.setImageResource(R.drawable.buransh); // Make sure image is in res/drawable
    }
}
