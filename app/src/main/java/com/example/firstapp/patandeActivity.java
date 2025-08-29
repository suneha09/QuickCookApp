package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class patandeActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_patande); // Link to the XML layout file

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
        recipeImage.setImageResource(R.drawable.patande);  // Ensure you have 'patande' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("PATANDE");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 20 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup rice flour\n" +
                "2. 1/2 cup sugar\n" +
                "3. 1/4 cup ghee\n" +
                "4. 1/2 cup water\n" +
                "5. 1/2 teaspoon cardamom powder\n" +
                "6. 1/4 teaspoon baking powder";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Mix rice flour, sugar, and baking powder.\n" +
                "2. Gradually add water to make a smooth batter.\n" +
                "3. Heat ghee in a pan and fry the batter until golden brown.\n" +
                "4. Drain excess ghee and serve warm with sugar syrup.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 200\nProtein: 4g\nCarbs: 45g\nFat: 6g";
        recipeNutrition.setText(nutrition);
    }
}