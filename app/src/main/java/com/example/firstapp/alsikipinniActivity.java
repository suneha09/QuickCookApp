package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alsikipinniActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_alsikipinni); // Set the layout for the activity

        // Initialize UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the UI with recipe data
        populateRecipeData();
    }

    // Method to populate the UI with recipe data
    private void populateRecipeData() {
        // Set the recipe image (Make sure you have the image in the 'res/drawable' folder)
        recipeImage.setImageResource(R.drawable.alsikipinni); // Replace with your image resource

        // Set the recipe title
        recipeTitle.setText("ALSI KI PINNI");

        // Set the recipe details (preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. Flax Seeds (Alsi) - 1 cup\n" +
                "2. Ghee - 1/4 cup\n" +
                "3. Sugar - 1/2 cup\n" +
                "4. Cardamom powder - 1/2 tsp\n" +
                "5. Cashews and almonds for garnishing";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Dry roast the flax seeds until they are slightly brown.\n" +
                "2. In another pan, heat ghee and add the roasted flax seeds.\n" +
                "3. Add sugar and cardamom powder. Stir continuously.\n" +
                "4. Cook until the mixture thickens and forms a dough-like consistency.\n" +
                "5. Allow it to cool, then roll into small balls and garnish with nuts.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 350\nProtein: 8g\nCarbs: 40g\nFat: 20g";
        recipeNutrition.setText(nutrition);
    }
}