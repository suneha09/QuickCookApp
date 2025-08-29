package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class sheeraActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_sheera); // Link the XML layout

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
        recipeImage.setImageResource(R.drawable.sheera);  // Ensure you have 'sheera' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("SHEERA");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 20 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup semolina (sooji)\n" +
                "2. 1/2 cup ghee (clarified butter)\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/2 cup milk\n" +
                "5. 1/4 cup water\n" +
                "6. 1/4 teaspoon cardamom powder\n" +
                "7. 1/4 cup chopped nuts (cashews, almonds)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Heat ghee in a pan.\n" +
                "2. Add semolina and roast it until golden brown.\n" +
                "3. In a separate pan, heat milk and water together.\n" +
                "4. Add the hot milk-water mixture to the roasted semolina.\n" +
                "5. Stir and cook for 3-4 minutes.\n" +
                "6. Add sugar, cardamom powder, and chopped nuts.\n" +
                "7. Cook until the mixture thickens and the ghee separates.\n" +
                "8. Serve hot.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 250\nProtein: 4g\nCarbs: 30g\nFat: 14g";
        recipeNutrition.setText(nutrition);
    }
}