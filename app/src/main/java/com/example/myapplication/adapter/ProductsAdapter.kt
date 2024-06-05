package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.data.Products

class ProductsAdapter (val listProducts: List<Products>):RecyclerView.Adapter<ProductsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProductsViewHolder(layoutInflater.inflate(R.layout.products_item, parent, false))
    }

    //Tamaño de la lista
    override fun getItemCount(): Int = Int.MAX_VALUE

    //Toma cada posicion de la lista y la pasa a la clase viewHolder para que la pinte
    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val item = listProducts[position]
        val pos = position % listProducts.size
        holder.bind(listProducts[pos])
        holder.render(item)
    }
}