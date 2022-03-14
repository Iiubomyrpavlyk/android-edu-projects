package com.example.recyclerviewretrofit.network

import android.text.Spannable
import com.example.recyclerviewretrofit.data.User
import retrofit2.Converter
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

const val BASE_URL = "https://jsonplaceholder.typicode.com/"

object JsonPlaceholderService {

    val retrofit: UserService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UserService::class.java)
}

interface UserService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>

    @GET("users/{user-id}")
    suspend fun getUserById(@Path("user-id") userId: Int): Response<User>
}

