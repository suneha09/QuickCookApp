package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class kullu_troutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kullu_trout); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Kullu Trout - Himachali Grilled Fish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes\nServes: 2");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 2 fresh trout fish\n" +
                "- 1 tbsp mustard oil\n" +
                "- 1 tbsp lemon juice\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1/2 tsp black pepper powder\n" +
                "- 1 tsp ginger-garlic paste\n" +
                "- 1 tsp cumin powder\n" +
                "- 1/2 tsp salt (or to taste)\n" +
                "- 2 tbsp fresh coriander leaves (chopped)\n" +
                "- 1 tsp carom seeds (ajwain)\n" +
                "- 1 tbsp ghee (for grilling)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Marinade*\n" +
                "1. Clean and wash the trout fish thoroughly.\n" +
                "2. In a bowl, mix mustard oil, lemon juice, turmeric, red chili powder, black pepper, cumin powder, ginger-garlic paste, and salt.\n" +
                "3. Rub this marinade generously over the fish and inside the cavity.\n" +
                "4. Let it marinate for at least 30 minutes.\n\n" +

                "*Step 2: Grill the Trout*\n" +
                "1. Heat ghee in a pan or grill over medium heat.\n" +
                "2. Place the marinated trout and cook for about 8-10 minutes per side until golden and crispy.\n" +
                "3. Sprinkle fresh coriander leaves and carom seeds while grilling for extra flavor.\n" +
                "4. Serve hot with lemon wedges and mint chutney.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 220 kcal\n" +
                "- Protein: 25g\n" +
                "- Fat: 10g\n" +
                "- Carbohydrates: 2g\n" +
                "- Omega-3 Fatty Acids: High");

        // Set Image
        recipeImage.setImageResource(R.drawable.kullu_trout); // Ensure 'kullu_trout' image exists in drawable
    }
}