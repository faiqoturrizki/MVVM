package com.example.mvvm.Model.Data;

import com.example.mvvm.Model.People;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PeopleResponse {
    @SerializedName("result")
    private List<People> peopleList;

    public List<People> getPeopleList() {
        return peopleList;
    }
}
