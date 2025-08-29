package com.example.firstapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class himachali_dhaamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachali_dhaam); // Ensure XML layout file matches

        // Initialize UI elements
        ImageView recipeImage = findViewById(R.id.recipe_image);
        TextView recipeTitle = findViewById(R.id.recipe_title);
        TextView recipeDetails = findViewById(R.id.recipe_details);
        TextView recipeIngredients = findViewById(R.id.recipe_ingredients);
        TextView recipeInstructions = findViewById(R.id.recipe_instructions);
        TextView recipeNutrition = findViewById(R.id.recipe_nutrition);

        // Set content dynamically
        recipeTitle.setText("Himachali Dhaam - A Traditional Feast");

        recipeDetails.setText("Preparation Time: 10 minutes\nCooking Time: 1 hour\nServes: 6-8");

        recipeIngredients.setText("Ingredients:\n\n" +
                "*For Chana Madra:*\n" +
                "- 1 cup chickpeas (soaked overnight)\n" +
                "- 2 cups curd (yogurt), whisked\n" +
                "- 2 tbsp ghee (clarified butter)\n" +
                "- 1 tsp cumin seeds\n" +
                "- 2 green cardamoms\n" +
                "- 2 cloves\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp coriander powder\n" +
                "- 1 tbsp gram flour (besan)\n" +
                "- Salt to taste\n" +
                "- Fresh coriander for garnish\n\n" +

                "*For Rajma (Kidney Beans Curry):*\n" +
                "- 1 cup rajma (kidney beans), soaked overnight\n" +
                "- 2 onions, finely chopped\n" +
                "- 2 tomatoes, pureed\n" +
                "- 1 tsp ginger-garlic paste\n" +
                "- 1/2 tsp turmeric powder\n" +
                "- 1 tsp garam masala\n" +
                "- 1 tsp red chili powder\n" +
                "- 2 tbsp mustard oil\n" +
                "- Salt to taste\n\n" +

                "*For Sweet Rice (Meetha Chawal):*\n" +
                "- 1 cup basmati rice\n" +
                "- 3/4 cup sugar\n" +
                "- 2 tbsp ghee\n" +
                "- 4-5 saffron strands\n" +
                "- 1/2 tsp cardamom powder\n" +
                "- Handful of dry fruits (almonds, cashews, raisins)");

        recipeInstructions.setText("Instructions:\n\n" +
                "*Step 1: Prepare Chana Madra*\n" +
                "1. Pressure cook the chickpeas until soft.\n" +
                "2. Heat ghee in a pan, add cumin seeds, cardamoms, and cloves.\n" +
                "3. Add turmeric, coriander powder, and gram flour. Stir well.\n" +
                "4. Add whisked curd and stir continuously.\n" +
                "5. Add cooked chickpeas, mix well, and let it simmer for 15 minutes.\n" +
                "6. Garnish with fresh coriander and set aside.\n\n" +

                "*Step 2: Prepare Rajma*\n" +
                "1. Cook soaked rajma in a pressure cooker until soft.\n" +
                "2. Heat mustard oil in a pan, add onions, and sauté until golden brown.\n" +
                "3. Add ginger-garlic paste, turmeric, and chili powder.\n" +
                "4. Add tomato puree and cook until oil separates.\n" +
                "5. Add cooked rajma, salt, and garam masala. Let it simmer for 20 minutes.\n" +
                "6. Serve hot with rice.\n\n" +

                "*Step 3: Prepare Meetha Chawal*\n" +
                "1. Soak rice for 30 minutes, then cook it in boiling water until 80% done.\n" +
                "2. Heat ghee in a pan, add sugar and saffron strands.\n" +
                "3. Add partially cooked rice and mix gently.\n" +
                "4. Cover and cook on low heat for 10 minutes.\n" +
                "5. Add dry fruits and cardamom powder. Serve warm.");

        recipeNutrition.setText("Nutritional Information (Per Serving):\n" +
                "- Calories: 450 kcal\n" +
                "- Carbohydrates: 60g\n" +
                "- Protein: 15g\n" +
                "- Fat: 15g\n" +
                "- Fiber: 10g");

        // Set Image
        recipeImage.setImageResource(R.drawable.himachali_dhaam); // Ensure 'himachali_dhaam' image exists in drawable
    }
}