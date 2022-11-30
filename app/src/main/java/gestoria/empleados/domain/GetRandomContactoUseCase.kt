package gestoria.empleados.domain

import gestoria.empleados.data.ContactoRepository
import gestoria.empleados.domain.model.Contacto
import javax.inject.Inject

class GetRandomContactoUseCase @Inject constructor(private val repository: ContactoRepository) {
    suspend operator fun invoke(): Contacto? {
        val contactos = repository.getAllContactosFromDatabase()
        if (!contactos.isNullOrEmpty()) {
            val randomNumber = (contactos.indices).random()
            return contactos[0]
        }
        return null
    }
}