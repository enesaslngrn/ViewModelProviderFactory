package com.enesas.viewmodelproviderfactory.viewmodel

import androidx.lifecycle.ViewModel

class ViewModel2 (val sayi : Int): ViewModel() {

    fun viewModel2Fonksiyyonu() = println("ViewModel2'den geldim: $sayi")
}