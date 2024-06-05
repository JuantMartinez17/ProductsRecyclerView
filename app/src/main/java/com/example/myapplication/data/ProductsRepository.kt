package com.example.myapplication.data

import com.example.myapplication.data.Products

class ProductsRepository {

    companion object {
        val productsList = listOf<Products>(
            Products(
                name = "Product Name 1",
                category = "Category 1",
                price = 100.50F,
                stock = 5
            ),
            Products(
                name = "Product Name 2",
                category = "Category 2",
                price = 200.75F,
                stock = 8
            ),
            Products(
                name = "Product Name 3",
                category = "Category 3",
                price = 200.99F,
                stock = 10
            ),
            Products(
                name = "Product Name 4",
                category = "Category 4",
                price = 350.50F,
                stock = 18
            ),
            Products(
                name = "Product Name 5",
                category = "Category 5",
                price = 50.75F,
                stock = 22
            ),
            Products(
                name = "Product Name 6",
                category = "Category 6",
                price = 75.99F,
                stock = 6
            ),
            Products(
                name = "Product Name 7",
                category = "Category 7",
                price = 25.50F,
                stock = 10
            ),
            Products(
                name = "Product Name 8",
                category = "Category 8",
                price = 200.75F,
                stock = 11
            ),
            Products(
                name = "Product Name 9",
                category = "Category 9",
                price = 140.99F,
                stock = 9
            ),
            Products(
                name = "Product Name 10",
                category = "Category 10",
                price = 150.50F,
                stock = 15
            )
        )
    }
}