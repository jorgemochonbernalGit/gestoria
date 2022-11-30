package gestoria.empleados.data.database.entities

import gestoria.empleados.domain.model.Contacto
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contactos")
data class ContactoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "nombre") val nombre: String,
    @ColumnInfo(name = "foto") val foto: String,
    @ColumnInfo(name = "numero") val numero: Int

)

fun Contacto.toDatabase() = ContactoEntity(nombre = nombre, foto = foto,numero = numero)