package net.tinad.jam.customlayoutmanager.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import net.tinad.jam.customlayoutmanager.R;

/**
 * Created by nemo on 29/12/17.
 */

public class PictureViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public PictureViewHolder(View itemView) {

        super(itemView);
        imageView = itemView.findViewById(R.id.image);

    }

}
