package com.example.mvvm.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Name implements Serializable {
    @SerializedName("title")
    public String title;
    @SerializedName("first")
    public String first;
    @SerializedName("last")
    public String last;

}
