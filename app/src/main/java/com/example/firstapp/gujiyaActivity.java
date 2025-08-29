package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gujiyaActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_gujiya);  // Link the XML layout file

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
        recipeImage.setImageResource(R.drawable.gujiya);  // Ensure 'gujiya' is in the drawable folder

        // Set the recipe title
        recipeTitle.setText("GUJIYA");

        // Set recipe details (preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 20 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 2 cups all-purpose flour\n" +
                "2. 1/4 cup ghee\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/4 cup milk\n" +
                "5. 1/4 cup cashews\n" +
                "6. 1/4 cup raisins\n" +
                "7. 1 tsp cardamom powder\n" +
                "8. 1 tbsp rose water\n" +
                "9. Oil for frying";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Prepare the dough by mixing flour and ghee.\n" +
                "2. Roll out small portions of dough and fill with a sweet filling.\n" +
                "3. Shape into half-moon and seal the edges.\n" +
                "4. Heat oil and fry the gujiyas until golden brown.\n" +
                "5. Drain excess oil and serve hot.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 150\nProtein: 3g\nCarbs: 25g\nFat: 7g";
        recipeNutrition.setText(nutrition);
    }
}