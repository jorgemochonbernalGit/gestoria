package gestoria.empleados.ui.viewmodel

import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import gestoria.empleados.navegacion.Pantallas

@Composable
fun VerContacto(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "MochonConsult") }
        }
    ) {
        Button(onClick = { navController.navigate(route = Pantallas.VerContactos.route) }) {
            Text(text = "Volver a contactos")
        }
    }
}