package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kesar_milkActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesar_milk); // Make sure this matches your layout XML name

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set the data
        recipeTitle.setText("KESAR MILK");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 2 cups full cream milk\n" +
                "- 10-12 saffron strands (kesar)\n" +
                "- 2 tsp sugar (or to taste)\n" +
                "- 4-5 chopped pistachios\n" +
                "- 1/4 tsp cardamom powder");

        recipeInstructions.setText("Instructions:\n" +
                "1. Soak saffron strands in 2 tbsp warm milk for 10 minutes.\n" +
                "2. Heat the rest of the milk in a saucepan and bring to a boil.\n" +
                "3. Add soaked saffron milk, cardamom powder, and sugar.\n" +
                "4. Simmer for 3-5 minutes while stirring occasionally.\n" +
                "5. Add chopped pistachios and mix well.\n" +
                "6. Serve hot or chilled as desired.");

        recipeNutrition.setText("Nutritional Information (per serving):\n" +
                "- Calories: ~150\n" +
                "- Protein: 6g\n" +
                "- Fat: 8g\n" +
                "- Carbohydrates: 13g");

        // Set the image
        recipeImage.setImageResource(R.drawable.kesar_pista_milk); // Ensure this image is present in res/drawable
    }
}
