package com.example.simplecleanarchitectureexample.DataLayer.mapper

import com.example.simplecleanarchitectureexample.DataLayer.remote.Dto.ProductDto
import com.example.simplecleanarchitectureexample.DomainLayer.model.Product

fun ProductDto.toDomain() : Product{
    return Product(id, title, price)
}