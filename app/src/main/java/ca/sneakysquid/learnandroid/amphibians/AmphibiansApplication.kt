package ca.sneakysquid.learnandroid.amphibians

import android.app.Application
import ca.sneakysquid.learnandroid.amphibians.data.AppContainer
import ca.sneakysquid.learnandroid.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
