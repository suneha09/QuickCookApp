package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class thandaiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thandai); // Make sure this matches your XML layout file name

        // Bind UI elements
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content for THANDAI
        recipeTitle.setText("THANDAI");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 2 cups milk\n" +
                "- 10 almonds\n" +
                "- 5 cashews\n" +
                "- 5 pistachios\n" +
                "- 1 tsp poppy seeds\n" +
                "- 1 tsp fennel seeds\n" +
                "- 5 black peppercorns\n" +
                "- 3 cardamom pods\n" +
                "- 2 tsp sugar\n" +
                "- Rose water or saffron (optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Soak almonds, cashews, pistachios, poppy seeds, fennel, peppercorns, and cardamom in water for 4-5 hours.\n" +
                "2. Peel almonds and grind all soaked ingredients into a smooth paste.\n" +
                "3. Mix the paste into boiled, cooled milk.\n" +
                "4. Add sugar and rose water or saffron (if using).\n" +
                "5. Chill for an hour. Strain before serving for a smooth texture.");

        recipeNutrition.setText("Nutritional Information:\n" +
                "- Calories: ~180\n" +
                "- Protein: 6g\n" +
                "- Fat: 9g\n" +
                "- Carbohydrates: 16g");

        recipeImage.setImageResource(R.drawable.thandai);
    }
}
