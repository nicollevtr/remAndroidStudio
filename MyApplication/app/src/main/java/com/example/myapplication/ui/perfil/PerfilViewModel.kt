package com.example.myapplication.ui.perfil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PerfilViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "pagina que aparecera o perfil, adicionar meios de editar o perfil, idade, nome..."
    }
    val text: LiveData<String> = _text
}