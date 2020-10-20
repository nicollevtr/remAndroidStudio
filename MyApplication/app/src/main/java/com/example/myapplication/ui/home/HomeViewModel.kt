package com.example.myapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "pagina que aparecerao os remedios, com botao para adicionar remedio, que leva para outra pag"
    }
    val text: LiveData<String> = _text
}