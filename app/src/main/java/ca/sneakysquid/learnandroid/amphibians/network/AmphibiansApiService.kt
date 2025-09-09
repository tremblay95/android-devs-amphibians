package ca.sneakysquid.learnandroid.amphibians.network

import ca.sneakysquid.learnandroid.amphibians.model.Amphibian
import retrofit2.http.GET


interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibians() : List<Amphibian>
}
