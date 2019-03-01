package me.jatinsoni.navigationdrawer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import adapter.Flower;

public class FlowersActivity extends AppCompatActivity {

    FlowerGrid flowerGrid;
    FlowerFeedback flowerFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        flowerGrid = FlowerGrid.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.flower_container, flowerGrid).commit();
    }

    public void onFlowerClicked(Flower flower) {

    }
}
