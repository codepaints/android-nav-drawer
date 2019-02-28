package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LandscapeViewHolder landscapeViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
