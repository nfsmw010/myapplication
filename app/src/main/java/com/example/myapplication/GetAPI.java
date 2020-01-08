package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetAPI {

    @GET("api/v1/rest/datastore/F-C0032-001?Authorization=CWB-3C5C04C6-752F-4745-816D-CFAB775799D2&locationName=臺北市")
    Call<Weather> getWeatherInfo();
}
