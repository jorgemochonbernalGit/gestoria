package gestoria.empleados.data.database.dao

import gestoria.empleados.data.database.entities.ContactoEntity
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ContactoDao {
    @Query("SELECT * FROM contactos")
    suspend fun getAllContactos():List<ContactoEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createContacto(contactos:List<ContactoEntity>)

    @Query("DELETE FROM contactos")
    suspend fun deleteAllContactos()
}