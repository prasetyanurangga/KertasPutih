package com.example.kertasputih.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kertasputih.data.api.ApiHelper
import com.example.kertasputih.data.repository.MainRepository
import com.example.kertasputih.ui.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(MainRepository(apiHelper)) as T
        }

        throw IllegalArgumentException("UNKOnw")
    }
}