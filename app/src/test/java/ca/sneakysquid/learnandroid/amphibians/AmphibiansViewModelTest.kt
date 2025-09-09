package ca.sneakysquid.learnandroid.amphibians

import ca.sneakysquid.learnandroid.amphibians.fake.FakeDataSource
import ca.sneakysquid.learnandroid.amphibians.fake.FakeNetworkAmphibiansDataRepository
import ca.sneakysquid.learnandroid.amphibians.rules.TestDispatcherRule
import ca.sneakysquid.learnandroid.amphibians.ui.screens.AmphibianUiState
import ca.sneakysquid.learnandroid.amphibians.ui.screens.AmphibiansViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class AmphibiansViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun amphibiansViewModelTest_getAmphibiansData_verifyAmphibianUiStateSuccess() = runTest {
        val amphibiansViewModel = AmphibiansViewModel(
            amphibiansDataRepository = FakeNetworkAmphibiansDataRepository()
        )

        assertEquals(
            AmphibianUiState.Success(FakeDataSource.amphibiansList),
            amphibiansViewModel.amphibianUiState
        )
    }
}
