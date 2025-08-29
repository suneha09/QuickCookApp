package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class chaachActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaach); // Ensure this matches your XML filename

        // Initialize Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Data (Backend Logic)
        recipeTitle.setText("CHAACH");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n- 1 cup curd\n- 2 cups cold water\n- Salt to taste\n- 1/2 tsp roasted cumin powder\n- Fresh coriander (optional)");

        recipeInstructions.setText("Instructions:\n1. Whisk curd till smooth.\n2. Add cold water and blend.\n3. Mix in salt and cumin powder.\n4. Serve chilled with coriander.");

        recipeNutrition.setText("Nutritional Information:\n- Calories: ~80\n- Protein: 3g\n- Fat: 4g\n- Carbs: 5g");

        recipeImage.setImageResource(R.drawable.chaach);
    }
}
