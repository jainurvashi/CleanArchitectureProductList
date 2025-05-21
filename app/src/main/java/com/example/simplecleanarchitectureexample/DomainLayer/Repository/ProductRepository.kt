package com.example.simplecleanarchitectureexample.DomainLayer.Repository

import com.example.simplecleanarchitectureexample.DomainLayer.model.Product

interface ProductRepository {
    suspend fun getProduct(): List<Product>
}