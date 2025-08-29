package com.example.firstapp;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class jhangorekikheerActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_jhangorekikheer); // Link to your XML layout file

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
        recipeImage.setImageResource(R.drawable.jhangorekikheer);  // Make sure you have a 'jhangorekikheer' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("JHANGORE KI KHEER");

        // Set recipe details like preparation time and cooking time
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 40 minutes");

        // Set the ingredients list
        String ingredients = "1. 1 cup jhangora (barnyard millet)\n" +
                "2. 1/4 cup rice\n" +
                "3. 1/2 cup sugar\n" +
                "4. 1/2 cup milk\n" +
                "5. 1/4 cup water\n" +
                "6. 1/4 cup ghee\n" +
                "7. 1/2 tsp cardamom powder\n" +
                "8. Chopped nuts (almonds, cashews, pistachios)\n" +
                "9. Saffron strands (optional)";
        recipeIngredients.setText(ingredients);

        // Set the instructions for making Jhangore Ki Kheer
        String instructions = "1. Wash the jhangora and rice together.\n" +
                "2. In a pressure cooker, heat ghee and roast the jhangora and rice for 2-3 minutes.\n" +
                "3. Add water and cook for 3-4 whistles until soft.\n" +
                "4. Once cooked, add milk and bring to a boil.\n" +
                "5. Add sugar and cardamom powder. Stir well.\n" +
                "6. Simmer for 10 minutes until the kheer thickens.\n" +
                "7. Garnish with chopped nuts and saffron.\n" +
                "8. Serve hot or cold.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 150\nProtein: 3g\nCarbs: 30g\nFat: 6g";
        recipeNutrition.setText(nutrition);
    }
}