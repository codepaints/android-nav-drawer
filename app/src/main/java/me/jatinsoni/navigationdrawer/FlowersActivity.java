package me.jatinsoni.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Objects;

import adapter.Flower;
import adapter.FlowerViewHolder;

public class FlowersActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, FlowerViewHolder.OnFlowerClickListener {

    NavigationView navigationView;
    FlowerGrid     flowerGrid;
    FlowerFeedback flowerFeedback;
    private DrawerLayout          drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        drawerLayout = findViewById(R.id.drawable_layout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        flowerGrid = FlowerGrid.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.flower_grid_container, flowerGrid).commit();

        flowerFeedback = FlowerFeedback.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.flower_feedback_container, flowerFeedback).commit();
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
                break;

            case R.id.nav_flowers:
                Toast.makeText(this, "Flower Clicked", Toast.LENGTH_SHORT).show();

                switchActivity(FlowersActivity.class);
                break;

            case R.id.nav_landscapes:
                Toast.makeText(this, "Landscapes Clicked", Toast.LENGTH_SHORT).show();

                switchActivity(LandscapesActivity.class);
                break;
        }

        return false;
    }

    private void switchActivity(Class<?> activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);

    }


    @Override
    public void onFlowerClicked(Flower flower) {
        flowerFeedback.setFlower(flower);
    }
}
