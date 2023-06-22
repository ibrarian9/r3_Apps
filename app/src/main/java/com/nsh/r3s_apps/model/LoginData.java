package com.nsh.r3s_apps.model;

import com.google.gson.annotations.SerializedName;

public class LoginData {

    @SerializedName("namalengkap")
    private String namalengkap;

    @SerializedName("id_user")
    private String idUser;

    @SerializedName("username")
    private String username;

    public void setNamalengkap(String namalengkap){
        this.namalengkap = namalengkap;
    }

    public String getNamalengkap(){
        return namalengkap;
    }

    public void setIdUser(String idUser){
        this.idUser = idUser;
    }

    public String getIdUser(){
        return idUser;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}