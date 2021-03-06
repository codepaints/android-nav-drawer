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

import adapter.Landscape;
import adapter.LandscapeViewHolder;

public class LandscapesActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, LandscapeViewHolder.OnLandscapeClickListener {

    private LandscapeList         landscapeList;
    private LandscapeFeedback     landscapeFeedback;
    private NavigationView        navigationView;
    private DrawerLayout          drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscapes);

        drawerLayout = findViewById(R.id.drawable_layout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        landscapeList = LandscapeList.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.landscape_list_container, landscapeList).commit();

        landscapeFeedback = LandscapeFeedback.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.landscape_feedback_container, landscapeFeedback).commit();
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

    public void onLandscapeClicked(Landscape landscape) {
        landscapeFeedback.setLandscape(landscape);
    }

}
