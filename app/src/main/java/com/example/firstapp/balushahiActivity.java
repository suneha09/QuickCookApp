package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class balushahiActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_balushahi);  // Reference to your XML layout

        // Initialize UI components by finding them using their ID
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
        recipeImage.setImageResource(R.drawable.balushahi);  // Ensure you have an image named balushahi in your drawable folder

        // Set the recipe title
        recipeTitle.setText("BALUSHAHI");

        // Set recipe details (e.g., preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 25 minutes");

        // Set ingredients
        String ingredients = "1. 2 cups all-purpose flour\n" +
                "2. 1/2 cup ghee\n" +
                "3. 1/4 cup yogurt\n" +
                "4. 1/2 teaspoon baking powder\n" +
                "5. 1/4 cup sugar\n" +
                "6. Water as needed\n" +
                "7. Ghee for frying\n" +
                "8. Powdered sugar for garnish";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Mix the flour, ghee, baking powder, and yogurt.\n" +
                "2. Add water gradually and knead the dough.\n" +
                "3. Divide the dough into small balls and flatten them.\n" +
                "4. Heat ghee in a pan and fry the dough pieces until golden brown.\n" +
                "5. Soak the fried pieces in sugar syrup.\n" +
                "6. Garnish with powdered sugar and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 300\nProtein: 4g\nCarbs: 35g\nFat: 18g";
        recipeNutrition.setText(nutrition);
    }
}