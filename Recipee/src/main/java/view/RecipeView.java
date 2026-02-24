
package view;

import model.Recipe;
public class RecipeView {
    // طريقة لعرض تفاصيل الوصفة
    public void printRecipeDetails(Recipe recipe) {
        System.out.println("Recipe ID: " + recipe.getRecipeId());
        System.out.println("Title: " + recipe.getTitle());
        System.out.println("Ingredients: " + recipe.getIngredients());
        System.out.println("Instructions: " + recipe.getInstructions());
        System.out.println("Image URL: " + recipe.getImageUrl());
        System.out.println("Video URL: " + recipe.getVideoUrl());
}
}
