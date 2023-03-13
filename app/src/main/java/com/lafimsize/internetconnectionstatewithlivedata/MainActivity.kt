package com.lafimsize.internetconnectionstatewithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var connectivityLiveData: ConnectivityLiveData2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkNetworkConnections()

    }



    fun checkNetworkConnections(){

        connectivityLiveData=ConnectivityLiveData2(application)


        connectivityLiveData.observe(this){
            if (it){
                println("İnternete bağlı!")
            }else{
                println(it)
            }
        }
    }
}