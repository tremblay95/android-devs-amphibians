package ca.sneakysquid.learnandroid.amphibians.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import ca.sneakysquid.learnandroid.amphibians.AmphibiansApplication
import ca.sneakysquid.learnandroid.amphibians.data.AmphibiansDataRepository
import ca.sneakysquid.learnandroid.amphibians.model.Amphibian
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

sealed interface AmphibianUiState {
    data class Success(val amphibians : List<Amphibian>) : AmphibianUiState
    object Error : AmphibianUiState
    object Loading : AmphibianUiState
}

class AmphibiansViewModel(private val amphibiansDataRepository: AmphibiansDataRepository) : ViewModel() {
    var amphibianUiState : AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)
        private set

    init {
        getAmphibiansData()
    }

    fun getAmphibiansData() {
        viewModelScope.launch {
            amphibianUiState = AmphibianUiState.Loading

            amphibianUiState = try {
                AmphibianUiState.Success(amphibiansDataRepository.getAmphibiansData())
            } catch (e : IOException) {
                AmphibianUiState.Error
            } catch (e : HttpException) {
                AmphibianUiState.Error
            }
        }
    }

    companion object {
        val Factory : ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibiansApplication)
                val amphibiansDataRepository = application.container.amphibiansDataRepository
                AmphibiansViewModel(amphibiansDataRepository = amphibiansDataRepository)
            }
        }
    }
}