package com.example.retrofit2

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class ApiClient {
    fun getClient(): Retrofit {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("http://192.168.1.53/").build()
    }
}