package com.example.rahaf.payhjj;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IUserApi {

    @POST("/users")
    Call<User> createUser(@Body User user);
}
