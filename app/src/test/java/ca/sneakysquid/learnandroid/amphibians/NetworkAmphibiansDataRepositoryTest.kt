package ca.sneakysquid.learnandroid.amphibians

import ca.sneakysquid.learnandroid.amphibians.data.NetworkAmphibiansDataRepository
import ca.sneakysquid.learnandroid.amphibians.fake.FakeAmphibiansApiService
import ca.sneakysquid.learnandroid.amphibians.fake.FakeDataSource
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class NetworkAmphibiansDataRepositoryTest {
    @Test
    fun networkAmphibiansDataRepository_getAmphibiansData_verifyAmphibiansList() = runTest {
        val repository = NetworkAmphibiansDataRepository(
            amphibiansApiService = FakeAmphibiansApiService()
        )
        assertEquals(FakeDataSource.amphibiansList, repository.getAmphibiansData())
    }
}
