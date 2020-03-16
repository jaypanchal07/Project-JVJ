package com.cookpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Recipe> recipeList = new ArrayList<>();
    ArrayList<Recipe> favoriteList = new ArrayList<>();
    ArrayList<String> ingredientArray = new ArrayList<>();
    ArrayList<String> instructionArray = new ArrayList<>();
    TextView textViewRecipeName;
    TextView textViewOrigine;
    ListView listViewIngredient,listViewInstruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeToolbar();
        initializeList();
        ListView listViewRecipe = (ListView) findViewById(R.id.listViewRecipe);



        RecipeListAdapter recipeListAdapter = new RecipeListAdapter(this,recipeList);

        listViewRecipe.setAdapter(recipeListAdapter);

        listViewRecipe.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.btnGoToFinder :

                Intent intentFinder = new Intent(this, FinderActivity.class);
                startActivity(intentFinder);
                break;

            case R.id.btnGoToFavorites :

                Intent intentFavorite = new Intent(this, FavoriteActivity.class);
                startActivity(intentFavorite);
                break;

            case R.id.btnGoToAccount :

                Intent intentAccount = new Intent(this,AccountActivity.class);
                startActivity(intentAccount);
                break;

            default:

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void initializeToolbar () {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        actionBar.setDisplayShowHomeEnabled(true);

    }

    public void initializeList () {

        Recipe recipeA = new Recipe ("MeatBalls1001","Italian");
        Recipe recipeB = new Recipe ("Beef Stew","Canadian");
        Recipe recipeC = new Recipe ("Waffles","Belgium");
        Recipe recipeD = new Recipe ("Buffalo chicken mozzarella sticks","American");
        Recipe recipeE = new Recipe ("Butter chicken","Indian");
        Recipe recipeF = new Recipe ("Ghapama","Armenian");
        Recipe recipeG = new Recipe ("Kouign-Amann","French");
        Recipe recipeH = new Recipe ("Tacos","Mexican");
        Recipe recipeI = new Recipe ("Minced pork rice","Taiwanese");
        Recipe recipeJ = new Recipe ("Sabzi Polo","Persian");
        Recipe recipeK = new Recipe ("General Tao chicken","Chinese");
        Recipe recipeL = new Recipe ("Ta'ameya (Falafel)","Egyptian");

        recipeList.add(recipeA);
        recipeList.add(recipeB);
        recipeList.add(recipeC);
        recipeList.add(recipeD);
        recipeList.add(recipeE);
        recipeList.add(recipeF);
        recipeList.add(recipeG);
        recipeList.add(recipeH);
        recipeList.add(recipeI);
        recipeList.add(recipeJ);
        recipeList.add(recipeK);
        recipeList.add(recipeL);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intentRecipe = new Intent (this,RecipeActivity.class);
        intentRecipe.putExtra("recipeName",recipeList.get(position).getRecipeName());
        intentRecipe.putExtra("recipeOrigine",recipeList.get(position).getCountryOrigin());
        startActivity(intentRecipe);
    }

}
