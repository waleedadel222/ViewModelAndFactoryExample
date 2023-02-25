package com.waleed.viewmodelfactoryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var normalViewModel = ViewModelProvider(this)[NormalViewModel::class.java]


        //view model with factory
        val myFactoryExample = MyFactoryExample(application)
        var myViewModelWithParameter =
            ViewModelProvider(this, myFactoryExample)[MyViewModelWithParameter::class.java]
    }

}