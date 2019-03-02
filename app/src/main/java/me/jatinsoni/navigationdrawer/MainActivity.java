package me.jatinsoni.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    NavigationView navigationView;
    private DrawerLayout          drawerLayout;
    private ActionBarDrawerToggle toggle;
    private ImageView             flowerBanner, landscapeBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawable_layout);
        navigationView = findViewById(R.id.navigation_view);

        flowerBanner = findViewById(R.id.flower_banner);
        landscapeBanner = findViewById(R.id.landscape_banner);

        // set click for flower and landscape banners on main activity
        flowerBanner.setOnClickListener(this);
        landscapeBanner.setOnClickListener(this);

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
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.flower_banner:
                Intent intent = new Intent(MainActivity.this, FlowersActivity.class);
                startActivity(intent);

            case R.id.landscape_banner:
                switchActivity(LandscapesActivity.class);
        }

    }
}
