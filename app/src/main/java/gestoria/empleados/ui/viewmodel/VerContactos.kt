package gestoria.empleados.ui.viewmodel

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.navigation.NavController
import gestoria.empleados.navegacion.Pantallas

@Composable
fun VerContactos(contactoViewModel: ContactoViewModel, navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "MochonConsult") }
        }
    ) {
        val TAG = "pruebas"
        val contactos by contactoViewModel.contactoModel.observeAsState()
        Log.w(TAG, contactoViewModel.randomContacto().toString())
        Column() {
            contactos?.let { Text(text = "Nombre " + it.nombre) }
            contactos?.let { Text(text = "Foto " + it.foto) }
            contactos?.let { Text(text = "Numero " + it.numero) }
            Button(onClick = { navController.navigate(route = Pantallas.VerContacto.route) }) {
                Text(text = "Ver contacto")
            }
        }
    }
}


