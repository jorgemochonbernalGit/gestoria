package gestoria.empleados.navegacion

sealed class Pantallas(val route: String) {
    object VerContactos: Pantallas("ver_contactos")
    object VerContacto : Pantallas("ver_contacto")
}