package gestoria.empleados.data.model

import com.google.gson.annotations.SerializedName

data class ContactoModel(
    @SerializedName("nombre") val nombre: String,
    @SerializedName("foto") val foto: String,
    @SerializedName("numero") val numero: Int
)