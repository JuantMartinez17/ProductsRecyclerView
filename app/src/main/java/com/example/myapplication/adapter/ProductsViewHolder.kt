package com.example.myapplication.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.Products
import com.example.myapplication.databinding.ProductsItemBinding

class ProductsViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding:ProductsItemBinding = ProductsItemBinding.bind(view)

    fun render(product: Products){
        binding.tvProductName.text = product.name
        binding.tvProductCategory.text = product.category
        binding.tvProductPrice.text = product.price.toString()
        binding.tvProductStock.text = product.stock.toString()
    }

    fun bind(products: Products) {

    }
}