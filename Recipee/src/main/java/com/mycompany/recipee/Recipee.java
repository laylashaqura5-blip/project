
package com.mycompany.recipee;
import model.Recipe;
import controller.RecipeController;
import view.RecipeView;
public class Recipee {

    public static void main(String[] args) {
        // إنشاء نموذج الوصفة (Model)
        Recipe recipe = new Recipe(1, "Pasta", "Noodles, Sauce", "Boil water, cook noodles", "imageUrl.com", "videoUrl.com", 1);

        // إنشاء واجهة الوصفة (View)
        RecipeView recipeView = new RecipeView();

        // إنشاء المتحكم (Controller)
        RecipeController recipeController = new RecipeController(recipe, recipeView);

        // عرض تفاصيل الوصفة
        recipeController.displayRecipe();

        // تحديث عنوان الوصفة
        recipeController.updateRecipeTitle("Spaghetti");
        recipeController.updateRecipeIngredients("Spaghetti, Tomato Sauce");

        // عرض الوصفة بعد التحديث
        recipeController.displayRecipe();
    }
    }

