package ca.sneakysquid.learnandroid.amphibians.data

import ca.sneakysquid.learnandroid.amphibians.model.Amphibian
import ca.sneakysquid.learnandroid.amphibians.network.AmphibiansApiService

interface AmphibiansDataRepository {
    suspend fun getAmphibiansData() : List<Amphibian>
}

class NetworkAmphibiansDataRepository(private val amphibiansApiService: AmphibiansApiService) : AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
