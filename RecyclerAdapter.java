package com.example.abhishek.starwars;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.swapi.models.Starship;

/**
 * Created by Abhishek on 05/10/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private Starship[] mStarship;

    public RecyclerAdapter(Starship[] starships){
        mStarship = starships;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.starships,parent,false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.bindView(mStarship[position]);
    }

    @Override
    public int getItemCount() {
        return mStarship.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public TextView mName;
        public TextView mCost;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.name);
            mCost = (TextView) itemView.findViewById(R.id.cost);
        }
        public void bindView(Starship ships){
            mName.setText(ships.name);
            mCost.setText(ships.costInCredits);
        }
    }
}
