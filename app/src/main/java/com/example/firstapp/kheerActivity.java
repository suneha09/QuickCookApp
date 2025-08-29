package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kheerActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_kheer); // Link to your XML layout file

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
        recipeImage.setImageResource(R.drawable.kheer);  // Make sure you have 'kheer' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("KHEER");

        // Set the recipe details (e.g., preparation time, cooking time)
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 30 minutes");

        // Set the ingredients
        String ingredients = "1. 1/2 cup rice\n" +
                "2. 4 cups milk\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/4 cup condensed milk\n" +
                "5. 1/4 tsp cardamom powder\n" +
                "6. 10-12 cashews\n" +
                "7. 10-12 almonds\n" +
                "8. 1-2 tbsp ghee";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. Wash and soak rice for 30 minutes.\n" +
                "2. Heat ghee in a pan, add cashews and almonds, and fry until golden.\n" +
                "3. In the same pan, add milk and bring it to a boil.\n" +
                "4. Add soaked rice and cook on low heat, stirring occasionally.\n" +
                "5. Once the rice is cooked, add sugar and cardamom powder.\n" +
                "6. Stir in condensed milk and cook for 5 minutes.\n" +
                "7. Garnish with fried nuts and serve hot or chilled.";
        recipeInstructions.setText(instructions);

        // Set the nutritional information
        String nutrition = "Calories: 250\nProtein: 6g\nCarbs: 38g\nFat: 10g";
        recipeNutrition.setText(nutrition);
    }
}