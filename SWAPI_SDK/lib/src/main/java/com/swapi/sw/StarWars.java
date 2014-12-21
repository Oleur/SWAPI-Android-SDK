package com.swapi.sw;

import com.swapi.models.People;
import com.swapi.models.Root;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Oleur on 21/12/2014.
 * Star Wars API interface for making calls.
 */
public interface StarWars {

    @GET("/")
    public void getRootUrls(Callback<Root> callback);

    @GET("/people/{people_id}")
    public void getPeople(@Query("people_id") int peopleId,
                          Callback<People> callback);

}
