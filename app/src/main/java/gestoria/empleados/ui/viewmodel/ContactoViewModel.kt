package gestoria.empleados.ui.viewmodel

import gestoria.empleados.domain.GetContactoUseCase
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import gestoria.empleados.domain.GetRandomContactoUseCase
import gestoria.empleados.domain.model.Contacto
import android.util.Log
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactoViewModel @Inject constructor(
    private val getContactoUseCase: GetContactoUseCase,
    private val getRandomContactoUseCase: GetRandomContactoUseCase
) : ViewModel() {
    val contactoModel = MutableLiveData<Contacto?>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getContactoUseCase()

            if (!result.isNullOrEmpty()) {
                contactoModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomContacto() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val contacto = getRandomContactoUseCase()
            if (contacto != null) {
                contactoModel.value = contacto
            }
            isLoading.postValue(false)
        }
    }
}