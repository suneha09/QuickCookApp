package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pinniActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_pinni); // Link the XML layout

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
        recipeImage.setImageResource(R.drawable.pinni);  // Ensure you have 'pinni' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("PINNI");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup whole wheat flour\n" +
                "2. 1/2 cup ghee (clarified butter)\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/2 cup milk\n" +
                "5. 1/4 cup chopped nuts (cashews, almonds)\n" +
                "6. 1/2 tsp cardamom powder";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan.\n" +
                "2. Add the whole wheat flour and roast it on low flame until it turns golden brown.\n" +
                "3. Add milk and sugar and stir well.\n" +
                "4. Cook for a few more minutes until the mixture thickens.\n" +
                "5. Add cardamom powder and chopped nuts.\n" +
                "6. Shape the mixture into small balls (pinnis) and let them cool.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 250\nProtein: 5g\nCarbs: 35g\nFat: 15g";
        recipeNutrition.setText(nutrition);
    }
}