package me.jatinsoni.navigationdrawer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import adapter.Flower;
import adapter.FlowerViewHolder;

public class FlowersActivity extends AppCompatActivity implements FlowerViewHolder.OnFlowerClickListener {

    FlowerGrid     flowerGrid;
    FlowerFeedback flowerFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        flowerGrid = FlowerGrid.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.flower_grid_container, flowerGrid).commit();

        flowerFeedback = FlowerFeedback.newInstance();
        getSupportFragmentManager().beginTransaction().replace(R.id.flower_feedback_container, flowerFeedback).commit();
    }


    @Override
    public void onFlowerClicked(Flower flower) {
        flowerFeedback.setFlower(flower);
    }
}
