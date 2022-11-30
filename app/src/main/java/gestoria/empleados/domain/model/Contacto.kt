package gestoria.empleados.domain.model

import gestoria.empleados.data.database.entities.ContactoEntity
import gestoria.empleados.data.model.ContactoModel
import gestoria.empleados.ui.viewmodel.ContactoViewModel

data class Contacto(val nombre: String, val foto: String, val numero: Int)

fun ContactoModel.toDomain() = Contacto(nombre, foto, numero)
fun ContactoEntity.toDomain() = Contacto(nombre, foto, numero)