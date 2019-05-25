package com.example.mvvm.Model.Data;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeopleFactory {


    private Retrofit retrofit = null;


    public PeopleService create() {
        String BASE_URL = "http://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }

        return retrofit.create(PeopleService.class);
    }
}
