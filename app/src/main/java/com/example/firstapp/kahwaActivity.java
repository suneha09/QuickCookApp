package com.example.firstapp;



import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kahwaActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kahwa); // Ensure this matches your XML filename

        // Initialize views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set values
        recipeTitle.setText("KAHWA");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- 2 cups water\n" +
                "- 1 tsp green tea (Kahwa tea leaves)\n" +
                "- 2–3 crushed cardamom pods\n" +
                "- A few saffron strands\n" +
                "- 1 tsp chopped almonds or walnuts\n" +
                "- Sugar or honey to taste\n" +
                "- Optional: cinnamon stick or crushed cloves");

        recipeInstructions.setText("Instructions:\n" +
                "1. Boil water in a pan and add cardamom, saffron, and nuts.\n" +
                "2. Let it simmer for 2–3 minutes.\n" +
                "3. Add green tea leaves and turn off the heat.\n" +
                "4. Cover and let it steep for 2–3 minutes.\n" +
                "5. Strain into cups and add sweetener as desired.\n" +
                "6. Serve warm.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Rich in antioxidants\n" +
                "- Aids digestion\n" +
                "- Boosts metabolism\n" +
                "- Good for skin and detoxification");

        recipeImage.setImageResource(R.drawable.kahwa); // Ensure this image exists in your drawable folder
    }
}
