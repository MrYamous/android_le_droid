package com.example.android_cours

import retrofit2.Call
import retrofit2.http.GET

interface UserService {

    @GET("login")
    fun getLogin(): Call<Void>

}