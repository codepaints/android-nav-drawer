package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import adapter.Flower;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlowerFeedback extends Fragment {

    TextView flowerTitle, flowerDescription;
    ImageView flowerImage;


    public FlowerFeedback() {
        // Required empty public constructor
    }

    public static FlowerFeedback newInstance() {

        return new FlowerFeedback();

    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_flower_feedback, container, false);

        //@TODO get the fragment views
        flowerImage = rootView.findViewById(R.id.flower_feedback_image);
        flowerTitle = rootView.findViewById(R.id.flower_feedback_title);
        flowerDescription = rootView.findViewById(R.id.flower_feedback_description);

        return rootView;
    }

    public void setFlower(Flower flower) {
        //@TODO set flower's value
        flowerImage.setImageResource(flower.getImageID());
        flowerTitle.setText(flower.getTitle());
        flowerDescription.setText(flower.getDescription());
    }

}