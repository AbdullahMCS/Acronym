package com.example.acronym.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.acronym.data.remote.AcronymApi
import com.example.acronym.util.NetworkResult
import kotlinx.coroutines.launch

class AcronymViewModel(
    private val acronymApi: AcronymApi
) : ViewModel() {

    private val _meanings: MutableLiveData<NetworkResult> = MutableLiveData()
    val meanings: LiveData<NetworkResult> get() = _meanings

    fun getMeanings(acronym: String) {
        viewModelScope.launch {
            _meanings.value = NetworkResult.SUCCESS(acronymApi.getMeanings(acronym))
        }
    }
}