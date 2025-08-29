package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sundpanjiriActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_sundpanjiri);  // Link to the XML layout file

        // Initialize UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the recipe data into the UI components
        populateRecipeData();
    }

    // Method to populate recipe data into the UI components
    private void populateRecipeData() {
        // Set the recipe image (ensure the image is available in res/drawable)
        recipeImage.setImageResource(R.drawable.sundpanjiri);  // 'sundpanjiri' image in res/drawable

        // Set the recipe title
        recipeTitle.setText("SUND PANJIRI");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes");

        // Set the ingredients
        String ingredients = "1. 2 cups flour\n" +
                "2. 1/2 cup ghee\n" +
                "3. 1/4 cup sugar\n" +
                "4. 1/4 teaspoon cardamom powder\n" +
                "5. 1/2 cup milk\n" +
                "6. 1/4 cup nuts (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan.\n" +
                "2. Add flour and cook on low heat until golden.\n" +
                "3. Add sugar and mix well.\n" +
                "4. Add cardamom powder and mix.\n" +
                "5. Gradually add milk and continue to stir.\n" +
                "6. Garnish with nuts and serve warm.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 300\nProtein: 5g\nCarbs: 50g\nFat: 15g";
        recipeNutrition.setText(nutrition);
    }
}