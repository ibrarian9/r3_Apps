package com.nsh.r3s_apps.model;

import com.google.gson.annotations.SerializedName;

public class RegisterData {

    @SerializedName("nama_lengkap")
    private String namalengkap;

    @SerializedName("no_hp")
    private String nohp;

    @SerializedName("password")
    private String password;

    @SerializedName("email")
    private String email;

    @SerializedName("username")
    private String username;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNamalengkap(String namalengkap){
        this.namalengkap = namalengkap;
    }

    public String getNamalengkap(){
        return namalengkap;
    }

    public void setNohp(String nohp){
        this.nohp = nohp;
    }

    public String getNohp(){
        return nohp;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}