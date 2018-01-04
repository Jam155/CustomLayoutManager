package net.tinad.jam.customlayoutmanager.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.tinad.jam.customlayoutmanager.R;
import net.tinad.jam.customlayoutmanager.models.PictureModel;
import net.tinad.jam.customlayoutmanager.viewholders.PictureViewHolder;

import java.util.ArrayList;

/**
 * Created by nemo on 29/12/17.
 */

public class PictureAdapter extends RecyclerView.Adapter<PictureViewHolder> {

    private ArrayList<PictureModel> pictures;

    public PictureAdapter(ArrayList<PictureModel> pictures) {

        this.pictures = pictures;

    }

    public int getItemCount() {

        return pictures.size();

    }

    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int type) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.picture_view, parent, false);

        return new PictureViewHolder(itemView);

    }

    public void onBindViewHolder(PictureViewHolder viewHolder, int position) {

        PictureModel pictureModel = pictures.get(position);
        viewHolder.setupView(pictureModel);

    }

}
