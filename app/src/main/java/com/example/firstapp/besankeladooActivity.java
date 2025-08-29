package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class besankeladooActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_besankeladoo);  // Reference to your XML layout

        // Initialize the UI components by finding them using their IDs
        recipeImage = findViewById(R.id.recipe_image);            // The ImageView for recipe image
        recipeTitle = findViewById(R.id.recipe_title);            // The recipe title TextView
        recipeDetails = findViewById(R.id.recipe_details);        // Recipe details (prep and cook time)
        recipeIngredients = findViewById(R.id.recipe_ingredients);  // Ingredients TextView
        recipeInstructions = findViewById(R.id.recipe_instructions); // Instructions TextView
        recipeNutrition = findViewById(R.id.recipe_nutrition);     // Nutritional information TextView

        // Populate the UI components with data
        populateRecipeData();
    }

    // Method to populate the recipe data into the UI components
    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.besankeladoo);  // Ensure you have an image named besankeladoo in your drawable folder

        // Set the recipe title
        recipeTitle.setText("BESAN KE LADOO");

        // Set recipe details (e.g., preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        // Set ingredients
        String ingredients = "1. 2 cups besan (gram flour)\n" +
                "2. 1 cup powdered sugar\n" +
                "3. 1/2 cup ghee\n" +
                "4. 1/4 cup water\n" +
                "5. 1/2 tsp cardamom powder\n" +
                "6. Chopped nuts (cashews, almonds)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and roast the besan on low flame.\n" +
                "2. Stir constantly until the besan turns golden brown and releases a nutty aroma.\n" +
                "3. Add powdered sugar and cardamom powder, mix well.\n" +
                "4. Add water to form a smooth dough.\n" +
                "5. Let the mixture cool slightly, then shape it into small round laddus.\n" +
                "6. Garnish with chopped nuts, and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 250\nProtein: 4g\nCarbs: 35g\nFat: 12g";
        recipeNutrition.setText(nutrition);
    }
}