package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class pakorasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakoras); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Different Types of Pakoras");

        recipeDetails.setText("Preparation Time: 10-15 minutes\nCooking Time: 5-10 minutes per batch");

        recipeIngredients.setText("Common Ingredients:\n\n" +
                "- 1 cup besan (gram flour)\n" +
                "- 1/2 cup water (adjust for batter consistency)\n" +
                "- 1 tsp red chili powder\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1/2 tsp carom seeds (ajwain)\n" +
                "- Salt to taste\n" +
                "- Oil for deep frying\n\n" +
                "Varieties of Pakoras:\n\n" +
                "1. *Aloo Pakora (Potato Fritters)*\n" +
                "   - 2 medium potatoes (thinly sliced)\n" +
                "   - Sprinkle chaat masala after frying\n\n" +
                "2. *Paneer Pakora (Cottage Cheese Fritters)*\n" +
                "   - 1 cup paneer cubes\n" +
                "   - Add black pepper and chaat masala to taste\n\n" +
                "3. *Pyaz Pakora (Onion Fritters)*\n" +
                "   - 2 medium onions (thinly sliced)\n" +
                "   - Add 1 tsp green chili (chopped)\n\n" +
                "4. *Palak Pakora (Spinach Fritters)*\n" +
                "   - 1 cup spinach leaves (whole or chopped)\n" +
                "   - Great with mint chutney\n\n" +
                "5. *Gobhi Pakora (Cauliflower Fritters)*\n" +
                "   - 1 cup small cauliflower florets\n" +
                "   - Boil slightly before dipping in batter\n\n" +
                "6. *Mirchi Pakora (Chili Fritters)*\n" +
                "   - 4 large green chilies (slit & deseeded)\n" +
                "   - Stuff with a pinch of amchur (dry mango powder)\n\n" +
                "7. *Bread Pakora*\n" +
                "   - 4 bread slices (cut into triangles)\n" +
                "   - Can be stuffed with potato mixture");

        recipeInstructions.setText("Instructions:\n\n" +
                "1. In a mixing bowl, combine besan, red chili powder, turmeric, ajwain, and salt.\n" +
                "2. Slowly add water and mix to form a thick, smooth batter.\n" +
                "3. Heat oil in a deep pan for frying.\n" +
                "4. Dip each vegetable/paneer/bread slice into the batter and coat evenly.\n" +
                "5. Deep fry until golden brown and crispy.\n" +
                "6. Remove and place on paper towels to absorb excess oil.\n" +
                "7. Serve hot with mint chutney or tomato ketchup.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 200-300 kcal (varies by type)\n" +
                "- Carbohydrates: 30g\n" +
                "- Protein: 6g\n" +
                "- Fat: 12g\n" +
                "- Fiber: 4g");

        // Set Image
        recipeImage.setImageResource(R.drawable.pakoras); // Ensure you have 'pakoras' image in drawable
    }
}