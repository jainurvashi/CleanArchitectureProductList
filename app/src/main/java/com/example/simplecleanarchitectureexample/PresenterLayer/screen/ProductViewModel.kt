package com.example.simplecleanarchitectureexample.PresenterLayer.screen

import androidx.compose.runtime.mutableStateOf
import com.example.simplecleanarchitectureexample.DomainLayer.model.Product
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplecleanarchitectureexample.DomainLayer.useCases.GetProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel@Inject constructor(private val useCase: GetProductUseCase): ViewModel() {
    var products by mutableStateOf<List<Product>>(emptyList())
    init {
        viewModelScope.launch{
            products = useCase.getProduct()
        }

    }
}