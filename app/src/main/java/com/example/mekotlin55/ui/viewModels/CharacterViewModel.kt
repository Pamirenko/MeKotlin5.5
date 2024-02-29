package com.example.mekotlin55.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mekotlin55.data.model.DataItem
import com.example.mekotlin55.data.repositories.HarryPotterRepositories
import com.example.mekotlin55.utils.UiState

class CharacterViewModel : ViewModel() {

    private val repository = HarryPotterRepositories()
    private val _characterLiveData = MutableLiveData<UiState<List<DataItem>>>()
    val characterLiveData: LiveData<UiState<List<DataItem>>> = _characterLiveData

    fun searchHarry(query: String) {
        repository.searchHarryPotter(query = query,
            onResponse = { data ->
                _characterLiveData.value = UiState(isLoading = false, success = data)

            },
            onFailure = { t ->
                _characterLiveData.value = UiState(isLoading = false,error = null)
            })
    }
}