package com.example.application07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserActivity extends AppCompatActivity {
    TextView tvName, tvEmail;
    Button btnLogout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);


        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_nav);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.navigation_cart:
                        startActivity(new Intent(getApplicationContext()
                        ,cart.class));
                        overridePendingTransition(0,0);
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
                        return true;


                }
                return false;

            }
        });


    }
}