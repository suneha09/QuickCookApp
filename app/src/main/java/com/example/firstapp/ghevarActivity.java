package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ghevarActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_ghevar);  // Link to the XML layout

        // Initialize the UI components using findViewById
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the UI components with data
        populateRecipeData();
    }

    // Method to populate the recipe data into the UI components
    private void populateRecipeData() {
        // Set the recipe image (ensure the image is available in the drawable folder)
        recipeImage.setImageResource(R.drawable.ghevar);  // Ensure this image exists in res/drawable folder

        // Set the recipe title
        recipeTitle.setText("GHEVAR");

        // Set recipe details (Preparation and Cooking Time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set ingredients
        String ingredients = "1. 1 cup all-purpose flour\n" +
                "2. 1/4 cup ghee\n" +
                "3. 1/2 cup milk\n" +
                "4. 1/2 tsp cardamom powder\n" +
                "5. 1/2 cup sugar\n" +
                "6. Water as needed\n" +
                "7. Chopped nuts (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Mix the flour and ghee to form a smooth dough.\n" +
                "2. Heat water and milk to make a smooth batter.\n" +
                "3. Fry the dough in hot ghee to make crisp layers.\n" +
                "4. Prepare sugar syrup and pour over the fried ghevar.\n" +
                "5. Garnish with chopped nuts and cardamom powder.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 250\nProtein: 5g\nCarbs: 30g\nFat: 10g";
        recipeNutrition.setText(nutrition);
    }
}