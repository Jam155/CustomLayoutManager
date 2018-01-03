package net.tinad.jam.customlayoutmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.tinad.jam.customlayoutmanager.adapters.PictureAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PictureAdapter adapter;
    private ArrayList<PictureModel> pictures;

    private void setupRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.container);

        adapter = new PictureAdapter(pictures);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupRecyclerView();
    }
}
