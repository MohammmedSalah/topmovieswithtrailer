package com.salah.mohammed.topmoviewtihtrailer.models;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class ReviewsListModel {

    @SerializedName("results")
    @Expose
    private List<ReviewModel> reviewModels = new ArrayList<ReviewModel>();


    public List<ReviewModel> getreviewModels() {
        return reviewModels;
    }


    public void setreviewModels(List<ReviewModel> reviewModels) {
        this.reviewModels = reviewModels;
    }

}