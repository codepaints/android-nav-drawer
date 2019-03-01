package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import adapter.Landscape;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandscapeFeedback extends Fragment {


    public LandscapeFeedback() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landscape_feedback, container, false);
    }

    public void setData(Landscape landscape) {

    }

}
