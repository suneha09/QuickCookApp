package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class boondikameethaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_boondikameetha);  // Link to the XML layout

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
        recipeImage.setImageResource(R.drawable.boondikameetha);  // Ensure this image exists in res/drawable folder

        // Set the recipe title
        recipeTitle.setText("BOONDI KA MEETHA");

        // Set recipe details (Preparation and Cooking Time)
        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 25 minutes");

        // Set ingredients
        String ingredients = "1. 1 cup boondi\n" +
                "2. 1/2 cup sugar\n" +
                "3. 1/4 cup ghee\n" +
                "4. 1/4 cup milk\n" +
                "5. 1/2 tsp cardamom powder\n" +
                "6. Chopped nuts (almonds, cashews)\n" +
                "7. Saffron strands (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and add the boondi to it.\n" +
                "2. Add milk, sugar, and cardamom powder, stirring well.\n" +
                "3. Cook for a few minutes until the mixture thickens.\n" +
                "4. Add chopped nuts and mix thoroughly.\n" +
                "5. Garnish with saffron strands (optional) and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 300\nProtein: 4g\nCarbs: 40g\nFat: 15g";
        recipeNutrition.setText(nutrition);
    }
}