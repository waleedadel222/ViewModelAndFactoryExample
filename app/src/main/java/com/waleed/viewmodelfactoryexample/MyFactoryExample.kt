package com.waleed.viewmodelfactoryexample

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MyFactoryExample(var app: Application) : ViewModelProvider.Factory {

    override fun <T:ViewModel> create(modelClass: Class<T>):T{

        if(modelClass.isAssignableFrom(MyViewModelWithParameter::class.java)){

            @Suppress("UNCHECKED_CAST")
            return MyViewModelWithParameter(app) as T
        }

        throw IllegalArgumentException("UNKNOWN VIEW MODEL CLASS")
    }
}