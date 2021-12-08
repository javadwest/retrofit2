package com.example.retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val callback = ApiClient().getClient().create(ApiService::class.java).getuser("test")
        callback.enqueue(object :Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val body = response.body()
                Toast.makeText(this@MainActivity,"${body?.name} ${body?.family}",Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<User>, t: Throwable) {

            }

        })
    }
}