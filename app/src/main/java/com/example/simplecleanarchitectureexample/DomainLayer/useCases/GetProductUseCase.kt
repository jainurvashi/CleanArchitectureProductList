package com.example.simplecleanarchitectureexample.DomainLayer.useCases

import com.example.simplecleanarchitectureexample.DomainLayer.Repository.ProductRepository
import com.example.simplecleanarchitectureexample.DomainLayer.model.Product
import javax.inject.Inject

// contains business logic
// one class= one work
class GetProductUseCase @Inject constructor(private val repository: ProductRepository) {
    suspend fun getProduct(): List<Product> {
        return repository.getProduct()
    }
}