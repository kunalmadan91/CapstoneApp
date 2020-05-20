package com.example.capstoneapp.ui

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.capstoneapp.repository.MyRepository

class MainViewModel (val application: Application) : ViewModel() {

     var mRepository: MyRepository
    init {
        mRepository = MyRepository(application)
    }
    fun getDataFromRepository(){
        if (mRepository.getConnection()) {
            Toast.makeText(application,"internet", Toast.LENGTH_LONG).show()
           // getDataFromRepo(false)
        } else {
            //getDataFromRepo(true)
        }
    }
    // TODO: Implement the ViewModel
}
