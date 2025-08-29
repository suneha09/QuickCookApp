package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class arsaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_arsa); // Set the layout for the activity

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
        recipeImage.setImageResource(R.drawable.arsa); // Replace with your image resource

        // Set the recipe title
        recipeTitle.setText("ARSA");

        // Set the recipe details (preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. Wheat flour - 1 cup\n" +
                "2. Ghee - 1/4 cup\n" +
                "3. Sugar - 1/2 cup\n" +
                "4. Cardamom powder - 1/2 tsp\n" +
                "5. Cashews and almonds for garnishing";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and roast the wheat flour till it turns golden brown.\n" +
                "2. Add sugar and cardamom powder and mix well.\n" +
                "3. Add water little by little until it forms a dough-like consistency.\n" +
                "4. Let the mixture cool and then shape it into small balls.\n" +
                "5. Garnish with cashews and almonds.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 250\nProtein: 6g\nCarbs: 30g\nFat: 12g";
        recipeNutrition.setText(nutrition);
    }
}