package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class akhrotihalwaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_akhrotihalwa); // Set the layout for the activity

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
        recipeImage.setImageResource(R.drawable.akhrotihalwa); // Replace with your image resource

        // Set the recipe title
        recipeTitle.setText("AKHROTI HALWA");

        // Set the recipe details (preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes");

        // Set the ingredients
        String ingredients = "1. Walnuts (Akhrot) - 1 cup\n" +
                "2. Ghee - 1/4 cup\n" +
                "3. Sugar - 1/2 cup\n" +
                "4. Water - 1.5 cups\n" +
                "5. Cardamom powder - 1/2 tsp\n" +
                "6. Cashews, almonds, and raisins for garnishing";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan and roast walnuts until golden brown.\n" +
                "2. Add water and cook the walnut mixture until it thickens.\n" +
                "3. Add sugar and cardamom powder. Stir until it forms a soft texture.\n" +
                "4. Garnish with cashews, almonds, and raisins. Serve hot.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 400\nProtein: 8g\nCarbs: 50g\nFat: 25g";
        recipeNutrition.setText(nutrition);
    }
}