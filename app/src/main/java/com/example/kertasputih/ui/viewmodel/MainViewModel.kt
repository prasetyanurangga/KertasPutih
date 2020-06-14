package com.example.kertasputih.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.kertasputih.data.repository.MainRepository
import com.example.kertasputih.utils.Resource
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    fun getUsers() = liveData(Dispatchers.IO){
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getusers()))
        }
        catch (exception: Exception)
        {
            emit(Resource.error(data = null, message = exception.message ?: "Errror"))
        }
    }
}