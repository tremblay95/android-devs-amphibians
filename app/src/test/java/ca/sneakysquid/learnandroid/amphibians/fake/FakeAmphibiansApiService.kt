package ca.sneakysquid.learnandroid.amphibians.fake

import ca.sneakysquid.learnandroid.amphibians.model.Amphibian
import ca.sneakysquid.learnandroid.amphibians.network.AmphibiansApiService

class FakeAmphibiansApiService : AmphibiansApiService {
    override suspend fun getAmphibians(): List<Amphibian> {
        return FakeDataSource.amphibiansList
    }
}
