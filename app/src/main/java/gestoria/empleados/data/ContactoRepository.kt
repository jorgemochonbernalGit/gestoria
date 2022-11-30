package gestoria.empleados.data

import gestoria.empleados.data.database.dao.ContactoDao
import gestoria.empleados.data.database.entities.ContactoEntity
import gestoria.empleados.data.model.ContactoModel
import gestoria.empleados.data.network.ContactoSerivce
import gestoria.empleados.domain.model.Contacto
import gestoria.empleados.domain.model.toDomain
import javax.inject.Inject

class ContactoRepository @Inject constructor(
    private val api: ContactoSerivce,
    private val contactoDao: ContactoDao
) {

    suspend fun getAllContactosFromApi(): List<Contacto> {
        val response: List<ContactoModel> = api.getContactos()
        return response.map { it.toDomain() }
    }

    suspend fun getAllContactosFromDatabase(): List<Contacto> {
        val response: List<ContactoEntity> = contactoDao.getAllContactos()
        return response.map { it.toDomain() }
    }

    suspend fun insertContacto(contactos: List<ContactoEntity>) {
        contactoDao.createContacto(contactos)
    }

    suspend fun clearContactos() {
        contactoDao.deleteAllContactos()
    }
}