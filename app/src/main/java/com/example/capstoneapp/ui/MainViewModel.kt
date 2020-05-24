package com.example.capstoneapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.capstoneapp.network.MarsApi
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

     /*var mRepository: MyRepository
    init {
        mRepository = MyRepository(application)
    }*/
    fun getDataFromRepository(){
         viewModelScope.launch {
             var getPropertiesDeferred = MarsApi.retrofitService.getPopularMoviesAsync("283d14b1c04d04d3c6978ab1c2c5d310")

             var listResult = getPropertiesDeferred.body()
         }
        /*if (mRepository.getConnection()) {
            Toast.makeText(application,"internet", Toast.LENGTH_LONG).show()
           // getDataFromRepo(false)
        } else {
            //getDataFromRepo(true)
        }*/
    }
    // TODO: Implement the ViewModel
}
