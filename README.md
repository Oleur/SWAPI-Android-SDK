SWAPI-Android-SDK
=================

The SWAPI (Star Wars API) SDK for Android
SWAPI SDk requires at minimum Java 7 or Android 4.0.

How to use it
=============

Create a global instance in your application class
```java
public class YourStarWarsApp extends Application {

    @Override
    public void onCreate() {
      super.onCreate();
      //Init star wars api
      StarWarsApi.init();
    }
    
}
```
In your activities or fragment you may fire every API call you want.
```java
StarWarsApi.getApi().getAllPlanets(2, new Callback<PlanetList>() {
    @Override
    public void success(PlanetList simple, Response response) {
      //Do something cool
    }
    
    @Override
    public void failure(RetrofitError error) {
      //Something wrong
    }
});
```

