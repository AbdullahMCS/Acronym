package com.example.acronym.util

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("meaningList")
fun bindNewMeanings(
    recyclerView: RecyclerView,
    networkResult: NetworkResult
) {
    when (networkResult) {
        is NetworkResult.LOADING -> {  }
        is NetworkResult.SUCCESS -> {  }
        is NetworkResult.ERROR -> {  }
    }
}