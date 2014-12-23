package com.swapi.sw;

import com.swapi.models.*;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Oleur on 21/12/2014.
 * Star Wars API interface for making calls.
 */
public interface StarWars {

    @GET("/")
    public void getRootUrls(Callback<Root> callback);

    @GET("/people/")
    public void getAllPeople(@Query("page") int page,
                             Callback<PeopleList> callback);

    @GET("/people/{id}/")
    public void getPeople(@Path("id") int peopleId,
                          Callback<People> callback);

    @GET("/films/")
    public void getAllFilms(@Query("page") int page,
                            Callback<FilmList> callback);

    @GET("/films/{id}/")
    public void getFilm(@Path("id") int filmId,
                        Callback<Film> callback);

    @GET("/starships")
    public void getAllStarships(@Query("page") int page,
                                Callback<StarshipList> callback);

    @GET("/starships/{id}/")
    public void getStarship(@Path("id") int starshipId,
                            Callback<Starship> callback);

    @GET("/vehicles/")
    public void getAllVehicles(@Query("page") int page,
                               Callback<VehicleList> callback);

    @GET("/vehicles/{id}/")
    public void getVehicle(@Path("id") int vehicleId,
                           Callback<Vehicle> callback);

    @GET("/species/")
    public void getAllSpecies(@Query("page") int page,
                              Callback<SpeciesList> callback);

    @GET("/species/{id}/")
    public void getSpecies(@Path("id") int speciesId,
                           Callback<Species> callback);

    @GET("/planets/")
    public void getAllPlanets(@Query("page") int page,
                              Callback<PlanetList> callback);

    @GET("/planets/{id}/")
    public void getPlanet(@Path("id") int planetId,
                          Callback<Planet> callback);

}
