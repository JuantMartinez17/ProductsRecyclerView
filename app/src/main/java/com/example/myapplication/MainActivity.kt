package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.ProductsAdapter
import com.example.myapplication.data.ProductsRepository
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflateId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
    }

    private fun initRecycler() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvProducts.layoutManager = layoutManager
        binding.rvProducts.adapter = ProductsAdapter(ProductsRepository.productsList)
        binding.rvProducts.scrollToPosition(Int.MAX_VALUE/2)
    }
}
