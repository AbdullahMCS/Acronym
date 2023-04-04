package com.example.acronym.util

import com.example.acronym.data.model.AcronymResponse

sealed class NetworkResult {
    data class SUCCESS(val response: AcronymResponse) : NetworkResult()
    data class ERROR(val error: Exception) : NetworkResult()
    object LOADING : NetworkResult()
}