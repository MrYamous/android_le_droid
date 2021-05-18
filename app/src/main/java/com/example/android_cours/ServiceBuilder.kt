package com.example.android_cours

import retrofit2.Retrofit

object ServiceBuilder {

    private val retrofit = Retrofit.Builder()
            .baseUrl("https://0351fde4-7599-4813-a0fa-727f881dfb88.mock.pstmn.io/")
            .build()

    fun<T> buildService() {
        retrofit.create(ServiceBuilder::class.java)
    }
}