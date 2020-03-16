package com.cookpad;

import android.media.Image;

import java.util.ArrayList;

public class Recipe {


    private int recipeId;
    private Image recipeImage;
    private String recipeName;
    private String countryOrigin;

    private ArrayList<String> ingredients = new ArrayList<>();
    private ArrayList<String> steps = new ArrayList<>();

//    public Recipe (int recipeId, Image recipeImage, String recipeName, String countryOrigin, ArrayList<String> ingredients, ArrayList<String> steps) {
//        this.recipeId = recipeId;
//        this.recipeImage = recipeImage;
//        this.recipeName = recipeName;
//        this.countryOrigin = countryOrigin;
//        this.ingredients = ingredients;
//        this.steps = steps;
//    }

    public Recipe(String recipeName, String countryOrigin) {
        this.recipeName = recipeName;
        this.countryOrigin = countryOrigin;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public Image getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(Image recipeImage) {
        this.recipeImage = recipeImage;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
}
