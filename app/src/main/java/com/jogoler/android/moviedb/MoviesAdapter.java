package com.jogoler.android.moviedb;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gilbert on 7/3/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesAdaperViewHolder>{

    private List<Movie.ResultsBean> resultMovies = new ArrayList<>();
    private Context mContext;
    private LayoutInflater mInflater;

    public MoviesAdapter(Context mContext) {
        this.mContext = mContext;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public MoviesAdaperViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.movie_list_item, parent, false);
        final MoviesAdaperViewHolder viewHolder = new MoviesAdaperViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MoviesAdaperViewHolder holder, int position) {

        Movie.ResultsBean movie = resultMovies.get(position);
        String poster = "http://image.tmdb.org/t/p/w185"+movie.getPoster_path();
//        Log.d("MoviesAdapter: ",poster);
        Picasso.with(mContext)
                .load(poster)
                .into(holder.mMovieImageView);
    }

    @Override
    public int getItemCount() {
        return resultMovies.size();
    }

    public void setMovieList(List<Movie.ResultsBean> results) {
        this.resultMovies = results;
        notifyDataSetChanged();
    }

    public class MoviesAdaperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final ImageView mMovieImageView;

        public MoviesAdaperViewHolder(View itemView) {
            super(itemView);

            mMovieImageView = (ImageView)itemView.findViewById(R.id.iv_movie);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Movie.ResultsBean movie = resultMovies.get(position);
            Intent intent = new Intent(mContext,DetailActivity.class);
            intent.putExtra("movie",movie);
            mContext.startActivity(intent);
        }
    }

}
