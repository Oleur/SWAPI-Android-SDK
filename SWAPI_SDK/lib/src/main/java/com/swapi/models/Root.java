package com.swapi.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Oleur on 21/12/2014.
 * Root model that provides information on all avaiable resources within the API.
 */
public class Root implements Serializable {
    @SerializedName("films")
    public String filmsUrl;
    @SerializedName("people")
    public String peopleUrl;
    @SerializedName("planets")
    public String planetsUrl;
    @SerializedName("species")
    public String speciesUrl;
    @SerializedName("starships")
    public String starshipsUrl;
    @SerializedName("vehicles")
    public String vehiclesUrl;
}
