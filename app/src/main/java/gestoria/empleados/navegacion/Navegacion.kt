package gestoria.empleados.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import gestoria.empleados.ui.viewmodel.ContactoViewModel
import gestoria.empleados.ui.viewmodel.VerContacto
import gestoria.empleados.ui.viewmodel.VerContactos

@Composable
fun Navegacion(contactoViewModel: ContactoViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Pantallas.VerContactos.route) {
        composable(route = Pantallas.VerContactos.route) {
            VerContactos(contactoViewModel, navController)
        }
        composable(route = Pantallas.VerContacto.route) {
            VerContacto(navController)
        }
    }
}