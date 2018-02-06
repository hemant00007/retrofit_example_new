package com.example.app.retrofit_example;

import retrofit.Call;
import retrofit.http.GET;

public interface RetrofitObjectAPI {

    @GET("v2/5a7997952e00002a009a5b3e")
    Call<Student> getStudentDetails();
} 
