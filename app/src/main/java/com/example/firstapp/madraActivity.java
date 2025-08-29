package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class madraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madra); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Madra - A Traditional Himachali Dish");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes\nServes: 4");

        recipeIngredients.setText("Ingredients:\n\n" +
                "- 1 cup chickpeas (kabuli chana), soaked overnight\n" +
                "- 2 cups thick yogurt (curd), whisked\n" +
                "- 2 tbsp ghee (clarified butter)\n" +
                "- 1 tsp cumin seeds\n" +
                "- 1/2 tsp mustard seeds\n" +
                "- 2 green cardamoms\n" +
                "- 2 cloves\n" +
                "- 1-inch cinnamon stick\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1 tsp coriander powder\n" +
                "- 1/2 tsp garam masala\n" +
                "- 1 tbsp besan (gram flour)\n" +
                "- Salt to taste\n" +
                "- Fresh coriander leaves for garnish");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare the Chana*\n" +
                "1. Pressure cook the soaked chickpeas with water and salt for 15-20 minutes until soft.\n\n" +
                "*Step 2: Prepare the Yogurt Mix*\n" +
                "2. In a bowl, whisk yogurt and add besan (gram flour) to prevent curdling.\n\n" +
                "*Step 3: Cook Madra*\n" +
                "3. Heat ghee in a pan and add cumin seeds, mustard seeds, cardamoms, cloves, and cinnamon.\n" +
                "4. Once aromatic, add turmeric, red chili powder, coriander powder, and salt.\n" +
                "5. Add the cooked chickpeas and mix well.\n" +
                "6. Lower the heat and add the whisked yogurt mixture, stirring continuously.\n" +
                "7. Let it simmer for 10-15 minutes until thick and creamy.\n" +
                "8. Sprinkle garam masala and garnish with fresh coriander leaves.\n" +
                "9. Serve hot with steamed rice.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 280 kcal\n" +
                "- Carbohydrates: 35g\n" +
                "- Protein: 12g\n" +
                "- Fat: 10g\n" +
                "- Fiber: 8g");

        // Set Image
        recipeImage.setImageResource(R.drawable.madra); // Ensure 'madra' image exists in drawable
    }
}