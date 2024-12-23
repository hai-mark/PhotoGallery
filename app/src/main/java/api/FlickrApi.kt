package api


import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=9f262b8cda16e306c535932c0fca8bbe" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}