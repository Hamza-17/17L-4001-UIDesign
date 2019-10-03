package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragement=null;
            switch (menuItem.getItemId()){
                case R.id.nav_home:
                    selectedFragement=new HomeFragment();
break;
                case R.id.nav_favourites:
                    selectedFragement=new FavouritesFragment();
                    break;

                case R.id.nav_search:
                    selectedFragement=new SearchFragment();
                    break;

            }
getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragement).commit();
        return true;}
    };
}
