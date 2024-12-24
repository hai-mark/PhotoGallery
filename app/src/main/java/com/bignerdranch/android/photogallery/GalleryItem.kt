package com.bignerdranch.android.photogallery

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "galleryitem")
class GalleryItem
    (var title: String, var url: String, var owner: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}