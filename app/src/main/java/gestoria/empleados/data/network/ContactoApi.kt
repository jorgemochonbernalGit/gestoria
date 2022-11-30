package gestoria.empleados.data.network

import gestoria.empleados.data.model.ContactoModel
import retrofit2.Response
import retrofit2.http.GET

interface ContactoApi {
    @GET("/p")
    suspend fun getAllQuotes(): Response<List<ContactoModel>>
}