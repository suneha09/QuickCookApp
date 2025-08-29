package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class meethechawalActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_meethechawal); // Link to the XML layout file

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
        recipeImage.setImageResource(R.drawable.meethechawal);  // Ensure you have 'meethechawal' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("MEETHE CHAWAL");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 25 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup rice\n" +
                "2. 1/2 cup sugar\n" +
                "3. 1/4 cup ghee\n" +
                "4. 1/4 cup cashews\n" +
                "5. 1/4 cup raisins\n" +
                "6. 1/2 teaspoon cardamom powder\n" +
                "7. 2 cups water\n" +
                "8. 1/2 cup milk";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Wash the rice and cook it in water until soft.\n" +
                "2. In a pan, heat ghee and fry cashews and raisins.\n" +
                "3. Add sugar, milk, and cardamom powder to the pan and mix.\n" +
                "4. Add the cooked rice to the mixture and stir well.\n" +
                "5. Let it simmer for 5 minutes, then serve warm.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 250\nProtein: 5g\nCarbs: 50g\nFat: 8g";
        recipeNutrition.setText(nutrition);
    }
}