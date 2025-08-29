package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ladooActivity extends AppCompatActivity {

    // Declare the UI components
    private ImageView recipeImage;
    private TextView recipeTitle;
    private TextView recipeDetails;
    private TextView recipeIngredients;
    private TextView recipeInstructions;
    private TextView recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladoo); // Link to your XML layout file

        // Initialize the UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the recipe data into the UI
        populateRecipeData();
    }

    // Method to populate the recipe data into the UI
    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.ladoo);  // Ensure you have 'ladoo' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("LADOO");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup besan (gram flour)\n" +
                "2. 1/4 cup ghee\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/4 teaspoon cardamom powder\n" +
                "5. 2 tablespoons chopped nuts (cashews, almonds)\n" +
                "6. 1/4 cup milk (if needed)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and add besan (gram flour).\n" +
                "2. Roast the flour on low flame until it turns golden brown and gives a pleasant aroma.\n" +
                "3. Add sugar and cardamom powder, and mix well.\n" +
                "4. Add milk (if needed) to form a dough-like consistency.\n" +
                "5. Let the mixture cool down slightly and then shape it into small round balls (ladoo).\n" +
                "6. Garnish with chopped nuts and serve.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 150\nProtein: 4g\nCarbs: 20g\nFat: 8g";
        recipeNutrition.setText(nutrition);
    }
}