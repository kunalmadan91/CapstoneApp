package com.example.capstoneapp.ui

import androidx.lifecycle.ViewModel
import com.example.capstoneapp.repository.MyRepository

class MainViewModel : ViewModel() {

    fun getData(){
        MyRepository.fetchData()
    }
    // TODO: Implement the ViewModel
}
