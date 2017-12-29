package net.tinad.jam.customlayoutmanager.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import net.tinad.jam.customlayoutmanager.viewholders.PictureViewHolder;

/**
 * Created by nemo on 29/12/17.
 */

public class PictureAdapter extends RecyclerView.Adapter<PictureViewHolder> {

    public int getItemCount() {

        return 0;

    }

    public PictureViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {

        return new PictureViewHolder(viewGroup);

    }

    public void onBindViewHolder(PictureViewHolder viewHolder, int position) {


    }

}
