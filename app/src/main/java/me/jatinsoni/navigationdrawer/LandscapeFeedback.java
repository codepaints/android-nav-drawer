package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import adapter.Landscape;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandscapeFeedback extends Fragment {

    ImageView  landscapeImage;
    ScrollView landscapeFeedbackScrollView;
    TextView   landscapeLocation, landscapeCamera, landscapePhotographer, landscapeDescription;

    public LandscapeFeedback() {
        // Required empty public constructor
    }

    public static LandscapeFeedback newInstance() {
        return new LandscapeFeedback();
    }


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_landscape_feedback, container, false);

        landscapeFeedbackScrollView = rootView.findViewById(R.id.landscape_feedback_scrollView);
        landscapeImage = rootView.findViewById(R.id.landscape_feedback_image);
        landscapeLocation = rootView.findViewById(R.id.landscape_feedback_location);
        landscapeCamera = rootView.findViewById(R.id.landscape_feedback_camera);
        landscapePhotographer = rootView.findViewById(R.id.landscape_feedback_photographer);
        landscapeDescription = rootView.findViewById(R.id.landscape_feedback_description);

        return rootView;
    }

    public void setLandscape(Landscape landscape) {

        landscapeFeedbackScrollView.fullScroll(ScrollView.FOCUS_UP);
        landscapeImage.setImageResource(landscape.getImageID());
        landscapeLocation.setText(landscape.getLocation());
        landscapeCamera.setText(landscape.getCamera());
        landscapePhotographer.setText(landscape.getPhotographer());
        landscapeDescription.setText(landscape.getDescription());

    }

}
