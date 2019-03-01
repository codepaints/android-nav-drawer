package me.jatinsoni.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.Landscape;

public class LandscapesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landscapes);
    }

    public void onLandscapeClicked(Landscape landscape) {

    }
}
