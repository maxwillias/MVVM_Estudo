package com.example.mvvmestudo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmestudo.adapters.MainAdapter
import com.example.mvvmestudo.databinding.ActivityMainBinding
import com.example.mvvmestudo.repositories.MainRepository
import com.example.mvvmestudo.rest.RetrofitService
import com.example.mvvmestudo.viewmodel.main.MainViewModel
import com.example.mvvmestudo.viewmodel.main.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    lateinit var viewModel : MainViewModel

    private val retrofitService = RetrofitService.getInstance()

    private val adapter = MainAdapter{
        openLink(it.link)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel =
            ViewModelProvider(this, MainViewModelFactory(MainRepository(retrofitService))).get(
            MainViewModel::class.java
        )

        binding.recyclerview.adapter = adapter

    }

    override fun onStart() {
        super.onStart()

        viewModel.livelist.observe(this, Observer{ lives ->
            Log.i("Max", "onStart")
            adapter.setLiveList(lives)
        })

        viewModel.errorMessage.observe(this, Observer{ message ->
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        })
    }

    override fun onResume() {
        super.onResume()

        viewModel.getAllLives()
    }

    private fun openLink(link : String){
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(browserIntent)
    }
}