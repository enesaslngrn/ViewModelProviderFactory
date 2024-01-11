package com.enesas.viewmodelproviderfactory.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.enesas.viewmodelproviderfactory.databinding.ActivityMainBinding
import com.enesas.viewmodelproviderfactory.viewmodel.ViewModel1
import com.enesas.viewmodelproviderfactory.viewmodel.ViewModel2
import com.enesas.viewmodelproviderfactory.viewmodel.ViewModel2ProviderFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel1: ViewModel1
    private lateinit var viewModel2: ViewModel2

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        viewModel1 = ViewModelProvider(this).get(ViewModel1::class.java)
        viewModel1.viewModel1Fonksiyyonu()

        // ViewModel2 için bir instance oluşturamam çünkü ViewModel2'de bir constructor nesnesi var.
        // O yüzden onu ViewModelProviderFactory ile düzenlemem gerek. Yani bir constructor eklemek istiyorsan viewmodel'a.

        val viewModelProviderFactory = ViewModel2ProviderFactory(10) // Mesela 10 gönderelim içine
        viewModel2 = ViewModelProvider(this, viewModelProviderFactory).get(ViewModel2::class.java)
        viewModel2.viewModel2Fonksiyyonu()
    }
}