package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sheermalActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_sheermal); // Link to the XML layout file

        // Initialize UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the recipe data
        populateRecipeData();
    }

    // Method to populate recipe data into the UI components
    private void populateRecipeData() {
        // Set the recipe image (ensure the image is available in the drawable folder)
        recipeImage.setImageResource(R.drawable.sheermal);  // 'sheermal' image in res/drawable

        // Set the recipe title
        recipeTitle.setText("SHEERAMAL");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup flour\n" +
                "2. 1/4 cup ghee\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/2 cup milk\n" +
                "5. 1/4 cup water\n" +
                "6. 1/4 teaspoon cardamom powder\n" +
                "7. 1/4 cup chopped nuts (almonds, cashews)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Preheat the oven.\n" +
                "2. In a bowl, mix flour and ghee.\n" +
                "3. Add sugar, milk, and water to the mix.\n" +
                "4. Add cardamom powder and nuts.\n" +
                "5. Knead the dough and shape it.\n" +
                "6. Bake until golden brown.\n" +
                "7. Serve warm with tea.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 300\nProtein: 6g\nCarbs: 45g\nFat: 15g";
        recipeNutrition.setText(nutrition);
    }
}