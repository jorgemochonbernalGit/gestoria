package gestoria.empleados.data.database

import gestoria.empleados.data.database.dao.ContactoDao
import androidx.room.Database
import androidx.room.RoomDatabase
import gestoria.empleados.data.database.entities.ContactoEntity

@Database(
    entities = [ContactoEntity::class], version = 1, exportSchema = false
)
abstract class ContactoDatabase : RoomDatabase() {
    abstract fun getContactos(): ContactoDao
}