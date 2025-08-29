package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class jalebiActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_jalebi); // Link to your XML layout file

        // Initialize the UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Call method to populate the recipe data into the UI
        populateRecipeData();
    }

    // Method to populate the recipe data
    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.jalebi);  // Make sure you have a 'jalebi' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("JALEBI");

        // Set recipe details like preparation time and cooking time
        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 30 minutes");

        // Set the ingredients list
        String ingredients = "1. 1 cup all-purpose flour\n" +
                "2. 1/4 cup cornstarch\n" +
                "3. 1/2 tsp baking soda\n" +
                "4. 1/4 tsp turmeric powder\n" +
                "5. 1/2 cup yogurt\n" +
                "6. 1/2 cup warm water\n" +
                "7. Ghee or oil for frying\n" +
                "8. 2 cups sugar (for syrup)\n" +
                "9. 1/2 tsp cardamom powder\n" +
                "10. Rose water (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions for making Jalebi
        String instructions = "1. Mix the flour, cornstarch, baking soda, and turmeric in a bowl.\n" +
                "2. Add yogurt and warm water to make a smooth batter.\n" +
                "3. Rest the batter for 10-15 minutes.\n" +
                "4. Heat ghee or oil in a pan for frying.\n" +
                "5. Using a piping bag, make spiral shapes in the hot oil.\n" +
                "6. Fry the Jalebi until golden and crispy.\n" +
                "7. Dip the fried Jalebi in sugar syrup flavored with cardamom and rose water.\n" +
                "8. Serve hot.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 200\nProtein: 2g\nCarbs: 50g\nFat: 8g";
        recipeNutrition.setText(nutrition);
    }
}