package com.example.hello.ui.theme.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hello.ui.theme.Model.ItemsModel
import com.example.hello.ui.theme.Repository.MainRepository

class MainViewModel:ViewModel() {
    private val repository=MainRepository()

    fun loadFiltered(id:Int):LiveData<MutableList<ItemsModel>>{
        return repository.loadFiltered(id)
    }
}