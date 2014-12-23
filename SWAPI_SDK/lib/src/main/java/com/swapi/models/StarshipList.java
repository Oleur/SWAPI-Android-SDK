package com.swapi.models;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Starship list model that represents all the Star Wars starships
 */
public class StarshipList implements Serializable {
    public int count;
    public String next;
    public String previous;
    public ArrayList<Starship> results;

    public boolean hasMore() {
        return !TextUtils.isEmpty(next);
    }
}
