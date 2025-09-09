package ca.sneakysquid.learnandroid.amphibians.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ca.sneakysquid.learnandroid.amphibians.network.AmphibianApi
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

sealed interface AmphibianUiState {
    data class Success(val amphibians : String) : AmphibianUiState
    object Error : AmphibianUiState
    object Loading : AmphibianUiState
}

class AmphibiansViewModel : ViewModel() {
    var amphibianUiState : AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)
        private set

    init {
        getAmphibiansData()
    }

    fun getAmphibiansData() {
        viewModelScope.launch {
            amphibianUiState = AmphibianUiState.Loading

            amphibianUiState = try {
                val listResult = AmphibianApi.retrofitService.getAmphibians()
                AmphibianUiState.Success(
                    "Success: ${listResult.size} amphibians retrieved."
                )
            } catch (e : IOException) {
                AmphibianUiState.Error
            } catch (e : HttpException) {
                AmphibianUiState.Error
            }
        }
    }
}