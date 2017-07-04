package com.jogoler.android.moviedb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Gilbert on 7/3/2017.
 */

public interface MovieService {

    @GET("/3/discover/movie")
    Call<Movie> getMovie(@Query("sort_by")String sortBy, @Query("api_key") String apiKey);

    @GET("/3/discover/movie")
    Call<Movie> getMovie(@Query("api_key") String apiKey);

}
