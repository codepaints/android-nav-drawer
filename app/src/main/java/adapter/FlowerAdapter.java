package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import me.jatinsoni.navigationdrawer.FlowersActivity;
import me.jatinsoni.navigationdrawer.R;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerViewHolder> {

    private List<Flower> mFlower;
    private Context      mContext;

    public FlowerAdapter(List<Flower> mFlower, Context mContext) {
        this.mFlower = mFlower;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.flower_list_item, viewGroup, false);
        return new FlowerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder flowerViewHolder, final int i) {

        final Flower flower = mFlower.get(i);

        flowerViewHolder.setItemImage(flower.getImageID());
        flowerViewHolder.setItemTitle(flower.getTitle());
//        flowerViewHolder.setItemDescription(flower.getDescription());

        flowerViewHolder.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Flower item " + i, Toast.LENGTH_SHORT).show();
                ((FlowersActivity) mContext).onFlowerClicked(mFlower.get(i));
            }
        });

    }

    @Override
    public int getItemCount() {
        return mFlower.size();
    }
}
