package com.jogoler.android.moviedb;

import retrofit2.Retrofit;

/**
 * Created by Gilbert on 7/3/2017.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://api.themoviedb.org/";
    public static final String API_KEY = "d7996719a1124cf1b014419a8d8940e7";

    public static MovieService getMovieService(){
        return RetrofitClient.getClient(BASE_URL).create(MovieService.class);
    }
}
