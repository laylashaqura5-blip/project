
package model;
public class Recipe {private int recipeId;
    private String title;
    private String ingredients;
    private String instructions;
    private String imageUrl;
    private String videoUrl;
    private int userId;
    // Constructor
    public Recipe(int recipeId, String title, String ingredients, String instructions, String imageUrl, String videoUrl, int userId) {
        this.recipeId = recipeId;
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.userId = userId;
    }
    // Getters and Setters
    public int getRecipeId() { return recipeId; }
    public void setRecipeId(int recipeId) { this.recipeId = recipeId; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    
}
