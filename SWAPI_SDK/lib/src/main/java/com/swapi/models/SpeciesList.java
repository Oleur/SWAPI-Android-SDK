package com.swapi.models;

import android.text.TextUtils;

import java.util.ArrayList;

/**
 * Created by Oleur on 22/12/2014.
 * Species list model
 */
public class SpeciesList {
    public int count;
    public String next;
    public String previous;
    public ArrayList<Species> results;

    public boolean hasMore() {
        return !TextUtils.isEmpty(next);
    }
}
