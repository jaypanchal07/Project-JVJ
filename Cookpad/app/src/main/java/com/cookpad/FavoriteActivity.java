package com.cookpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriteActivity extends AppCompatActivity {

    ArrayList<Recipe> listOfFavoriteRecipe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_recipes);

        initializeToolbar();
        initializeList ();

        ListView favorite_listview = (ListView) findViewById(R.id.favorite_listview);
        RecipeListAdapter recipeListAdapter = new RecipeListAdapter(this,listOfFavoriteRecipe);
        favorite_listview.setAdapter(recipeListAdapter);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
//
//            case R.id.btnGoToFinder :
//
//                Intent intentFinder = new Intent(this, FinderActivity.class);
//                startActivity(intentFinder);
//                break;
//
//            case R.id.btnGoToAccount :
//
//                Intent intentAccount = new Intent(this,AccountActivity.class);
//                startActivity(intentAccount);
//                break;
//
//            default:
//
//                break;
//
//        }
//        return super.onOptionsItemSelected(item);
//    }

    public void initializeToolbar () {
        getSupportActionBar().setTitle("Favorites");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void initializeList () {

        /*
        The usage of initializeList is only for exhibition.
        listOfFavoriteRecipe will be requested from database related with user preferences.
         */

        Recipe recipeA = new Recipe ("MeatBalls1001","Italian");
        Recipe recipeB = new Recipe ("MeatBalls1002","Italian");
        Recipe recipeC = new Recipe ("MeatBalls1003","Italian");
        Recipe recipeD = new Recipe ("MeatBalls1004","Italian");
        Recipe recipeE = new Recipe ("MeatBalls1005","Italian");
        Recipe recipeF = new Recipe ("MeatBalls1006","Italian");
        Recipe recipeG = new Recipe ("MeatBalls1007","Italian");
        Recipe recipeH = new Recipe ("MeatBalls1008","Italian");
        Recipe recipeI = new Recipe ("MeatBalls1009","Italian");
        Recipe recipeJ = new Recipe ("MeatBalls1010","Italian");
        Recipe recipeK = new Recipe ("MeatBalls1011","Italian");
        Recipe recipeL = new Recipe ("MeatBalls1012","Italian");

        listOfFavoriteRecipe.add(recipeA);
        listOfFavoriteRecipe.add(recipeB);
        listOfFavoriteRecipe.add(recipeC);
        listOfFavoriteRecipe.add(recipeD);
        listOfFavoriteRecipe.add(recipeE);
        listOfFavoriteRecipe.add(recipeF);
        listOfFavoriteRecipe.add(recipeG);
        listOfFavoriteRecipe.add(recipeH);
        listOfFavoriteRecipe.add(recipeI);
        listOfFavoriteRecipe.add(recipeJ);
        listOfFavoriteRecipe.add(recipeK);
        listOfFavoriteRecipe.add(recipeL);

    }
}
