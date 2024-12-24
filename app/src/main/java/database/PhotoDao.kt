package database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bignerdranch.android.photogallery.GalleryItem

@Dao
interface PhotoDao {

    @Query("SELECT * FROM galleryitem")
    fun getPhotos(): LiveData<List<GalleryItem>>

    @Query("SELECT * FROM galleryitem WHERE id = :id")
    fun getPhoto(id: String): LiveData<GalleryItem?>

    @Insert
    fun addCrime(galleryItem: GalleryItem)

    // Исправленный метод
    @Query("DELETE FROM galleryitem")
    fun delPhotos(): Int // Возвращает количество удалённых строк
}