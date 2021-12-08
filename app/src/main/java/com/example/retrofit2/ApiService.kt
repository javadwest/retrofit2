package com.example.retrofit2

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded

import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
 @POST("user.php")
 @FormUrlEncoded
 fun getuser(@Field("test")test:String):Call<User>


}