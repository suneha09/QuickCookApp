package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bakarkhaniActivity extends AppCompatActivity {

    // Declare UI components
    private ImageView recipeImage;
    private TextView recipeTitle;
    private TextView recipeDetails;
    private TextView recipeIngredients;
    private TextView recipeInstructions;
    private TextView recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakarkhani); // Set the layout for the activity

        // Initialize the UI components by finding them by their IDs
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the UI components with data
        populateRecipeData();
    }

    // Method to populate the recipe details
    private void populateRecipeData() {
        // Set the recipe image (Make sure you have the image in the 'res/drawable' folder)
        recipeImage.setImageResource(R.drawable.bakarkhani); // Replace with your image resource

        // Set the recipe title
        recipeTitle.setText("BAKARKHANI");

        // Set the recipe details (e.g., preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 2 cups all-purpose flour\n" +
                "2. 1/4 cup ghee\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/2 tsp cardamom powder\n" +
                "5. A pinch of salt\n" +
                "6. 1/4 cup water\n" +
                "7. Ghee for frying";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Mix the flour and cardamom powder in a bowl.\n" +
                "2. Add ghee and mix well to form a dough.\n" +
                "3. Roll the dough into small balls and flatten them.\n" +
                "4. Fry the Bakarkhani in ghee until golden brown.\n" +
                "5. Sprinkle sugar on top and let it cool.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 200\nProtein: 4g\nCarbs: 30g\nFat: 10g";
        recipeNutrition.setText(nutrition);
    }
}