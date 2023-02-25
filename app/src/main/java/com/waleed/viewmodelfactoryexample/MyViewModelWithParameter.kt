package com.waleed.viewmodelfactoryexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel

// can extend the normal ViewModel class also
class MyViewModelWithParameter(application: Application) :AndroidViewModel(application) {

    //can use application with services like room or remote database

}