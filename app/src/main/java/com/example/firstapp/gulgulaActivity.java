package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gulgulaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_gulgula);  // Link the XML layout file

        // Initialize the UI components using findViewById
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the recipe data
        populateRecipeData();
    }

    // Method to populate the recipe data into the UI components
    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.gulgula);  // Ensure 'gulgula' is in the drawable folder

        // Set the recipe title
        recipeTitle.setText("GULGULA");

        // Set recipe details (preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 25 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup flour\n" +
                "2. 1/2 tsp baking soda\n" +
                "3. 1/4 tsp cardamom powder\n" +
                "4. 2 tbsp sugar\n" +
                "5. 1/2 cup water\n" +
                "6. 1/4 cup yogurt\n" +
                "7. Oil for frying";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. In a bowl, mix flour, baking soda, cardamom powder, and sugar.\n" +
                "2. Add yogurt and water to form a dough.\n" +
                "3. Roll the dough into small balls.\n" +
                "4. Heat oil in a pan and fry the balls until golden brown.\n" +
                "5. Drain excess oil and serve hot.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 150\nProtein: 3g\nCarbs: 25g\nFat: 7g";
        recipeNutrition.setText(nutrition);
    }
}