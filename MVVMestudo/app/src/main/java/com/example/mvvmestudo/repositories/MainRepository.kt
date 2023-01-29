package com.example.mvvmestudo.repositories

import com.example.mvvmestudo.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllLives() = retrofitService.getAllLives()

}