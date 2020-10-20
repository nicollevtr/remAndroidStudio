package com.example.myapplication.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "pagina que aprecera pesquisa, adicionar caminho para pesquisar no google"
    }
    val text: LiveData<String> = _text
}