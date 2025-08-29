package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class kashmirizardapulaoActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_kashmirizardapulao); // Link to your XML layout file

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
        recipeImage.setImageResource(R.drawable.kashmirizardapulao);  // Ensure you have a 'kashmirizardapulao' image in the drawable folder

        // Set the recipe title
        recipeTitle.setText("KASHMIRI ZARDA PULAO");

        // Set recipe details like preparation time and cooking time
        recipeDetails.setText("Preparation Time: 15 minutes\nCooking Time: 40 minutes");

        // Set the ingredients list
        String ingredients = "1. 1 cup basmati rice\n" +
                "2. 1/2 cup mixed nuts (cashews, almonds, raisins)\n" +
                "3. 2 tbsp ghee\n" +
                "4. 1/2 tsp saffron strands\n" +
                "5. 1/4 cup sugar\n" +
                "6. 1/2 tsp cardamom powder\n" +
                "7. 1/2 cup milk\n" +
                "8. 2 cups water\n" +
                "9. Salt to taste";
        recipeIngredients.setText(ingredients);

        // Set the instructions for making Kashmir Zarda Pulao
        String instructions = "1. Wash the rice and soak it for 30 minutes.\n" +
                "2. Heat ghee in a pan and fry the nuts until golden brown. Remove them and set aside.\n" +
                "3. In the same pan, add saffron soaked in milk, cardamom powder, and sugar. Stir until dissolved.\n" +
                "4. Add water and bring to a boil. Add the soaked rice and cook until soft.\n" +
                "5. Once the rice is cooked, fluff with a fork.\n" +
                "6. Garnish with fried nuts and serve hot.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 250\nProtein: 5g\nCarbs: 45g\nFat: 8g";
        recipeNutrition.setText(nutrition);
    }
}