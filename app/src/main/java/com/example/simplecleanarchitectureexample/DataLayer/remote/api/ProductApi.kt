package com.example.simplecleanarchitectureexample.DataLayer.remote.api

import com.example.simplecleanarchitectureexample.DataLayer.remote.Dto.ProductDto
import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getAllProduct(): List<ProductDto>
}