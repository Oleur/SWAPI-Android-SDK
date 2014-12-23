package com.swapi.models;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Planet list model
 */
public class PlanetList implements Serializable {
    public int count;
    public String next;
    public String previous;
    public ArrayList<Planet> results;

    public boolean hasMore() {
        return !TextUtils.isEmpty(next);
    }
}
