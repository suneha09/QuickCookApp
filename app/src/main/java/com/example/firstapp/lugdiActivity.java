package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class lugdiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle, recipeDetails, recipeIngredients, recipeInstructions, recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugdi); // Make sure your layout XML is named activity_lugdi.xml

        // Initialize Views
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set Recipe Content
        recipeTitle.setText("LUGDI");
        recipeDetails.setText("Preparation Time: 10 minutes");

        recipeIngredients.setText("Ingredients:\n" +
                "- Cooked rice or barley (as needed)\n" +
                "- Lukewarm water\n" +
                "- A clean earthen pot or glass jar\n" +
                "- Banana leaves (for traditional covering, optional)");

        recipeInstructions.setText("Instructions:\n" +
                "1. Let the cooked rice or barley cool to room temperature.\n" +
                "2. Transfer it into a clean pot.\n" +
                "3. Add lukewarm water just enough to submerge it.\n" +
                "4. Cover the pot with banana leaves or a clean cloth.\n" +
                "5. Keep in a warm place for 4–5 days to allow fermentation.\n" +
                "6. Once ready, strain and serve the liquid. Best served slightly chilled.");

        recipeNutrition.setText("Nutritional Information (approx.):\n" +
                "- Naturally fermented beverage\n" +
                "- Contains probiotics\n" +
                "- Rich in carbohydrates\n" +
                "- Can aid digestion\n" +
                "- Moderate alcohol content depending on fermentation time");

        recipeImage.setImageResource(R.drawable.lugdi); // Make sure this image is available in res/drawable
    }
}
