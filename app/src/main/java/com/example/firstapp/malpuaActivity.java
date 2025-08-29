package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class malpuaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_malpua); // Link to the XML layout file

        // Initialize the UI components
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the recipe data into the UI
        populateRecipeData();
    }

    // Method to populate the recipe data into the UI
    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.malpua);  // Ensure you have 'malpua' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("MALPUA");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 15 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup all-purpose flour (maida)\n" +
                "2. 1/4 cup sugar\n" +
                "3. 1/4 cup coconut, grated\n" +
                "4. 1/4 cup water (or as needed)\n" +
                "5. 1/4 teaspoon cardamom powder\n" +
                "6. Ghee or oil for frying";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Mix flour, sugar, coconut, and cardamom powder in a bowl.\n" +
                "2. Add water gradually to form a smooth batter.\n" +
                "3. Heat ghee or oil in a pan and drop spoonfuls of the batter into the oil.\n" +
                "4. Fry until golden brown and crispy.\n" +
                "5. Drain excess oil and serve hot.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 200\nProtein: 4g\nCarbs: 30g\nFat: 9g";
        recipeNutrition.setText(nutrition);
    }
}