
package controller;
import model.Recipe;
import view.RecipeView;
public class RecipeController {
    private final Recipe model;
    private final RecipeView view;

    // Constructor
    public RecipeController(Recipe model, RecipeView view) {
        this.model = model;
        this.view = view;
    }
    // طريقة لعرض تفاصيل الوصفة
    public void displayRecipe() {
        view.printRecipeDetails(model);
    }

    // تحديث عنوان الوصفة
    public void updateRecipeTitle(String title) {
        model.setTitle(title);
    }

    // تحديث مكونات الوصفة
    public void updateRecipeIngredients(String ingredients) {
        model.setIngredients(ingredients);
    }
    // تحديث تعليمات الوصفة
    public void updateRecipeInstructions(String instructions) {
        model.setInstructions(instructions);
    }
    // تحديث رابط الصورة والفيديو
    public void updateRecipeMedia(String imageUrl, String videoUrl) {
        model.setImageUrl(imageUrl);
        model.setVideoUrl(videoUrl);
    }
}
