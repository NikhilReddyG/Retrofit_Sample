package com.test.app.retrofitsample.data

import com.test.app.retrofitsample.model.Model
import retrofit2.Call
import retrofit2.http.GET



interface UserRequest{

    @GET("marvel")
    fun getList(): Call<List<Model>>
}