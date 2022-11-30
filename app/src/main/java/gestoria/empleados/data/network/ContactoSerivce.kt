package gestoria.empleados.data.network

import gestoria.empleados.data.model.ContactoModel
import gestoria.empleados.data.network.ContactoApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ContactoSerivce @Inject constructor(private val api: ContactoApi) {
    suspend fun getContactos(): List<ContactoModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }
}