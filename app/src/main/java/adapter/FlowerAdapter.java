package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerViewHolder> {

    private List<Flower> mFlower;
    private Context mContext;

    public FlowerAdapter(List<Flower> mFlower, Context mContext) {
        this.mFlower = mFlower;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder flowerViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
