package com.example.recyclerviewretrofit.data

import com.example.recyclerviewretrofit.network.JsonPlaceholderService
import kotlinx.coroutines.*

object DataStore {

    fun getUsers(): List<User> = runBlocking { JsonPlaceholderService.retrofit.getUsers().body()!! }

}

