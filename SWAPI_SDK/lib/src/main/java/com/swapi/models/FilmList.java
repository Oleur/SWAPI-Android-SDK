package com.swapi.models;

import android.text.TextUtils;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Film list model
 */
public class FilmList implements Serializable {
    public int count;
    public String next;
    public String previous;
    public ArrayList<Film> results;

    public boolean hasMore() {
        return !TextUtils.isEmpty(next);
    }
}
