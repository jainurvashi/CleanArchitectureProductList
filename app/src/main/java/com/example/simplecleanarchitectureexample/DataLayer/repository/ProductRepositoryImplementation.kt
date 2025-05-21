package com.example.simplecleanarchitectureexample.DataLayer.repository

import com.example.simplecleanarchitectureexample.DataLayer.mapper.toDomain
import com.example.simplecleanarchitectureexample.DataLayer.remote.api.ProductApi
import com.example.simplecleanarchitectureexample.DomainLayer.Repository.ProductRepository
import com.example.simplecleanarchitectureexample.DomainLayer.model.Product
import javax.inject.Inject

class ProductRepositoryImplementation @Inject constructor
   (private val api: ProductApi) : ProductRepository {
    override suspend fun getProduct(): List<Product> {
        return api.getAllProduct().map { it.toDomain() }
    }
}