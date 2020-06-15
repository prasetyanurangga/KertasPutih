package com.example.kertasputih.data.api

import com.example.kertasputih.data.model.UserModel
import retrofit2.http.GET

interface ApiService {

    @GET("user")
    suspend fun getUsers(): List<UserModel>
}