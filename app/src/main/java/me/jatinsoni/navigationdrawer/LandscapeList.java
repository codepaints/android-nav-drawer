package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import adapter.Landscape;
import adapter.LandscapeAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandscapeList extends Fragment {


    public LandscapeList() {
        // Required empty public constructor
    }

    public static LandscapeList newInstance() {
        return new LandscapeList();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_landscape_list, container, false);

        ArrayList<Landscape> mLandscapes = new ArrayList<>();

        String descriptionText      = getResources().getString(R.string.description);
        String descriptionTwoText   = getResources().getString(R.string.description_two);
        String descriptionThreeText = getResources().getString(R.string.description_three);

        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_1,
                "Port Louis",
                descriptionText,
                "Jatin Soni",
                "Nikon D5000"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_2,
                "Shimla",
                descriptionThreeText,
                "Rahul Patel",
                "Canon EOS 5"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_3,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_4,
                "Port Louis",
                descriptionText,
                "Jatin Soni",
                "Nikon D5000"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_5,
                "Shimla",
                descriptionThreeText,
                "Rahul Patel",
                "Canon EOS 5"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_6,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_7,
                "Port Louis",
                descriptionText,
                "Jatin Soni",
                "Nikon D5000"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_8,
                "Shimla",
                descriptionThreeText,
                "Rahul Patel",
                "Canon EOS 5"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_9,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_10,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_11,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_12,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));
        mLandscapes.add(new Landscape(
                R.drawable.landscape_thumb_13,
                "Capetown",
                descriptionTwoText,
                "Shaun Paul",
                "GoPro Hero 6"
        ));

        RecyclerView               mRecyclerView  = rootView.findViewById(R.id.landscape_list_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.Adapter       mAdapter       = new LandscapeAdapter(mLandscapes, getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }

}
