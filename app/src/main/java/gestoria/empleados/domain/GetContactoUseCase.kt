package gestoria.empleados.domain

import gestoria.empleados.data.ContactoRepository
import gestoria.empleados.data.database.entities.toDatabase
import gestoria.empleados.domain.model.Contacto
import javax.inject.Inject

class GetContactoUseCase @Inject constructor(private val repository: ContactoRepository) {
    suspend operator fun invoke():List<Contacto>{
        val contactos = repository.getAllContactosFromApi()
        return if(contactos.isNotEmpty()){
            repository.clearContactos()
            repository.insertContacto(contactos.map { it.toDatabase() })
            contactos
        }else{
            repository.getAllContactosFromDatabase()
        }
    }
}