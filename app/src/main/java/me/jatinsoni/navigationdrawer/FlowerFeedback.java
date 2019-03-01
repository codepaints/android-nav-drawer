package me.jatinsoni.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class FlowerFeedback extends Fragment {

    TextView title;

    public FlowerFeedback() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_flower_feedback, container, false);

        Bundle bundle = this.getArguments();

        if (bundle != null) {
            String titleText = Objects.requireNonNull(bundle.get("title")).toString();

            this.title.setText(titleText);
        }

        return rootView;
    }

}
