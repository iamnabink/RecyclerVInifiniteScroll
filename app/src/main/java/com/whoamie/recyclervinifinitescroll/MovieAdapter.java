package com.whoamie.recyclervinifinitescroll;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    List<Movie> movies;
    Context context;

    public MovieAdapter(List<Movie> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_movie,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.tv_movie_name.setText(movie.getName());
        holder.tv_genre.setText(movie.getGenre());
        holder.tv_lang.setText(movie.getLanguage());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView tv_movie_name,tv_genre,tv_lang;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_movie_name = itemView.findViewById(R.id.tv_movie_name);
            tv_genre=itemView.findViewById(R.id.tv_genre);
            tv_lang=itemView.findViewById(R.id.tv_lang);
        }
    }
}
