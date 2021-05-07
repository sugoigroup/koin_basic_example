package com.sugoigroup.del1.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sugoigroup.del1.domain.usecase.DashboardUsecase
import org.koin.core.KoinComponent
import org.koin.core.inject

class DashboardViewModel : ViewModel(), KoinComponent {

     private val usecase: DashboardUsecase by inject()

    private val _text = MutableLiveData<String>().apply {
        value = "This is dash Fragment"
    }
    val text: LiveData<String> = _text

    fun change() {
        _text.postValue(usecase.changeText())
    }
}