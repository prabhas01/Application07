package com.example.application07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.navigation_cart);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.navigation_cart:

                        return true;

                    case R.id.navigation_fav:
                        startActivity(new Intent(getApplicationContext()
                                ,favourite.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.navigation_menu:
                        startActivity(new Intent(getApplicationContext()
                                ,menu.class));
                        overridePendingTransition(0,0);
                        return true;


                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,UserActivity.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;

            }
        });


    }
}