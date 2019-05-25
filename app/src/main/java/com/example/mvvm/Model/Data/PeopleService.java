package com.example.mvvm.Model.Data;

import android.database.Observable;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PeopleService {

    @GET("people")
    Observable<List<PeopleResponse>> fetchPeople(
            @Query("results") int page,
            @Query("nat") String nat
    );
}
