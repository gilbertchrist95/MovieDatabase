package com.jogoler.android.moviedb;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.jogoler.android.moviedb.ApiUtils.API_KEY;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private static final String STATE_MOVIES = "state_movies";


    private MovieService mMovieService;
    private MoviesAdapter mMoviesAdapter;
    private RecyclerView mRecyclerView;
    private TextView mErrorMessageDisplay;
    private ProgressBar mLoadingIndicator;
    private ArrayList<Movie.ResultsBean> resultMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMovieService = ApiUtils.getMovieService();
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_movie);
        mErrorMessageDisplay = (TextView) findViewById(R.id.tv_error_message_display);
        mLoadingIndicator = (ProgressBar) findViewById(R.id.pb_loading_indicator);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mMoviesAdapter = new MoviesAdapter(this);
        mRecyclerView.setAdapter(mMoviesAdapter);
        if (savedInstanceState == null || !savedInstanceState.containsKey(STATE_MOVIES)) {
            loadMovie();
        } else {
            mMoviesAdapter.setMovieList(resultMovies);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putParcelableArrayList(STATE_MOVIES, resultMovies);
    }

    private void loadMovie() {
        mLoadingIndicator.setVisibility(View.VISIBLE);
        Log.d("URL", mMovieService.getMovie(API_KEY).request().url().toString());
        showMovieDataView();
        mMovieService.getMovie(API_KEY).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                mLoadingIndicator.setVisibility(View.INVISIBLE);
                if (response.isSuccessful()) {
                    resultMovies = new ArrayList<>(response.body().getResults());
                    mMoviesAdapter.setMovieList(resultMovies);
                    Log.d("MovieDB", "berhasil");
                } else {
                    int statusCode = response.code();
                    Toast.makeText(MainActivity.this, "errorr " + statusCode, Toast.LENGTH_SHORT).show();
                    Log.d("MovieDB", "error" + statusCode);
                }
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                mLoadingIndicator.setVisibility(View.INVISIBLE);
                showErrorMessage();
                mErrorMessageDisplay.setText("Error to load Movies from API");
//                Log.e("MainActivity", t.getMessage());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_most_popular:
                customLoadMovie("popularity.desc");
                break;
            case R.id.action_top_rated:
                customLoadMovie("vote_average.desc");
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void customLoadMovie(String sortBy) {
        mLoadingIndicator.setVisibility(View.VISIBLE);
        showMovieDataView();
        mMovieService.getMovie(sortBy, API_KEY).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                if (response.isSuccessful()) {
                    mLoadingIndicator.setVisibility(View.INVISIBLE);
                    mMoviesAdapter.setMovieList(response.body().getResults());
                } else {
                    int statusCode = response.code();
                    Toast.makeText(MainActivity.this, "errorr " + statusCode, Toast.LENGTH_SHORT).show();
                    Log.d("MovieDB", "error" + statusCode);
                }

            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                showErrorMessage();
                mErrorMessageDisplay.setText("Error to load Movies from API");
            }
        });
    }

    private void showMovieDataView() {
        mRecyclerView.setVisibility(View.VISIBLE);
        mErrorMessageDisplay.setVisibility(View.INVISIBLE);
    }

    private void showErrorMessage() {
        mRecyclerView.setVisibility(View.INVISIBLE);
        mErrorMessageDisplay.setVisibility(View.VISIBLE);
    }


}
