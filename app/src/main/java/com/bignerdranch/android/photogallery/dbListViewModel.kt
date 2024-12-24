package com.bignerdranch.android.photogallery

import androidx.lifecycle.ViewModel

class dbListViewModel : ViewModel() {
    private val crimeRepository = PhotoRepository.get()
    val photoListLiveData = crimeRepository.getPhotos()
}