package net.tinad.jam.customlayoutmanager.viewholders;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import net.tinad.jam.customlayoutmanager.R;
import net.tinad.jam.customlayoutmanager.models.PictureModel;

/**
 * Created by nemo on 29/12/17.
 */

public class PictureViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public PictureViewHolder(View itemView) {

        super(itemView);
        imageView = itemView.findViewById(R.id.image);

    }

    public void setupView(PictureModel model) {

        Picasso.with(imageView.getContext())
                .load(Uri.parse(model.getPictureSource().toString()))
                .into(imageView);

    }

}
