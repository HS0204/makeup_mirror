package com.example.kotlinandroid.Retrofit

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface IUploadAPI : IDownloadAPI {
    @Multipart
    @POST("/api/upload")
    fun uploadFile(@Part file:MultipartBody.Part): Call<String>
}