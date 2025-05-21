package com.example.simplecleanarchitectureexample.PresenterLayer.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.simplecleanarchitectureexample.DomainLayer.model.Product


@Composable
fun ProductScreen(products: List<Product>,modifier: Modifier) {
    LazyColumn {
        items(products) { product ->
            Card(modifier = modifier,
                elevation = CardDefaults.cardElevation(4.dp)
                ){
                Text(text = product.title, modifier = modifier)
            }


        }
    }
}

// Production usage
@Composable
fun ProductScreenContainer(viewModel: ProductViewModel = hiltViewModel()) {
    ProductScreen(products = viewModel.products, modifier = Modifier.padding(8.dp).fillMaxWidth())
}

