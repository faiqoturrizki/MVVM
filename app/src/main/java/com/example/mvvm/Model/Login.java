package com.example.mvvm.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Login implements Serializable {
    @SerializedName("username")
    public String userName;
}
