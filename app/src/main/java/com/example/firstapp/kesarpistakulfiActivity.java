package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kesarpistakulfiActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_kesarpistakulfi); // Link to your XML layout file

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
        recipeImage.setImageResource(R.drawable.kesarpistakulfi);  // Make sure you have 'kesarpistakulfi' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("KESAR PISTA KULFI");

        // Set the recipe details (e.g., preparation time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 1 cup milk\n" +
                "2. 1/2 cup cream\n" +
                "3. 1/4 cup sugar\n" +
                "4. 1 tbsp saffron strands\n" +
                "5. 2 tbsp pistachios (finely chopped)\n" +
                "6. 1/2 tsp cardamom powder\n" +
                "7. 2 tbsp condensed milk\n" +
                "8. 1 tbsp rose water (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Soak saffron in warm milk for 15 minutes.\n" +
                "2. Heat milk and cream in a pan and bring it to a boil.\n" +
                "3. Add sugar and saffron milk. Stir well.\n" +
                "4. Add pistachios and cardamom powder, and mix.\n" +
                "5. Let the mixture cool to room temperature.\n" +
                "6. Pour into kulfi molds and freeze for 4-6 hours.\n" +
                "7. Serve chilled, garnished with extra pistachios and saffron strands.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 350\nProtein: 7g\nCarbs: 28g\nFat: 25g";
        recipeNutrition.setText(nutrition);
    }
}