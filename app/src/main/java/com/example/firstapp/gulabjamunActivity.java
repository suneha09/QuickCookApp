package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class gulabjamunActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_gulabjamun);  // Link the XML layout file

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
        recipeImage.setImageResource(R.drawable.gulabjamun);  // Ensure 'gulabjamun' is in the drawable folder

        // Set the recipe title
        recipeTitle.setText("GULAB JAMUN");

        // Set recipe details (preparation time and cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup milk powder\n" +
                "2. 1/4 cup all-purpose flour\n" +
                "3. 1/4 tsp baking soda\n" +
                "4. 2 tbsp ghee\n" +
                "5. 1/4 cup milk\n" +
                "6. 1/2 tsp cardamom powder\n" +
                "7. 1/4 cup sugar\n" +
                "8. 2 cups water\n" +
                "9. 1 tbsp rose water\n" +
                "10. Oil for frying";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. In a bowl, mix milk powder, all-purpose flour, baking soda, and ghee.\n" +
                "2. Add milk and knead the dough until smooth.\n" +
                "3. Shape the dough into small balls.\n" +
                "4. Heat oil and fry the balls on low-medium heat until golden brown.\n" +
                "5. Prepare sugar syrup by boiling sugar and water with cardamom powder.\n" +
                "6. Soak the fried balls in sugar syrup for at least 30 minutes.\n" +
                "7. Garnish with rose water and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 120\nProtein: 2g\nCarbs: 18g\nFat: 5g";
        recipeNutrition.setText(nutrition);
    }
}