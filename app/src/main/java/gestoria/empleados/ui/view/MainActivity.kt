package gestoria.empleados.ui.view

import gestoria.empleados.ui.viewmodel.ContactoViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint
import gestoria.empleados.navegacion.Navegacion
import gestoria.empleados.ui.theme.GestoriaTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val contactoViewModel: ContactoViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        contactoViewModel.onCreate()
        setContent() {
            GestoriaTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navegacion(contactoViewModel)
                }
            }
        }
    }
}

