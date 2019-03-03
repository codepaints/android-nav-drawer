package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import me.jatinsoni.navigationdrawer.R;

public class FlowerViewHolder extends RecyclerView.ViewHolder {

    public ImageView itemImage;
    public TextView  itemTitle;
    public TextView  itemDescription;

    public FlowerViewHolder(@NonNull View itemView) {

        super(itemView);

        this.itemImage = itemView.findViewById(R.id.flower_thumb);
        this.itemTitle = itemView.findViewById(R.id.flower_title);
    }

    public void setItemImage(int itemImage) {
        this.itemImage.setImageResource(itemImage);
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle.setText(itemTitle);
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription.setText(itemDescription);
    }

    public interface OnFlowerClickListener {
        void onFlowerClicked(Flower flower);
    }

}
