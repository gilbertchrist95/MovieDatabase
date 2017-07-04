package com.jogoler.android.moviedb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DetailActivity extends AppCompatActivity {

    private Movie.ResultsBean detailMovie;
    private static final String EXTRA = "movie";
//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
    TextView mTitleTextView;
    ImageView mMoviePosterImageView;
    TextView mReleaseDateTextView;
    TextView mUserRatingTextView;
    TextView mSynopsisTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mTitleTextView = (TextView) findViewById(R.id.tv_title);
        mMoviePosterImageView = (ImageView) findViewById(R.id.iv_movie_detail);
        mReleaseDateTextView = (TextView) findViewById(R.id.tv_year);
        mUserRatingTextView = (TextView) findViewById(R.id.tv_rating);
        mSynopsisTextView = (TextView) findViewById(R.id.tv_synopsis);

        Intent intentThatStartedThisActivity = getIntent();

        if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra(EXTRA)) {
                detailMovie = getIntent().getParcelableExtra(EXTRA);
                mTitleTextView.setText(detailMovie.getTitle());
                String poster = "http://image.tmdb.org/t/p/w185"+detailMovie.getPoster_path();
                Picasso.with(DetailActivity.this).load(poster).into(mMoviePosterImageView);
                String releaseDateMovie = detailMovie.getRelease_date();
                mReleaseDateTextView.setText(releaseDateMovie.substring(0,4));
                mUserRatingTextView.setText(detailMovie.getVote_average()+"/10");
                mSynopsisTextView.setText(detailMovie.getOverview());
            }
        }
    }
}
