package com.example.kertasputih.data.repository

import com.example.kertasputih.data.api.ApiHelper

class MainRepository(private  val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}