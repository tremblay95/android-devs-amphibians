package ca.sneakysquid.learnandroid.amphibians.fake

import ca.sneakysquid.learnandroid.amphibians.data.AmphibiansDataRepository
import ca.sneakysquid.learnandroid.amphibians.model.Amphibian

class FakeNetworkAmphibiansDataRepository : AmphibiansDataRepository {
    override suspend fun getAmphibiansData(): List<Amphibian> {
        return FakeDataSource.amphibiansList
    }
}
