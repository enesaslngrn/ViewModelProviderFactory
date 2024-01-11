package com.enesas.viewmodelproviderfactory.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModel2ProviderFactory(val sayi : Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel2(sayi) as T
    }

}