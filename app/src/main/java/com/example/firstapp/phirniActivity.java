package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class phirniActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_phirni); // Link the XML layout

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
        recipeImage.setImageResource(R.drawable.phirni);  // Ensure you have 'phirni' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("PHIRNI");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 20 minutes");

        // Set the ingredients
        String ingredients = "1. 1/2 cup rice flour\n" +
                "2. 1/2 cup sugar\n" +
                "3. 4 cups milk\n" +
                "4. 1/4 cup water\n" +
                "5. 1/2 teaspoon cardamom powder\n" +
                "6. 1 tablespoon rose water";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. In a pan, boil the milk and water.\n" +
                "2. Add rice flour and sugar, stirring constantly until it thickens.\n" +
                "3. Add cardamom powder and rose water.\n" +
                "4. Let the mixture cool, then refrigerate for 1 hour.\n" +
                "5. Serve chilled, garnished with pistachios.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 180\nProtein: 6g\nCarbs: 35g\nFat: 3g";
        recipeNutrition.setText(nutrition);
    }
}