package com.example.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitManager {

    private static RetrofitManager mInstance = new RetrofitManager();

    private GetAPI mGetAPI;

    private RetrofitManager() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://opendata.cwb.gov.tw/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mGetAPI = retrofit.create(GetAPI.class);
    }

    static RetrofitManager getInstance() {
        return mInstance;
    }

    GetAPI getAPI() {
        return mGetAPI;
    }
}
