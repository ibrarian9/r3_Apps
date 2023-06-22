package com.nsh.r3s_apps.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "http://192.168.43.228/r3s_apps/";
    private static Retrofit retrofit;
    private static Gson gson;
    private static OkHttpClient httpClient;
    public static Retrofit getClient(){
        if(retrofit == null) {

            httpClient = new OkHttpClient()
                    .newBuilder()
                    .build();

            gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient)
                    .build();
        }
        return retrofit;
    }
}
