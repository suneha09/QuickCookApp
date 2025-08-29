package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Amritsari_naanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amritsari_naan); // Ensure XML layout file matches.

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Amritsari Naan");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes");

        recipeIngredients.setText("Ingredients:\n\nFor Naan Dough:\n" +
                "- 2 cups all-purpose flour (maida)\n" +
                "- 1/2 tsp baking powder\n" +
                "- 1/4 tsp baking soda\n" +
                "- 1/2 cup curd\n" +
                "- 1/2 tsp salt\n" +
                "- Water (as needed)\n" +
                "- Butter or ghee for roasting\n\n" +
                "For Stuffing:\n" +
                "- 1 cup boiled & mashed potatoes\n" +
                "- 2 tbsp finely chopped onions\n" +
                "- 1 tbsp chopped coriander leaves\n" +
                "- 1/2 tsp cumin seeds\n" +
                "- 1/2 tsp red chili powder\n" +
                "- 1/2 tsp garam masala\n" +
                "- 1/2 tsp amchur (dry mango) powder\n" +
                "- Salt to taste");

        recipeInstructions.setText("Instructions:\n\nFor Dough:\n" +
                "1. In a mixing bowl, combine flour, baking powder, baking soda, curd, and salt.\n" +
                "2. Add water gradually and knead into a soft dough. Cover and let it rest for 1 hour.\n\n" +
                "For Stuffing:\n" +
                "1. Mix mashed potatoes, onions, coriander, cumin, chili powder, garam masala, amchur, and salt.\n" +
                "2. Divide stuffing into small portions.\n\n" +
                "For Making Naan:\n" +
                "1. Take a dough ball, roll it out slightly, and place stuffing in the center.\n" +
                "2. Seal the edges and roll again gently into a round shape.\n" +
                "3. Heat a tawa, cook the naan on one side until bubbles appear.\n" +
                "4. Flip and cook until golden brown, brushing with butter or ghee.\n" +
                "5. Serve hot with chole or curd.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 280 kcal\n" +
                "- Carbohydrates: 45g\n" +
                "- Protein: 6g\n" +
                "- Fat: 7g");

        // Set Image
        recipeImage.setImageResource(R.drawable.amritsari_naan); // Ensure you have amritsari_naan image in drawable
    }
}