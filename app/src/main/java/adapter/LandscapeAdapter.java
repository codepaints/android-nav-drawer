package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import me.jatinsoni.navigationdrawer.LandscapesActivity;
import me.jatinsoni.navigationdrawer.R;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeViewHolder> {

    private List<Landscape> mLandscape;
    private Context mContext;

    public LandscapeAdapter(List<Landscape> mLandscape, Context mContext) {
        this.mLandscape = mLandscape;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public LandscapeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.landscape_list_item, viewGroup, false);
        return new LandscapeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LandscapeViewHolder landscapeViewHolder, final int i) {

        Landscape landscape = mLandscape.get(i);

        landscapeViewHolder.setItemImage(landscape.getImageID());
        landscapeViewHolder.setItemLocation(landscape.getLocation());
        landscapeViewHolder.setItemDescription(landscape.getDescription());
        landscapeViewHolder.setItemPhotographer(landscape.getPhotographer());
        landscapeViewHolder.setItemCamera(landscape.getCamera());

        landscapeViewHolder.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Landscape item " + i, Toast.LENGTH_SHORT).show();
//                ((LandscapesActivity) mContext)
            }
        });

    }

    @Override
    public int getItemCount() {
        return mLandscape.size();
    }

}
