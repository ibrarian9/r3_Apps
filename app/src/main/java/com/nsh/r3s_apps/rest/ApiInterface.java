package com.nsh.r3s_apps.rest;

import com.nsh.r3s_apps.model.Login;
import com.nsh.r3s_apps.model.Register;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Login> loginResponse(
            @Field("username") String username,
            @Field("password") String password
    );
    @Headers("Accept: application/json")
    @FormUrlEncoded
    @POST("register.php")
    Call<Register> registerResponse(
            @Field("username") String username,
            @Field("password") String password,
            @Field("email") String email,
            @Field("no_hp") String no_hp,
            @Field("nama_lengkap") String nama_lengkap
    );
}