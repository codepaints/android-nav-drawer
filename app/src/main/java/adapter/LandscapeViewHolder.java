package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LandscapeViewHolder extends RecyclerView.ViewHolder {

    public ImageView itemImage;
    public TextView itemLocation;
    public TextView itemDescription;
    public TextView itemPhotographer;
    public TextView itemCamera;

    public LandscapeViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void setItemImage(int itemImage) {
        this.itemImage.setImageResource(itemImage);
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation.setText(itemLocation);
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription.setText(itemDescription);
    }

    public void setItemPhotographer(String itemPhotographer) {
        this.itemPhotographer.setText(itemPhotographer);
    }

    public void setItemCamera(String itemCamera) {
        this.itemCamera.setText(itemCamera);
    }
}
