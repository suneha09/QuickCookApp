package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class paranthasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paranthas); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Different Types of Paranthas");

        recipeDetails.setText("Preparation Time: 10-15 minutes\nCooking Time: 5-10 minutes per parantha");

        recipeIngredients.setText("Common Ingredients:\n\n" +
                "- 2 cups whole wheat flour\n" +
                "- Water (as required for dough)\n" +
                "- Ghee or oil for cooking\n" +
                "- Salt to taste\n\n" +
                "Varieties of Paranthas:\n\n" +
                "1. *Aloo Parantha (Potato Stuffed)*\n" +
                "   - 2 boiled potatoes (mashed)\n" +
                "   - 1 tsp cumin powder, 1 tsp coriander powder\n" +
                "   - 1 green chili (chopped)\n" +
                "   - Salt & garam masala to taste\n\n" +
                "2. *Paneer Parantha (Cottage Cheese Stuffed)*\n" +
                "   - 1 cup grated paneer\n" +
                "   - 1 tsp black pepper, 1 tsp chaat masala\n" +
                "   - 1 tbsp coriander leaves (chopped)\n\n" +
                "3. *Methi Parantha (Fenugreek Leaves)*\n" +
                "   - 1/2 cup fresh methi leaves (chopped)\n" +
                "   - 1/2 tsp turmeric powder, 1 tsp carom seeds (ajwain)\n\n" +
                "4. *Lachha Parantha (Layered Parantha)*\n" +
                "   - 2 tbsp ghee (for layering)\n" +
                "   - 1 tsp salt\n\n" +
                "5. *Gobhi Parantha (Cauliflower Stuffed)*\n" +
                "   - 1 cup grated cauliflower\n" +
                "   - 1 tsp ginger paste, 1 tsp green chili paste\n\n" +
                "6. *Onion Parantha (Pyaaz Parantha)*\n" +
                "   - 1 finely chopped onion\n" +
                "   - 1 tsp red chili powder, 1 tsp coriander leaves\n\n" +
                "7. *Mix Veg Parantha*\n" +
                "   - 1/2 cup mixed grated veggies (carrot, capsicum, beetroot)\n" +
                "   - 1 tsp roasted cumin powder");

        recipeInstructions.setText("Instructions:\n\n" +
                "1. Prepare a soft dough by mixing wheat flour, salt, and water.\n" +
                "2. Divide dough into equal portions and roll into small balls.\n" +
                "3. For stuffed paranthas, flatten a ball, add stuffing, seal edges, and roll again.\n" +
                "4. Heat a tawa (griddle) and cook the parantha on both sides using ghee or oil.\n" +
                "5. Serve hot with curd, pickle, or butter.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 250-350 kcal (varies by type)\n" +
                "- Carbohydrates: 40g\n" +
                "- Protein: 8g\n" +
                "- Fat: 10g\n" +
                "- Fiber: 5g");

        // Set Image
        recipeImage.setImageResource(R.drawable.paranthas); // Ensure you have 'paranthas' image in drawable
    }
}