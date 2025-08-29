package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class babri_beoulActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babri_beoul); // Match with your XML file name

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content
        recipeTitle.setText("BABRI BEOUL");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- Basil seeds (sabja/takmaria): 2 tsp\n" +
                "- Water: 1 glass\n" +
                "- Sugar: to taste\n" +
                "- Milk (optional)\n" +
                "- Ice cubes\n" +
                "- Rose syrup or cardamom (optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Soak basil seeds in water for 10–15 minutes until they swell.\n" +
                "2. Strain the soaked seeds and set aside.\n" +
                "3. In a glass, mix water with sugar and stir until dissolved.\n" +
                "4. Add soaked basil seeds, rose syrup, and optionally milk.\n" +
                "5. Add ice cubes and serve chilled.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Cooling and hydrating\n" +
                "- Good source of fiber\n" +
                "- May aid digestion\n" +
                "- Low in calories");

        recipeImage.setImageResource(R.drawable.babribeoul); // Ensure the image is in res/drawable
    }
}
