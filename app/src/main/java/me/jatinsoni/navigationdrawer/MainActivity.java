package me.jatinsoni.navigationdrawer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawable_layout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        switch (id) {
            case R.id.nav_home:
                Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();

                switchActivity(MainActivity.class);

//                Intent homeIntent = new Intent(this, MainActivity.class);
//                startActivity(homeIntent);

                break;

            case R.id.nav_flowers:
                Toast.makeText(this, "Flowers Clicked", Toast.LENGTH_SHORT).show();

                switchActivity(FlowersActivity.class);

//                Intent flowersIntent = new Intent(this, FlowersActivity.class);
//                startActivity(flowersIntent);

                break;

            case R.id.nav_landscapes:
                Toast.makeText(this, "Landscapes Clicked", Toast.LENGTH_SHORT).show();

                switchActivity(LandscapesActivity.class);

//                Intent landscapesIntent = new Intent(this, LandscapesActivity.class);
//                startActivity(landscapesIntent);

                break;
        }

        return false;
    }

    private void switchActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);

    }
}
