package com.example.kertasputih.data.api

class ApiHelper(private val apiService: ApiService) {
    suspend fun  getUsers() = apiService.getUsers()
}