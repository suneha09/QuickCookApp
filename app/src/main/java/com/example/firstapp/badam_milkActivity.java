package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class badam_milkActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badam_milk); // Make sure this matches your XML file name

        // Bind Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Data
        recipeTitle.setText("BADAM MILK");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 1/4 cup almonds (soaked and peeled)\n" +
                "- 2 cups milk\n" +
                "- 4 tsp sugar (or to taste)\n" +
                "- 1/4 tsp cardamom powder\n" +
                "- A few strands of saffron (optional)\n" +
                "- Chopped pistachios (for garnish)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Blend the soaked and peeled almonds into a fine paste.\n" +
                "2. In a pan, heat the milk and bring it to a boil.\n" +
                "3. Add almond paste and stir continuously to avoid lumps.\n" +
                "4. Add sugar, cardamom powder, and saffron.\n" +
                "5. Simmer for 5-7 minutes.\n" +
                "6. Serve warm or chilled, garnished with chopped pistachios.");

        recipeNutrition.setText("Nutritional Information (per serving):\n" +
                "- Calories: ~180\n" +
                "- Protein: 6g\n" +
                "- Fat: 10g\n" +
                "- Carbohydrates: 16g");

        recipeImage.setImageResource(R.drawable.badam_milk); // Make sure this image is in res/drawable
    }
}
