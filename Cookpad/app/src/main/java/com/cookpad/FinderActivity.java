package com.cookpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FinderActivity extends AppCompatActivity {



    ArrayList<String> ingredientList = new ArrayList<>();
    String ingredient = "Ingredient";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finder);

        //fillingArrayList();

        //ListView ingredientListView = (ListView) findViewById(R.id.ingredientListView);
        //ListAdapter adapter = (ListAdapter) new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ingredientList);
        //ingredientListView.setAdapter(adapter);


        initializeToolbar();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
//
//            case R.id.btnGoToFavorites :
//
//                Intent intentFavorites = new Intent(this, FavoriteActivity.class);
//                startActivity(intentFavorites);
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

        getSupportActionBar().setTitle("Finder");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Meant to store entered ingredients. No longer have a place for it in new Finder layout!!!
    // Filling arrayList for presentation only
//    public void fillingArrayList () {
//
//
//        for (int i = 0; i < 6; i++){
//            int x = i+1;
//            ingredientList.add(ingredient+" #"+(x));
//        }
//    }
}
