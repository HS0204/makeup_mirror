package com.example.kotlinandroid.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitClient_Up {
    private var retrofitClient: Retrofit?=null
//asdsadsa
    val client:Retrofit
        get() {
            if(retrofitClient == null)
                retrofitClient = Retrofit.Builder()
                    .baseUrl("http://192.168.1.102:5000")
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build()
            return retrofitClient!!
        }

}