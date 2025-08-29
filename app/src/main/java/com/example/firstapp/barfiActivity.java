package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class barfiActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_barfi);  // Reference to your XML layout

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
        recipeImage.setImageResource(R.drawable.barfi);  // Ensure you have an image named barfi in your drawable folder

        // Set the recipe title
        recipeTitle.setText("BARFI");

        // Set recipe details (e.g., preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set ingredients
        String ingredients = "1. 2 cups milk powder\n" +
                "2. 1/2 cup sugar\n" +
                "3. 1/4 cup ghee\n" +
                "4. 1/4 cup milk\n" +
                "5. 1/2 tsp cardamom powder\n" +
                "6. Chopped nuts (cashews, almonds)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and add milk and sugar.\n" +
                "2. Stir continuously until the mixture thickens.\n" +
                "3. Add milk powder and mix until smooth.\n" +
                "4. Add cardamom powder and chopped nuts.\n" +
                "5. Cook for 10 more minutes and then pour into a greased tray.\n" +
                "6. Allow to cool, cut into pieces, and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 200\nProtein: 3g\nCarbs: 35g\nFat: 8g";
        recipeNutrition.setText(nutrition);
    }
}