package com.whoamie.recyclervinifinitescroll;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private int status;
    private String release_date;
    private String youtube_trailer_url;
    private String poster_url;
    private String directors;
    private String casts;
    private String synopsis;
    private String language;
    private String run_time;
    private String genre;
    private String name;
    private int id;

    public int getStatus() {
        return status;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getYoutube_trailer_url() {
        return youtube_trailer_url;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public String getDirectors() {
        return directors;
    }

    public String getCasts() {
        return casts;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getLanguage() {
        return language;
    }

    public String getRun_time() {
        return run_time;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public static List<Movie> createContactsList(int numContacts, int offset) {
        List<Movie> movies = new ArrayList<>();

        for (int i = 1; i <= numContacts; i++) {

        }

        return movies;
    }
}
