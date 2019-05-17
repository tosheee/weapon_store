package com.store.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCategories = (Button) findViewById(R.id.btn_categories);
        btnCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this, CategoriesActivity.class);
                startActivity(int1);
            }
        });

        Button btnArticles = (Button) findViewById(R.id.btn_articles);
        btnArticles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this, ArticlesActivity.class);
                startActivity(int1);
            }
        });

        Button btnStore = (Button) findViewById(R.id.btn_store);
        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this, StoreActivity.class);
                startActivity(int1);
            }
        });
    }
}


