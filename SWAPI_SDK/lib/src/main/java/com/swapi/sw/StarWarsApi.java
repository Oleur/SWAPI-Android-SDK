package com.swapi.sw;

import android.content.Context;
import com.swapi.APIConstants;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by Oleur on 22/12/2014.
 *
 */
public class StarWarsApi {

    private StarWars mSwApi;
    private static StarWarsApi sInstance;

    private StarWarsApi(Context context) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setClient(new OkClient())
                .setEndpoint(APIConstants.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        mSwApi = restAdapter.create(StarWars.class);
    }

    public static void init(Context context) {
        sInstance = new StarWarsApi(context);
    }

    public static StarWars getApi() {
        return sInstance.mSwApi;
    }

    public void setApi(StarWars starWarsApi) {
        sInstance.mSwApi = starWarsApi;
    }
}
