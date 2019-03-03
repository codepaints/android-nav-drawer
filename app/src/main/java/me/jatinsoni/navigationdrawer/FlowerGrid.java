package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import adapter.Flower;
import adapter.FlowerAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlowerGrid extends Fragment {


    public FlowerGrid() {
        // Required empty public constructor
    }

    public static FlowerGrid newInstance() {

        return new FlowerGrid();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_flower_grid, container, false);

        ArrayList<Flower> mFlowers = new ArrayList<>();

        String descriptionText = getResources().getString(R.string.description);
        String descriptionTwoText = getResources().getString(R.string.description_two);
        String descriptionThreeText = getResources().getString(R.string.description_three);

        mFlowers.add(new Flower(R.drawable.flower_1, "Flower One", descriptionText));
        mFlowers.add(new Flower(R.drawable.flower_2, "Flower Two", descriptionText));

        mFlowers.add(new Flower(R.drawable.flower_3, "Flower Three", descriptionText));
        mFlowers.add(new Flower(R.drawable.flower_4, "Flower Four", descriptionTwoText));
        mFlowers.add(new Flower(R.drawable.flower_5, "Flower Five", descriptionThreeText));
        mFlowers.add(new Flower(R.drawable.flower_6, "Flower Six", descriptionText));
        mFlowers.add(new Flower(R.drawable.flower_7, "Flower Seven", descriptionTwoText));
        mFlowers.add(new Flower(R.drawable.flower_8, "Flower Eight", descriptionText));
        mFlowers.add(new Flower(R.drawable.flower_9, "Flower Nine", descriptionThreeText));
        mFlowers.add(new Flower(R.drawable.flower_10, "Flower Ten", descriptionTwoText));
        mFlowers.add(new Flower(R.drawable.flower_11, "Flower Eleven", descriptionText));
        mFlowers.add(new Flower(R.drawable.flower_12, "Flower Twelve", descriptionThreeText));
        mFlowers.add(new Flower(R.drawable.flower_13, "Flower Thirteen", descriptionTwoText));
        mFlowers.add(new Flower(R.drawable.flower_14, "Flower Fourteen", descriptionThreeText));
        mFlowers.add(new Flower(R.drawable.flower_15, "Flower Fifteen", descriptionTwoText));
        mFlowers.add(new Flower(R.drawable.flower_16, "Flower Sixteen", descriptionText));

        RecyclerView               mRecyclerView  = rootView.findViewById(R.id.flower_list_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 3);
        RecyclerView.Adapter       mAdapter       = new FlowerAdapter(mFlowers, getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
