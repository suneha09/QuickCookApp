package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kaphal_juiceActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaphal_juice); // Make sure this matches your XML filename

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set values
        recipeTitle.setText("KAPHAL JUICE");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- Kaphal (box myrtle berries): 1 cup\n" +
                "- Sugar or honey: to taste\n" +
                "- Water: 1/2 cup\n" +
                "- Ice cubes (optional)\n" +
                "- Lemon juice (optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Wash the kaphal berries thoroughly.\n" +
                "2. Blend berries with a little water until smooth.\n" +
                "3. Strain the mixture to remove seeds and skin.\n" +
                "4. Add sugar or honey and mix well.\n" +
                "5. Optionally, add lemon juice and ice.\n" +
                "6. Serve chilled.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Rich in antioxidants\n" +
                "- Good source of Vitamin C\n" +
                "- Refreshing and hydrating\n" +
                "- May support immunity");

        recipeImage.setImageResource(R.drawable.kaphal_juice); // Ensure image is available in res/drawable
    }
}
