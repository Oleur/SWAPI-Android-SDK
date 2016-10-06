package com.example.abhishek.starwars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.swapi.models.Starship;
import com.swapi.sw.StarWarsApi;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Starship> starsList = new ArrayList<>();
    RecyclerView recycler;
    RecyclerAdapter adapter;
    Starship[] mStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StarWarsApi.init();

        mStars = new Starship[starsList.size()];
        adapter = new RecyclerAdapter(mStars);
        recycler =(RecyclerView) findViewById(R.id.recyclerView);
        recycler.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(mLayoutManager);




    }
}
