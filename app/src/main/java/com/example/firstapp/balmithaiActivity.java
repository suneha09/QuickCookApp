package com.example.firstapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class balmithaiActivity extends AppCompatActivity {

    private ImageView recipeImage;
    private TextView recipeTitle;
    private TextView recipeDetails;
    private TextView recipeIngredients;
    private TextView recipeInstructions;
    private TextView recipeNutrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balmithai); // Make sure this matches the name of your XML file

        // Bind views from XML
        recipeImage = findViewById(R.id.recipe_image);
        recipeTitle = findViewById(R.id.recipe_title);
        recipeDetails = findViewById(R.id.recipe_details);
        recipeIngredients = findViewById(R.id.recipe_ingredients);
        recipeInstructions = findViewById(R.id.recipe_instructions);
        recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Populate the views with the data
        populateRecipeData();
    }

    private void populateRecipeData() {
        // Set the recipe image
        recipeImage.setImageResource(R.drawable.balmithai);  // Ensure the image is in the drawable folder

        // Set the recipe title
        recipeTitle.setText("Gol Gappe");

        // Set recipe details like preparation and cooking time
        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 15 minutes");

        // Set the ingredients
        String ingredients = "1. Semolina (Suji) - 1 cup\n" +
                "2. Water - 1/2 cup\n" +
                "3. Salt - 1/2 tsp\n" +
                "4. Oil for frying\n" +
                "5. Tamarind chutney";
        recipeIngredients.setText(ingredients);

        // Set the instructions
        String instructions = "1. In a bowl, mix semolina and water to form a dough.\n" +
                "2. Roll into small balls and flatten.\n" +
                "3. Heat oil and fry until golden brown.\n" +
                "4. Stuff with tamarind chutney and serve.";
        recipeInstructions.setText(instructions);

        // Set nutritional information
        String nutrition = "Calories: 250\nProtein: 5g\nCarbs: 40g\nFat: 10g";
        recipeNutrition.setText(nutrition);
    }
}