package com.bignerdranch.android.photogallery

import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class GalleryItem(
    @PrimaryKey var id: String = "",
    var title: String = "",
    @SerializedName("url_s") var url: String = ""
)